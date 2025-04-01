import java.util.Arrays;

public class TestTableauxEntiers {
    public static void main(String[] args) {
        // Crée un tableau d'entiers de taille 20 et le remplit avec des valeurs spécifiques
        int[] tab = new int[20];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = 2 * i;
        }
        tab[14] = 50;
        tab[10] = -2;

        TableauEntiers table = new TableauEntiers();

        // Affiche le tableau
        table.afficher(tab);

        // Affiche la somme des éléments du tableau
        System.out.println("La somme des éléments est : " + table.somme(tab));

        // Affiche la moyenne des éléments du tableau
        System.out.println("La moyenne des éléments est : " + table.moyenne(tab));

        // Affiche le minimum parmi les éléments du tableau
        System.out.println("Le minimum des éléments est : " + table.minimum(tab));

        // Affiche l'indice du maximum dans le tableau
        System.out.println("L'indice du maximum des éléments est : " + table.indiceMax(tab));

        // Affiche le tableau trié
        System.out.println("Le tableau trié est : " + Arrays.toString(table.triBulles(tab)));

        // Affiche un tableau contenant les opposés des éléments
        System.out.println("Le tableau opposé est : " + Arrays.toString(table.opposes(tab)));

        // Affiche le tableau après l'échange des éléments 14 et 10
        System.out.print("Tableau après échange : ");
        table.afficher(table.echanger(tab, 14, 10));
    }
}