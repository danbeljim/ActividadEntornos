package metodoRemplazarMetodoConMetodoObjeto;

public class Pedido {

    public void ticket(){
        System.out.println("El total del pedido " + nombre + "es : " + calcularTotal());
    }

    int cantidad;
    double precio;
    String nombre = "nombrePedido";

    public double calcularTotal(){
        return cantidad * precio;
    }
}