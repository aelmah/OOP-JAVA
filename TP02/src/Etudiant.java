class Etudiant {
    // Attributs privés pour stocker les informations de l'étudiant
    private String nom; // Le nom de l'étudiant
    private String prenom; // Le prenom de l'étudiant
    private String cin; // Le cin de l'étudiant
    private int age; // L'age de l'étudiant

    // Constructeur pour initialiser un objet étudiant avec des informations
    Etudiant(String nom, String prenom, String cin, int age){
        this.nom = nom;       // Initialise le nom de l'étudiant
        this.prenom = prenom; // Initialise le prenom de l'étudiant
        this.age = age;       // Initialise l'age de l'étudiant
        this.cin = cin;       // Initialise le cin de l'étudiant
    }

    // Méthode pour afficher les informations de l'étudiant
    public void afficheEtudiant(){
        System.out.println("Information d'etudiant :");
        System.out.println("nom : "+this.nom);          // Affiche le nom de l'étudiant
        System.out.println("prenom : "+this.prenom);    // Affiche le prenom de l'étudiant
        System.out.println("cin : "+this.cin);          // Affiche le cin de l'étudiant
        System.out.println("age : "+this.age);          // Affiche l'age de l'étudiant
        System.out.println("================================");
    }
    // Méthode pour augmenter l'âge de l'étudiant de n années
    public void incrementAge(int n){
        this.age = this.age + n; // Incrémente l'âge de l'étudiant
    }

    // Méthodes "getter" pour obtenir les valeurs des attributs
    public int getAge() {
        return age; // Renvoie l'age de l'étudiant
    }
    public String getNom() {
        return nom; // Renvoie le nom de l'étudiant
    }
    public String getPrenom() {
        return prenom; // Renvoie le prenom de l'étudiant
    }

    public String getCin() {
        return cin; // Renvoie le cin de l'étudiant
    }

    // Méthodes "setter" pour définir de nouvelles valeurs pour les attributs
    public void setAge(int age) {
        this.age = age; // Modifie l'age de l'étudiant
    }
    public void setNom(String nom) {
        this.nom = nom; // Modifie le nom de l'étudiant
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom; // Modifie le prenom de l'étudiant
    }

    public void setCin(String cin) {
        this.cin = cin; // Modifie le cin de l'étudiant
    }
}
