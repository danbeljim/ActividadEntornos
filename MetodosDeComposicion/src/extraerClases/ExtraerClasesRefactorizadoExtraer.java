package extraerClases;

public class ExtraerClasesRefactorizadoExtraer {

        private String nombre;
        private String calle;
        private String portal;

        public ExtraerClasesRefactorizadoExtraer(String nombre, String calle, String portal) {
            this.nombre = nombre;
            this.calle = calle;
            this.portal = portal;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
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

