package extraerClases;

public class ExtraerClasesExtraer {

    public ExtraerClasesExtraer(String modelo, String matricula, String concesionario, String nombre) {
    }

    public class extraer {

        private String nombre;
        private String calle;
        private String portal;

        public extraer(String nombre, String calle, String portal) {
            this.nombre = nombre;
            this.calle = calle;
            this.portal = portal;
        }

        public String setNombre(String nombre) {
            return nombre;
        }

        public String getCalle() {
            return calle;
        }

        public void setCalle(String calle) {
            this.calle = calle;
        }

        public String getPortal() {
            return portal;
        }

        public void setPortal(String portal) {
            this.portal = portal;
        }
    }


}
