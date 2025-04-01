import java.util.Scanner;

public class TestCercle {
    public static void main(String[] args) {
        System.out.println("Donner le rayon : ");
        // Crée un objet Scanner pour lire l'entrée utilisateur depuis la console
        Scanner input = new Scanner(System.in);
        // Lit la valeur du rayon fournie par l'utilisateur
        double rayon = input.nextDouble();
        // Crée un objet Cercle avec le rayon fourni
        Cercle cercle1 = new Cercle(rayon);
        // Affiche la surface et le périmètre du cercle avec le rayon fourni
        cercle1.affichage();
        // Modifie le rayon du cercle en utilisant la méthode setRayon()
        cercle1.setRayon(10);
        // Affiche le nouveau rayon du cercle en utilisant la méthode getRayon()
        System.out.println(cercle1.getRayon());
        // Affiche la surface du cercle avec le nouveau rayon
        System.out.println(cercle1.surfaceCercle());
    }
}
