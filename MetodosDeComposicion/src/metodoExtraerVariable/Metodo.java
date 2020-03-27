package metodoExtraerVariable;

public class Metodo {

    public static void comprobarDNI(){
        String dni = "26523583Y";

        if (dni.toLowerCase().matches("[0-9]{8}[a-z]"))
            System.out.println("El dni introducido es correcto");
        else
            System.out.println("El dni introducido no es correcto");
    }

}
