package org.jcanomedina.blog;

public class Company {

	private int id ;
	private String name ;
	private double debt ;
	private double equity ;
	
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
}
