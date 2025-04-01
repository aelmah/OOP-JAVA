package ExamenFinal.Partie1;


public class Rectangle extends Forme {
    private double longueur;
    private double largeur;

    public Rectangle(double x, double y, double longueur, double largeur) {
        super(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public Rectangle() {
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double surface() {
        return this.largeur * this.longueur;
    }

    @Override
    public double perimetre() {
        return (this.largeur+this.longueur)*2;
    }
}
