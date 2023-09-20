package org.java.animal;

import org.java.action.Inuotante;
import org.java.nature.Animale;

public class Delfino extends Animale implements Inuotante {

	String v= "Eee-eee-eee!";
	String food="pesce ";
	
    @Override
    public void verso() {
        System.out.println(v);
    }

    @Override
    public void mangia() {
        System.out.println(food);
    }

	@Override
	public String toString() {
		
		return super.toString() + " Sono un delfino!" + "\nmangio " + food + "\ne comunico facendo: " + v+ "\n"; 
	}

	@Override
	public void nuota() {
		// TODO Auto-generated method stub
		
	}
	
	
}

