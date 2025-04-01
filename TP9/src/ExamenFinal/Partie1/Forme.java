package ExamenFinal.Partie1;

public abstract class Forme {
    private double x;
    private double y;

    public Forme(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Forme() {

    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public abstract double surface();
    public abstract double perimetre();
    public void afficher(){
        System.out.println("Le centre : ("+this.x+" ,"+this.y+")");
        System.out.println("La surface : "+this.surface());
        System.out.println("Le périmetre : "+this.perimetre());
    }
    public void deplacer(double x,double y){
        setX(x);
        setY(y);
    }
}
