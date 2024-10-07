import java.util.ArrayList;

public class ArregloPostulante {
     private ArrayList<Postulante> postulantes;

    public ArregloPostulante() {
        this.postulantes = new ArrayList<>();
    }

    public boolean agregar(Postulante postulante) {
        return postulantes.add(postulante);
    }

    public Postulante buscar(String DNI) {
        for (Postulante postulante : postulantes) {
            if (postulante.getDNI().equals(DNI)) {
                return postulante;
            }
        }
        return null;
    }

    public boolean eliminar(String DNI) {
        Postulante postulante = buscar(DNI);
        if (postulante != null) {
            postulantes.remove(postulante);
            return true;
        }
        return false;
    }
    
    public ArrayList<Postulante> getPostulantes() {
        return postulantes;
    }
}
