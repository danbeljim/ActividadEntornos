package encapsularColeccion;

import java.util.ArrayList;
import java.util.List;

public class EncapsularColeccionRefactorizado {

    List<Alumnos> listaAlumnos = new ArrayList<>();

    public List<Alumnos> getListaAlumnos() {
        return listaAlumnos;
    }

    /*
    public void setListaAlumnos(List<Alumnos> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
     */

    public void annadirAlumno(Alumnos alumno){
        listaAlumnos.add(alumno);
    }

    public void eliminarAlumno(Alumnos alumno){
        listaAlumnos.remove(alumno);
    }

}
