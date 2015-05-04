package org.jcanomedina.blog;

import java.util.Map;

import org.apache.camel.Properties;

public class DynamicRouter {
	/**
	 * Use this method to compute dynamic where we should route next.
	 *
	 * @param body the message body
	 * @param properties the exchange properties where we can store state between invocations
	 * @return endpoints to go, or <tt>null</tt> to indicate the end
	 */
	public String slip(String body, @Properties Map<String, Object> properties) {
		// properties.add(body);
	 
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
	        return "mock:a";
	    } else if (invoked == 2) {
	        return "mock:b,mock:c";
	    } else if (invoked == 3) {
	        return "direct:foo";
	    } else if (invoked == 4) {
	        return "mock:result";
	    }
	 
	    // no more so return null
	    return null;
	}
}
