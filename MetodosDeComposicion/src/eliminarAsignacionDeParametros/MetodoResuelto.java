package eliminarAsignacionDeParametros;

public class MetodoResuelto {

    public static double devolverNota(double notaActividad, double notaFinal){
        double nota = notaFinal;
        if (notaActividad > 7)
            nota++;
        else
            nota = 0;

        return  nota;
    }

}
