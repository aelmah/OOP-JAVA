package ExamenFinal.Partie1;

public class Cercle extends Forme {
    private double rayon;

    public Cercle() {
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public Cercle(double x, double y, double rayon) {
        super(x,y);
        this.rayon = rayon;
    }

    @Override
    public double surface() {
        return Math.pow(rayon,2) * Math.PI;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * this.rayon;
    }
}
