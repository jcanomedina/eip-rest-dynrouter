package org.jcanomedina.blog;

import java.io.Serializable;

public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 241887222461182257L;
	
	private int id ;
	private String name ;
	private double debt ;
	private double equity ;
	private double eqratio ;
	
	public Company() { } 
	
	public Company(int id, String name, double debt, double equity) {
		super();
		this.id = id;
		this.name = name;
		this.debt = debt;
		this.equity = equity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDebt() {
		return debt;
	}
	public void setDebt(double debt) {
		this.debt = debt;
	}
	public double getEquity() {
		return equity;
	}
	public void setEquity(double equity) {
		this.equity = equity;
	}
	
	/**
	 * The debt-to-equity ratio (D/E) is a financial ratio indicating the relative proportion of shareholders' equity and debt used to finance a company's assets.
	 * {@link http://en.wikipedia.org/wiki/Debt-to-equity_ratio}
	 * 
	 * @return double
	 */
	public double getEQRatio() {
		eqratio = 0 ;
		if (equity > 0)
			eqratio = debt / equity ;
		return eqratio ;
	}
}
