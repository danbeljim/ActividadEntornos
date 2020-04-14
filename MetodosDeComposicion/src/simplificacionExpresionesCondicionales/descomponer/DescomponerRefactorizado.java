package simplificacionExpresionesCondicionales.descomponer;

public class DescomponerRefactorizado {

    public static void main(String[] args) {
        int numero = 2;
        int numeroFinal = 0;
        if (esPar(numero))
            numeroFinalSiEsPar(numero);
        if (esImpar(numero))
            numeroFinalSiEsImpar(numero);
    }

    private static int numeroFinalSiEsPar(int numero){
        return numero * 2;
    }

    private static int numeroFinalSiEsImpar(int numero){
        return numero * 3;
    }

    private static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    private static boolean esImpar(int numero){
        return numero % 3 == 0;
    }

}
