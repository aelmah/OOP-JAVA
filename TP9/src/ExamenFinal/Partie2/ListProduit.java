package ExamenFinal.Partie2;


import java.util.ArrayList;

public class ListProduit {
    private ArrayList<Produit> produits = new ArrayList<>();

    public ListProduit(ArrayList<Produit> produits) {
        this.produits = produits;
    }
    public boolean estVide(){
        return produits.isEmpty();
    }
    public void ajouterProduit(Produit produit){
        this.produits.add(produit);
    }
    public void afficherProduit(){
        if (estVide()){
            System.out.println("Pas de produits.");
        }else {
            for (Produit produit:produits){
                System.out.println(produit);
                System.out.println();
            }
        }
    }
    public double suppressionPerime(){
        double sommePerdue = 0;
        for (Produit produit:produits){
            if (produit.getExpirationProduit() == 0){
                sommePerdue += produit.getPrix();
                produits.remove(produit);
            }
        }
        return sommePerdue;
    }
    //improvement
//    public double suppressionPerime() {
//        double sommePerdue = 0;
//        Iterator<Produit> iterator = produits.iterator();
//        while (iterator.hasNext()) {
//            Produit produit = iterator.next();
//            if (produit.getExpirationProduit() == 0) {
//                sommePerdue += produit.getPrix();
//                iterator.remove();
//            }
//        }
//        return sommePerdue;
//    }
    public void trieProduit(){
        Produit produitTemp;
        for (int i = 0; i < produits.size() - 1; i++) {
            for (int j = 0; j < produits.size() - i -1; j++) {
                if (produits.get(j).getExpirationProduit() < produits.get(j+1).getExpirationProduit()){
                    produitTemp = produits.get(j);
                    produits.set(j,produits.get(j+1));
                    produits.set(j+1,produitTemp);
                }
            }
        }
        for (Produit produit:produits){
            System.out.println(produit);
        }
    }
    //improvement
//    public void trieProduit() {
//        Collections.sort(produits, (p1, p2) -> Integer.compare(p2.getExpirationProduit(), p1.getExpirationProduit()));
//        for (Produit produit : produits) {
//            System.out.println(produit);
//        }
//    }
}