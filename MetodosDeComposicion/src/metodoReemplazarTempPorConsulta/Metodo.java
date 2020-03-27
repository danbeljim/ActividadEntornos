package metodoReemplazarTempPorConsulta;

public class Metodo {
    double base;
    double altura;

    public void esRectanguloCuadrado(){
        double area = base * altura;
        if (area > 0)
            System.out.println("Es un rectángulo o cuadrado");
        else
            System.out.println("No es un rectángulo ni un cuadrado");
    }
}
