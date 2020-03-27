package metodoRemplazarMetodoConMetodoObjeto;

public class PedidoResuelto {
    public void ticket(Precio p){
        System.out.println("El total del pedido " + p.nombre + "es : " + p.calcularTotal());
    }


    class Precio{
        int cantidad;
        double precio;
        String nombre = "nombrePedido";

        public double calcularTotal(){
            return cantidad * precio;
        }
    }
}
