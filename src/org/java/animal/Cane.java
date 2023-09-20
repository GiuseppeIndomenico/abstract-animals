package org.java.animal;
import org.java.action.Inuotante;
import org.java.nature.Animale;

public class Cane extends Animale implements Inuotante{

    String v = "Bau Bau!";
    String food = "principalmente carne";

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
        return super.toString() + " Sono un cane!" + "\nMangio " + food + "\nE comunico facendo: " + v + "\n";
    }

	@Override
	public void nuota() {
		// TODO Auto-generated method stub
		
	}
}
