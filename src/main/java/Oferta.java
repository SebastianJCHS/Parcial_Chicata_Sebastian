import java.util.Date;
import java.util.ArrayList;

public class Oferta {
    private String puesto;
    private String descripcion;
    private String area;
    private Date fechaInicio;
    private Date fechaTermino;
    private ArrayList<Requisito> requisitos;

    public Oferta(String puesto, String descripcion, String area, Date fechaInicio, Date fechaTermino) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.area = area;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.requisitos = new ArrayList<>();
    }
    
    public Oferta(){} // Constructor vacío
    
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }


    public boolean agregarRequisito(int orden, String descripcion) {
        for (Requisito requisito : requisitos) {
            if (requisito.getOrden() == orden) {
                return false;
            }
        }
        Requisito nuevoRequisito = new Requisito(orden, descripcion);
        requisitos.add(nuevoRequisito);
        return true;
    }

    public Requisito[] getRequisitos() {
        return requisitos.toArray(new Requisito[0]);
    }

    public boolean eliminarRequisito(int orden) {
        for (Requisito requisito : requisitos) {
            if (requisito.getOrden() == orden) {
                requisitos.remove(requisito);
                return true;
            }
        }
        return false;
    }
}
