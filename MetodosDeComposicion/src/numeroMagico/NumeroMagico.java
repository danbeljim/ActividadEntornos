package numeroMagico;

public class NumeroMagico {

    public int fuerzaGravedad(double distancia, double m1, double m2){
        return (int) ((0.0000000000667 * m1 * m2)/distancia);
    }

}
