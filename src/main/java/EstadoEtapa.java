public class EstadoEtapa {
    private String nombre;
    private boolean estado;

    public EstadoEtapa(String nombre) {
        this.nombre = nombre;
        this.estado = true; 
    }
    
    public EstadoEtapa(){} // Constructor vacío

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
