package pullUpMembers;

public class PullUpMembersExtraerRefactorizado {

        protected String nombre;
        String modelo;
        String matricula;
        String concesionario;

        public PullUpMembersExtraerRefactorizado(String modelo, String matricula, String concesionario, String nombre) {
            this.modelo = modelo;
            this.matricula = matricula;
            this.concesionario = concesionario;
            this.nombre = nombre;
        }



        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public String getConcesionario() {
            return concesionario;
        }

        public void setConcesionario(String concesionario) {
            this.concesionario = concesionario;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
}
