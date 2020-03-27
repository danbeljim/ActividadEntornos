package eliminarAsignacionDeParametros;

public class Metodo {

    public static double devolverNota(double notaActividad, double notaFinal){
        if (notaActividad > 7)
            notaFinal++;
        else
            notaFinal = 0;

        return notaFinal;

    }
}
