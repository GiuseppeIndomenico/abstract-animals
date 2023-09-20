package org.java.animal;

import org.java.action.Inuotante;
import org.java.action.Ivolante;
import org.java.nature.Animale;


public class Main {

    public static void faiVolare(Ivolante animale) {
        animale.vola();
    }

    public static void faiNuotare(Inuotante animale) {
        animale.nuota();
    }
    
    public static void main(String[] args) {
        Animale c = new Cane();
        Animale p = new Passerotto();
        Animale a = new Aquila();
        Animale d = new Delfino();

        Animale[] animale= new Animale[4];
        
        animale[0]=c;
        animale[1]=p;
        animale[2]=a;
        animale[3]=d;
        
        for (int x = 0; x < animale.length; x++) {
            Animale an = animale[x];
            System.out.println(an);

            if (an instanceof Ivolante) {
                System.out.println("Sto volando!");
            }

            if (an instanceof Inuotante) {
                System.out.println("Sto nuotando!");
            }
            System.out.println("\n--------------\n");
        }



        }
      


       
    }


