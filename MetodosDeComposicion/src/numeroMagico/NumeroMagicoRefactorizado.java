package numeroMagico;

public class NumeroMagicoRefactorizado {

    public static final double DOUBLE = 0.0000000000667;

    public int fuerzaGravedad(double distancia, double m1, double m2){
        return (int) ((DOUBLE * m1 * m2)/distancia);
    }

}
