public class TestEtudiant {
    public static void main(String[] args) {
        // Crée un nouvel objet étudiant en fournissant des informations initiales
        Etudiant etudiant1 = new Etudiant("bahlaouane",
                "salaheddine","R130565037",21);
        etudiant1.afficheEtudiant();// Affiche les informations de l'étudiant
        etudiant1.incrementAge(3);// Augmente l'age de l'étudiant de 3 ans
        // Affiche à nouveau les informations de l'étudiant après l'augmentation de l'age
        etudiant1.afficheEtudiant();
        // Modifie le nom, le prénom, l'age et le CIN de l'étudiant
        etudiant1.setNom("BHL");
        etudiant1.setPrenom("slh");
        etudiant1.setAge(25);
        etudiant1.setCin("R5445456");
        // Affiche à nouveau les informations de l'étudiant après les modifications
        etudiant1.afficheEtudiant();
        // Utilise la méthode getAge() pour obtenir l'age de l'étudiant
        int age = etudiant1.getAge();
        age -= 3; // Réduit l'age de l'étudiant de 3 ans
        System.out.println("le age = "+age);// Affiche la nouvelle valeur de l'age
    }
}
