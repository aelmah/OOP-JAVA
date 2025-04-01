package ExamenTP;

public class Main {
    public static void main(String[] args) {
        Cargaison cargaisonRoutiere = new CargaisonRoutiere(12);
        Cargaison cargaisonAerienne = new CargaisonAerienne(12);

        Marchandise marchandise1 = new Marchandise(1,5000,20000);
        Marchandise marchandise2 = new Marchandise(2,4000,70000);
        Marchandise marchandise3 = new Marchandise(3,3000,20000);

        cargaisonRoutiere.ajouterMarchandise(marchandise1);
        cargaisonRoutiere.ajouterMarchandise(marchandise2);
        cargaisonRoutiere.ajouterMarchandise(marchandise3);
        cargaisonRoutiere.afficherMarchandise();
//        cargaisonRoutiere.setDistance(12);
        System.out.println("Le cout du cargaison routiere: "+cargaisonRoutiere.cout());
        System.out.println("#####");
        cargaisonAerienne.ajouterMarchandise(marchandise1);
        cargaisonAerienne.ajouterMarchandise(marchandise2);
        cargaisonAerienne.ajouterMarchandise(marchandise3);
        System.out.println(cargaisonAerienne.volumeTotal());
        cargaisonAerienne.afficherMarchandise();
//        cargaisonAerienne.setDistance(12);
        System.out.println("Le cout du cargaison aerienne: "+cargaisonAerienne.cout());

    }
}
