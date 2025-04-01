package ExamenTP;

import java.util.ArrayList;

public abstract class Cargaison {
    public Cargaison(double distance) {
        this.distance = distance;
    }

    public abstract double cout();
    private double distance;
    private ArrayList<Marchandise> marchandises = new ArrayList<>();

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public ArrayList<Marchandise> getMarchandises() {
        return marchandises;
    }
    public void setMarchandises(ArrayList<Marchandise> marchandises) {
        this.marchandises = marchandises;
    }
    public void ajouterMarchandise(Marchandise marchandise){
        this.marchandises.add(marchandise);
        System.out.println(marchandise.getNumero()+" a éte ajouter.");
    }
    public void afficherMarchandise(){
        if (!this.marchandises.isEmpty()){
            System.out.println("************* Marchandises *************");
            for (int i = 0; i < marchandises.size(); i++) {
                System.out.println(marchandises.get(i));
                System.out.println();
            }
        } else {
            System.out.println("Pas de marchandises");
        }
    }
    public Marchandise marchandiseSachantNumero(int numero){
        for (int i = 0; i < marchandises.size(); i++) {
            if (marchandises.get(i).getNumero() == numero){
                return marchandises.get(i);
            }
        }
        return null;
    }
    public double poidsTotal(){
        double poids = 0;
        for (Marchandise marchandise : marchandises){
            poids += marchandise.getPoids();
        }
        return poids;
    }
    public double volumeTotal(){
        double volume = 0;
        for (Marchandise marchandise : marchandises){
            volume += marchandise.getVolume();
        }
        return volume;
    }
}
