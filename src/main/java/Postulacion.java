import java.util.Date;

public class Postulacion {
    private Date fecha;
    private boolean anulado;
    private Date fechaAnulacion;
    private String glosa;

    public Postulacion(Date fecha, String glosa) {
        this.fecha = fecha;
        this.anulado = false;
        this.glosa = glosa;
    }
    
    public Postulacion(){} //Constructor vacío

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }

    public Date getFechaAnulacion() {
        return fechaAnulacion;
    }
    
    public void setFechaAnulacion(Date fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }
    
    public void anular() {
        this.anulado = true;
        this.fechaAnulacion = new Date(); 
    }
}
