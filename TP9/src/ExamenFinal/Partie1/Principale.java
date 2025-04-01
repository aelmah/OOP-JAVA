package ExamenFinal.Partie1;

import java.util.ArrayList;

public class Principale {
    public static void main(String[] args) {
        //Done in about 30min
        //a
        Cercle cercle1 = new Cercle(4,3,4.5);
        //b
        cercle1.setRayon(3.9);
        //c
        cercle1.afficher();
        System.out.println();
        //d
        Rectangle rectangle1 = new Rectangle(1,4,8,7);
        //e
        rectangle1.setLongueur(6);
        rectangle1.setLargeur(5);
        //f
        rectangle1.deplacer(3.5,2.5);
        //g
        rectangle1.afficher();
        System.out.println();
        //h
        ArrayList<Cercle> cercles = new ArrayList<>();
        cercles.add(new Cercle(4,3,4.5));
        cercles.add(new Cercle(3,2,3.5));
        cercles.add(new Cercle(2,1,2.5));
        cercles.add(new Cercle(1,0,1.5));
        //i
        for (Cercle cercle:cercles){
            System.out.println("La surface du cercle "+(cercles.indexOf(cercle)+1)+" est :"+cercle.surface());
        }
    }
}
