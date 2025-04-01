package ExamenTP;

public class CargaisonRoutiere extends Cargaison{

    public CargaisonRoutiere(double distance) {
        super(distance);
    }

    @Override
    public double cout() {
        if (volumeTotal() < 38000){
            return 4 * getDistance() * poidsTotal();
        }
        return 6 * getDistance() * poidsTotal();
    }
}
