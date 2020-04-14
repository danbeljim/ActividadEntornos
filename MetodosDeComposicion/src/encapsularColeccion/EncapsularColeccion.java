package encapsularColeccion;

import java.util.ArrayList;
import java.util.List;

public class EncapsularColeccion {

    List<Alumnos> listaAlumnos = new ArrayList<>();

    public List<Alumnos> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(List<Alumnos> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

}
