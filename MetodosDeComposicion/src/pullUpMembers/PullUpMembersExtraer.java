package pullUpMembers;

public class PullUpMembersExtraer {

        String modelo;
        String matricula;
        String concesionario;

        public PullUpMembersExtraer(String modelo, String matricula, String concesionario) {
            this.modelo = modelo;
            this.matricula = matricula;
            this.concesionario = concesionario;
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
    }

