package simplificacionExpresionesCondicionales.descomponer;

public class Descomponer {

    public static void main(String[] args) {
        int numero = 2;
        int numeroFinal = 0;
        if (numero % 2 == 0)
            numeroFinal = numero * 2;
        if (numero % 3 == 0)
            numeroFinal = numero * 3;
    }

}
