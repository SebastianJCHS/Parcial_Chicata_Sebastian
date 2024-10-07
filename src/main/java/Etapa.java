import java.util.Date;

public class Etapa {
    private Date fecha;
    private String glosa;

    public Etapa(Date fecha, String glosa) {
        this.fecha = fecha;
        this.glosa = glosa;
    }
    
    public Etapa(){} // Constructor vacío

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getGlosa() {
        return glosa;
    }

    public void setGlosa(String glosa) {
        this.glosa = glosa;
    }
}
