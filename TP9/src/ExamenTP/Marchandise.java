package ExamenTP;

public class Marchandise {
    private int numero;
    private double poids;
    private double volume;

    public Marchandise() {
    }
    public Marchandise(int numero, double poids, double volume) {
        this.numero = numero;
        this.poids = poids;
        this.volume = volume;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "numero : " + numero + "\npoids : " + poids + "\nvolume : " + volume;
    }
}
