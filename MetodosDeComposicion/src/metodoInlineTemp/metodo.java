package metodoInlineTemp;

public class metodo {
    public static String esFrase(String texto){
        double numeroDeCaracteres = texto.length();
        if (numeroDeCaracteres > 1)
            return "Es una frase";
        else
            return "Es un caracter";
    }
}
