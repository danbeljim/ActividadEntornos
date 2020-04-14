package pullMembersDown;

import extraerClases.ExtraerClasesExtraer;

public class PullMembersDownClienteRefactorizado {

    public class cliente extends ExtraerClasesExtraer {

        private String apellido;

        private String dni;
        private String modelo;

        public cliente(String modelo, String matricula, String concesionario, String nombre, String apellido, String dni) {
            super(modelo, matricula, concesionario, nombre);
            this.apellido = apellido;
            this.dni = dni;
        }


        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public String getModelo() {
            String modelo = null;
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    }

}
