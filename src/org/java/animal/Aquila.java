package org.java.animal;

import org.java.action.Inuotante;
import org.java.action.Ivolante;
import org.java.nature.Animale;

public class Aquila extends Animale implements Ivolante, Inuotante {

	String v= "Screeech!";
	String food="pesci, conigli e altre prede varie ";
	
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
		
		return super.toString() + " Sono un aquila!" + "\nmangio " + food + "\ne comunico facendo: " + v + "\n";  
	}

	@Override
	public void nuota() {
	
		System.out.println("Sto nuotando!!");
	}

	@Override
	public void vola() {
		
		System.out.println("Sto Volando!!");
		
	}
	
	
}

