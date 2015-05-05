package org.jcanomedina.blog.interfaces;

import java.util.Collection;

import org.jcanomedina.blog.Company;

public interface ICompanyService {

	public abstract Company getCompany(int id);

	public abstract Collection<Company> listCompanies();

	public abstract void addCompany(Company c);

	public abstract void setRatio(double ratio);

	public abstract double getRatio();

}