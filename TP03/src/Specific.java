import java.util.Arrays;
import java.util.Scanner;

public class Specific {
    public static void main(String[] args) {
        int[] table = {1, 5, 55, 23};

        Scanner input = new Scanner(System.in);
        // Invite l'utilisateur à entrer une valeur
        System.out.println("Entrer votre valeur : "); 
        int val = input.nextInt();
        Arrays.sort(table); // Trie le tableau en ordre croissant
        
        // Recherche la valeur dans le tableau trié
        int exist = Arrays.binarySearch(table, val); 
        // Affiche si la valeur existe dans le tableau et son indice
        if (exist >= 0)
            System.out.println(val + " existe dans le tableau, à l'indice : " + exist); 
         // Affiche que la valeur n'existe pas dans le tableau
        else
            System.out.println(val + " n'existe pas dans le tableau.");

        // AUTRE METHODE
        //boolean valTrouvee = false;
        //for (int element : table) {
        //    if (element == val) {
        //        valTrouvee = true;
        //        break;
        //    }
        //}
        //if (valTrouvee)
        //    System.out.println(val + " est dans le tableau.");
        //else
        //    System.out.println(val + " n'est pas dans le tableau.");
    }
}