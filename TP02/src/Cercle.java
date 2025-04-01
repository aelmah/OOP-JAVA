class Cercle {
    private double rayon; // Attribut privé pour stocker le rayon du cercle
    // Constructeur pour initialiser un cercle avec un rayon donné
    Cercle(double rayon) {
        this.rayon = rayon;
    }
    // Méthode pour calculer la surface du cercle
    public double surfaceCercle(){
        return Math.pow(rayon,2) * Math.PI;
    }
    // Méthode pour calculer le périmetre du cercle
    public double perimetreCercle() {
        return 2 * rayon * Math.PI;
    }
    // Méthode pour afficher la surface et le périmètre du cercle
    public void affichage(){
        double surface,perimetre;
        surface = surfaceCercle();
        perimetre = perimetreCercle();
        System.out.println("la surface : "+surface);
        System.out.println("le perimetre : "+perimetre);
    }
    // Méthode "setter" pour modifier le rayon du cercle
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    // Méthode "getter" pour obtenir le rayon du cercle
    public double getRayon() {
        return rayon;
    }
}
