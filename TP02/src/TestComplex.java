public class TestComplex {
    public static void main(String[] args) {
        // Crée plusieurs objets Complex représentant des nombres complexes
        Complex z1 = new Complex(5,3);
        Complex z2 = new Complex(1,2);
        Complex z3 = new Complex(3,-4);
        Complex z = new Complex(5,-1);
        //System.out.println(z1.reel+" "+z1.imaginaire);
        // Effectue des opérations sur les nombres complexes et affiche les résultats
        System.out.println("z = "+z);
        System.out.println("z1 = "+z1);
        System.out.println("z1 + z2 est : "+z1.ajouter(z2));
        System.out.println("z1 - z2 est : "+z1.soustraire(z2));
        System.out.println("z1 * z2 est : "+z1.multiplier(z2));
        z1 = z1.multiplier(z2,z3);
        System.out.println("z2 * z3 est :"+z1);
        // Calcule le conjugué et le module de z
        System.out.println("le conjugue de "+z+" est : "+z.conjugue());
        System.out.println("le modulo de "+z+" est : "+z.modulo());
    }
}
