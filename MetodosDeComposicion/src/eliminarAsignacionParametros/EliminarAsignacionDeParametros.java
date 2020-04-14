package eliminarAsignacionParametros;

public class EliminarAsignacionDeParametros {

    double descuento(double precio){
        //50% descuento
        if(precio>50){
            precio=0.5;
        }else if(precio>30){
            precio=0.2;
        }
        return precio;

    }


}
