package org.java.animal;

import org.java.action.Ivolante;
import org.java.nature.Animale;

public class Passerotto extends Animale implements Ivolante {


String v= "cip cip!";
String food="vermi, semi, e bacche che trovo nei cespugli";

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
        return super.toString() + " Sono un passerotto!" + "\nMangio " + food + "\nE comunico facendo: " + v +  "\n";
    }

	@Override
	public void vola() {
		// TODO Auto-generated method stub
		
	}
}


