package ExamenFinal.Partie2;

public class Produit {
    private String nom;
    private double prix;
    private int expirationProduit;

    public Produit(String nom, double prix, int expirationProduit) {
        this.nom = nom;
        this.prix = prix;
        this.expirationProduit = expirationProduit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getExpirationProduit() {
        return expirationProduit;
    }

    public void setExpirationProduit(int expirationProduit) {
        this.expirationProduit = expirationProduit;
    }

    @Override
    public String toString() {
        return "nom : '"+nom+"'\nprix : "+prix+ " DH\nNombre de jour restant avant péremption de produit : "+expirationProduit+" jours";
    }
}
