package org.java.nature;

public abstract class Animale {
	

	public abstract void verso();
	
	public abstract void mangia();	
	
	public void dormi() {
	
		System.out.println("Zzzz...");
		 
	}


	
	@Override
	public String toString() {
		
		return "ciao!";
	}
}
