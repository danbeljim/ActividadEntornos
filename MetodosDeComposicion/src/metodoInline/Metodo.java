package metodoInline;

public class Metodo {

    public static String puedoSalir(){
        int temperatura = 9;
        return comprobarTemperatura(temperatura) ? "Puedes salir a la calle" : "No puedes salir a la calle";
    }

    public static boolean comprobarTemperatura(int temperatura){
        return temperatura > 10 ? true : false;
    }

}
