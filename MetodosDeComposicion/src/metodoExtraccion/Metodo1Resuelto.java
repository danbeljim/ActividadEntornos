package metodoExtraccion;

public class Metodo1Resuelto {
    public static void main(String[] args) {
        int radio = 3;
        final double PI = 3.14;

        getArea(radio, PI);
    }

    public static void getArea(int radio, double PI) {
        System.out.println("Area : " + PI * radio * radio );
    }
}
