package metodoExtraerVariable;

public class MetodoResuelto {

    public static void comprobarDNI(){
        String dni = "26523583Y";

        boolean esDNI = dni.toLowerCase().matches("[0-9]{8}[a-z]");
        if (esDNI)
            System.out.println("El dni introducido es correcto");
        else
            System.out.println("El dni introducido no es correcto");
    }
}
