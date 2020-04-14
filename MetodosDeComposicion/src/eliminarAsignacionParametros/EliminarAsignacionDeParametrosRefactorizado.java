package eliminarAsignacionParametros;

public class EliminarAsignacionDeParametrosRefactorizado {

    double descuento(double precio){
        double resultado=precio;
        //50% descuento
        if(precio>50){
            resultado=0.5;
        }else if(precio>30){
            resultado=0.2;
        }
        return resultado;

    }

}
