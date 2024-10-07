import java.util.Date;

public class Postulacion {
    private Date fecha;
    private boolean anulado;
    private Date fechaAnulacion;

    public Postulacion(Date fecha) {
        this.fecha = fecha;
        this.anulado = false;
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
        this.fechaAnulacion = new Date(); // Anulando la fecha actual
    }
}
