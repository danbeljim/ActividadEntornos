package metodoReemplazarTempPorConsulta;

public class MetodoResuelto {
    double base;
    double altura;

    public void esRectanguloCuadrado(){
        if (getArea() > 0)
            System.out.println("Es un rectángulo o cuadrado");
        else
            System.out.println("No es un rectángulo ni un cuadrado");
    }

    public double getArea(){
        return base * altura;
    }
}
