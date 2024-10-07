import java.util.ArrayList;

public class ArregloGradoEstado {
    private ArrayList<GradoEstudio> gradosEstudio;

    public ArregloGradoEstado(){
        this.gradosEstudio = new ArrayList<>();
    }

    public boolean agregar(GradoEstudio gradoEstudio) {
        return gradosEstudio.add(gradoEstudio);
    }

    public GradoEstudio buscar(String criterio) {
        for (GradoEstudio grado : gradosEstudio) {
            if (grado.getDescripcion().equals(criterio)) {
                return grado;
            }
        }
        return null;
    }

    public GradoEstudio[] getEstadosEtapa() {
        return gradosEstudio.toArray(new GradoEstudio[0]);
    }
}
