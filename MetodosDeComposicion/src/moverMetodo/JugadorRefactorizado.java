package moverMetodo;

public class JugadorRefactorizado {

    public class Player {

        int x;
        int y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void movement(String m) {
            if (m.equalsIgnoreCase("Derecha")) {
                setX(getX() + 1);
            }

            if (m.equalsIgnoreCase("Izquierda")) {
                setX(getX() - 1);
            }

            if (m.equalsIgnoreCase("Arriba")) {
                setY(getY() - 1);
            }
            if (m.equalsIgnoreCase("Abajo")) {
                setY(getY() + 1);
            }
        }
    }

}
