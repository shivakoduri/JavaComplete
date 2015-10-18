package com.myprojects.examples.designpatterns.creational.prototype.two;

public class OrcBeast extends Beast {

	public OrcBeast() {
		// TODO Auto-generated constructor stub
	}
	
	public OrcBeast(OrcBeast orcBeast){
		
	}
	
	@Override
	protected Beast clone() throws CloneNotSupportedException {
		return new OrcBeast(this);
	}
	
	@Override
	public String toString() {
		return "Orcish wolf";
	}
}
