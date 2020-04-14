package extraerClases;

public class ExtraerClasesRefactorizadoTelefono {

    public class telefono extends ExtraerClasesRefactorizadoExtraer {

        private String numerotlf;

        public telefono(String nombre, String calle, String portal, String numerotlf) {
            super(nombre, calle, portal);
            this.numerotlf = numerotlf;
        }


        public String getNombre(String nombre) {
            return nombre;
        }
    }

}
