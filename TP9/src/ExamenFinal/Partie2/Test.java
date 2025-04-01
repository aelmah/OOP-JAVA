package ExamenFinal.Partie2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Produit produit1 = new Produit("atay",20,25);
        Produit produit2 = new Produit("bimo",5,30);
        Produit produit3 = new Produit("zri3a",10,0);
        Produit produit4 = new Produit("cocoa",10,40);

        ListProduit listProduit = new ListProduit(new ArrayList<>());
        listProduit.ajouterProduit(produit2);
        listProduit.ajouterProduit(produit1);
        listProduit.ajouterProduit(produit3);
        listProduit.ajouterProduit(produit4);
        System.out.println();
        listProduit.afficherProduit();
        double sommePerdue = listProduit.suppressionPerime();
        System.out.println("Liste apres suppression : ");
        listProduit.afficherProduit();
        System.out.println("La somme perdue : "+sommePerdue);
        System.out.println("List apres triage : ");
        listProduit.trieProduit();
        System.out.println();

        ListProduit listProduit2 = new ListProduit(new ArrayList<>());
        listProduit2.afficherProduit();
    }
}
