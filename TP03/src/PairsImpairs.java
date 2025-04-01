public class PairsImpairs {
    public static void main(String[] args) {
        int[] table = {2, 6, 8, 9, 25, 7, 4, 12, 15};

        // Initialisation du compteur de nombres pairs
        int countPairs = 0; 

        // Initialisation du compteur de nombres impairs
        int countImpairs = 0; 

        // Parcours du tableau pour compter les nombres pairs et impairs
        for (int i : table) {
            if (i % 2 == 0)
                countPairs++;// Incrémente le compteur des nombres pairs
            else
                countImpairs++; // Incrémente le compteur des nombres impairs
        }
        // Affiche le nombre de nombres pairs
        System.out.println("Nombres d'entiers pairs est : " + countPairs);
         // Affiche le nombre de nombres impairs
        System.out.println("Nombres d'entiers impairs est : " + countImpairs);
    }
}