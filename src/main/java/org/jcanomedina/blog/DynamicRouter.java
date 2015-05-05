package org.jcanomedina.blog;

import java.util.Map;

import org.apache.camel.Properties;
import org.apache.log4j.Logger;
import org.jcanomedina.blog.interfaces.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DynamicRouter {

	@Autowired
	ICompanyService service ;
	
	/**
	 * Use this method to compute dynamic where we should route next.
	 *
	 * @param body the message body
	 * @param properties the exchange properties where we can store state between invocations
	 * @return endpoints to go, or <tt>null</tt> to indicate the end
	 */
	public String slip(Company company, @Properties Map<String, Object> properties) {
		
		Logger log = Logger.getLogger(getClass()) ;

	    // get the state from the exchange properties and keep track how many times
	    // we have been invoked
	    int invoked = 0;
	    Object current = properties.get("invoked");
	    if (current != null) {
	        invoked = Integer.valueOf(current.toString());
	    }
	    invoked++;
	    // and store the state back on the properties
	    properties.put("invoked", invoked);
	 
		if (invoked == 1) {
			if (company.getEQRatio() < service.getRatio()) { 
				log.info("invoked="+invoked+" body: "+company+" CompanyEQRatio: "+company.getEQRatio()+" Ratio: "+service.getRatio());
				return "direct:queueProfitCompany";
			}
			else return "mock:a";
		}
		
	    // no more so return null
	    return null;
	}
}
