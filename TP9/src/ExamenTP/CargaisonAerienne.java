package ExamenTP;

public class CargaisonAerienne extends Cargaison{
    public CargaisonAerienne(double distance) {
        super(distance);
    }

    @Override
    public double cout() {
        if (volumeTotal() < 80000){
            return 10 * getDistance() * poidsTotal();
        }
        return 12 * getDistance() * poidsTotal();
    }
}
