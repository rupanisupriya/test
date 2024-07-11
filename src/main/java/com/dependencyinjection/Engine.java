package com.dependencyinjection;

public class Engine {
	
	int cc;
	int milege;
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getMilege() {
		return milege;
	}
	public void setMilege(int milege) {
		this.milege = milege;
	}
	public Engine(int cc, int milege) {
		super();
		this.cc = cc;
		this.milege = milege;
	}
	@Override
	public String toString() {
		return "Engine [cc=" + cc + ", milege=" + milege + "]";
	}
	


}
