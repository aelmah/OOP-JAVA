import java.util.Arrays;
import java.util.Scanner;

public class Triage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taille du tableau numérique : "); // Demande la taille du tableau numérique à l'utilisateur
        int number = input.nextInt();
        System.out.println("Taille du tableau de chaînes : "); // Demande la taille du tableau de chaînes à l'utilisateur
        int num = input.nextInt();

        double[] tableauxNum = new double[number];
        System.out.println("Remplir le tableau numérique : "); // Invite l'utilisateur à remplir le tableau numérique
        for (int i = 0; i < tableauxNum.length; i++) {
            tableauxNum[i] = input.nextDouble(); // Stocke les valeurs numériques saisies dans le tableau numérique
        }
        Arrays.sort(tableauxNum); // Trie le tableau numérique

        String[] tableauxStr = new String[num];
        System.out.println("Remplir le tableau de chaînes : "); // Invite l'utilisateur à remplir le tableau de chaînes
        for (int i = 0; i < tableauxStr.length; i++) {
            tableauxStr[i] = input.next(); // Stocke les chaînes saisies dans le tableau de chaînes
        }
        Arrays.sort(tableauxStr); // Trie le tableau de chaînes

        System.out.println("Tableau numérique trié : " + Arrays.toString(tableauxNum)); // Affiche le tableau numérique trié
        System.out.println("Tableau de chaînes trié : " + Arrays.toString(tableauxStr)); // Affiche le tableau de chaînes trié
    }
}

