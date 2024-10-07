import java.util.ArrayList;

public class ArregloEstadoEtapa {
    private ArrayList<EstadoEtapa> estadosEtapa;

    public ArregloEstadoEtapa() {
        this.estadosEtapa = new ArrayList<>();
    }

    public boolean agregar(EstadoEtapa estadoEtapa) {
        return estadosEtapa.add(estadoEtapa);
    }

    public EstadoEtapa buscar(String nombre) {
        for (EstadoEtapa estado : estadosEtapa) {
            if (estado.getNombre().equals(nombre)) {
                return estado;
            }
        }
        return null;
    }

    public EstadoEtapa[] getEstadosEtapa() {
        return estadosEtapa.toArray(new EstadoEtapa[0]);
    }
}
