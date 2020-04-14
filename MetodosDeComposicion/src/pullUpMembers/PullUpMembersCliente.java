package pullUpMembers;

import extraerClases.ExtraerClasesExtraer;

public class PullUpMembersCliente {

    public class cliente extends PullUpMembersCliente.extraer {

        private String nombre;

        private String apellido;

        private String dni;

        public cliente(String modelo, String matricula, String concesionario, String nombre, String apellido, String dni) {
            super(modelo, matricula, concesionario);
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
        }


        public void setNombre(String nombre) {
            this.nombre = nombre;
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
    }

    public class extraer {
        public extraer(String modelo, String matricula, String concesionario) {
        }
    }
}
