package org.jcanomedina.blog;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class CompanyService {
	
    // use a tree map so they become sorted
    private final Map<Integer, Company> companies = new TreeMap<Integer, Company>();

    public CompanyService() {
    	companies.put(100, new Company(100, "GFT", 150, 300)) ; 
    	companies.put(200, new Company(200, "Indra", 1550, 300)) ; 
    }

    public Company getCompany(int id) {
        return companies.get(id);
    }

    public Collection<Company> listCompanies() {
        return companies.values();
    }

    public void addCompany (Company c) {
    	companies.put(c.getId(), c) ;
    }
}
