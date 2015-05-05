package org.jcanomedina.blog;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import org.jcanomedina.blog.interfaces.ICompanyService;
import org.springframework.stereotype.Service;

@Service
public class CompanyService implements ICompanyService {
	
    // use a tree map so they become sorted
    private final Map<Integer, Company> companies = new TreeMap<Integer, Company>();
    private double eqratioLimit = 10 ;

    public CompanyService() {
    	companies.put(100, new Company(100, "GFT", 150, 300)) ; 
    	companies.put(200, new Company(200, "Indra", 1550, 300)) ; 
    }

    /* (non-Javadoc)
	 * @see org.jcanomedina.blog.ICompanyService#getCompany(int)
	 */
    @Override
	public Company getCompany(int id) {
        return companies.get(id);
    }

    /* (non-Javadoc)
	 * @see org.jcanomedina.blog.ICompanyService#listCompanies()
	 */
    @Override
	public Collection<Company> listCompanies() {
        return companies.values();
    }

    /* (non-Javadoc)
	 * @see org.jcanomedina.blog.ICompanyService#addCompany(org.jcanomedina.blog.Company)
	 */
    @Override
	public void addCompany (Company c) {
    	companies.put(c.getId(), c) ;
    }
    
    /* (non-Javadoc)
	 * @see org.jcanomedina.blog.ICompanyService#setRatio(double)
	 */
    @Override
	public void setRatio (double ratio) {
    	eqratioLimit = ratio ;
    }
    
    /* (non-Javadoc)
	 * @see org.jcanomedina.blog.ICompanyService#getRatio()
	 */
    @Override
	public double getRatio() {
    	return eqratioLimit ;
    }
}
