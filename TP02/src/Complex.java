public class Complex {
    private double reel ,imaginaire ;// Partie réelle et imaginaire du nombre complexe
    // Constructeur par défaut initialisant le nombre complexe à zéro
    public Complex() {
        this.reel = 0;
        this.imaginaire = 0;
    }
    // Constructeur permettant d'initialiser le nombre complexe avec des valeurs réelles et imaginaires
    public Complex(double reel, double imaginaire){
        this.reel = reel;
        this.imaginaire = imaginaire;
    }
    // Méthodes "Setters" et "Getters" pour définir et obtenir les parties réelle et imaginaire
    public void setReel(double reel) {
        this.reel = reel;
    }
    public void setImaginaire(double imaginaire) {
        this.imaginaire = imaginaire;
    }
    public double getReel() {
        return reel;
    }
    public double getImaginaire() {
        return imaginaire;
    }

    // Méthode pour ajouter deux nombres complexes
    public Complex ajouter(Complex c){
        return new Complex(this.reel + c.reel,
                this.imaginaire + c.imaginaire);
    }
    // Méthode pour soustraire deux nombres complexes
    public Complex soustraire(Complex c){
        Complex result = new Complex();

        result.reel = this.reel - c.reel;
        result.imaginaire = this.imaginaire - c.imaginaire;
        return result;
    }
    // Méthode pour multiplier deux nombres complexes
     public Complex multiplier(Complex c){
       return new Complex((this.reel * c.reel) - (this.imaginaire * c.imaginaire),
               (this.reel * c.imaginaire) + (this.imaginaire * c.reel));
     }
    // Méthode pour multiplier deux nombres complexes
    public Complex multiplier(Complex c1,Complex c2){
        Complex result = new Complex();

        result.reel = (c1.reel * c2.reel) - (c1.imaginaire * c2.imaginaire);
        result.imaginaire = (c1.reel * c2.imaginaire) + (c1.imaginaire * c2.reel);
        return result;
    }
    // Méthode pour afficher le nombre complexe sous forme de chaîne de caractères
    @Override
    public String toString() {
        if (this.imaginaire > 0) {
            return this.reel + " + " + this.imaginaire + "i";
        }
        else {
            return this.reel+" - "+Math.abs(this.imaginaire)+"i";
        }
    }
    // Méthode pour calculer le conjugué d'un nombre complexe
    public Complex conjugue(){
        return new Complex (this.reel ,-this.imaginaire);
    }
    // Méthode pour calculer le module d'un nombre complexe
    public double modulo(){
        return Math.sqrt((Math.pow(this.reel,2)+Math.pow(this.imaginaire,2)));
    }
}
