import java.util.ArrayList;

public class ArregloGradoEstudio {
    private ArrayList<GradoEstudio> gradosEstudio;

    public ArregloGradoEstudio() {
        this.gradosEstudio = new ArrayList<>();
    }

    public boolean agregar(GradoEstudio gradoEstudio) {
        if (gradoEstudio != null && !gradosEstudio.contains(gradoEstudio)) {
            gradosEstudio.add(gradoEstudio);
            return true;
        }
        return false;
    }

    public GradoEstudio buscar(String descripcion) {
        for (GradoEstudio grado : gradosEstudio) {
            if (grado.getDescripcion().equalsIgnoreCase(descripcion)) {
                return grado;
            }
        }
        return null; 
    }

    public GradoEstudio[] getGradosEstudio() {
        return gradosEstudio.toArray(new GradoEstudio[0]);
    }
}
