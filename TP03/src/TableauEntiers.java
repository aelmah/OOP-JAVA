import java.util.Arrays;

public class TableauEntiers {

    // Méthode pour afficher le tableau
    public void afficher(int[] table) {
        System.out.println("Le tableau : " + Arrays.toString(table));
    }

    // Méthode pour calculer la somme des éléments du tableau
    public int somme(int[] table) {
        int som = 0;
        for (int i : table) {
            som += i;
        }
        return som;
    }

    // Méthode pour calculer la moyenne des éléments du tableau
    public double moyenne(int[] table) {
        return (double) somme(table) / table.length;
    }

    // Méthode pour trouver le minimum dans le tableau
    public int minimum(int[] table) {
        int min = table[0];
        for (int i = 1; i < table.length; i++) {
            if (min > table[i]) min = table[i];
        }
        return min;
    }

    // Méthode pour trouver l'indice du maximum dans le tableau
    public int indiceMax(int[] table) {
        int max = table[0];
        for (int i = 1; i < table.length; i++) {
            if (max < table[i]) {
                max = table[i];
            }
        }
        return Arrays.binarySearch(table, max);
    }

    // Méthode pour trier le tableau avec le tri à bulles
    public int[] triBulles(int[] table) {
        int[] copie = Arrays.copyOf(table, table.length);
        Arrays.sort(copie);
        return copie;
    }

    // Méthode pour obtenir un tableau d'opposés
    public int[] opposes(int[] table) {
        int[] tab = new int[table.length];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = -table[i];
        }
        return tab;
    }

    // Méthode pour échanger deux éléments du tableau
    public int[] echanger(int[] table, int i, int j) {
        if ((i >= 0 && i < table.length) && (j >= 0 && j < table.length)) {
            int temp;
            temp = table[i];
            table[i] = table[j];
            table[j] = temp;
        }
        return table;
    }
}