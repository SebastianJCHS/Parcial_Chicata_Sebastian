import java.util.ArrayList;
import java.util.Date;

public class Postulante {
    private String DNI;
    private String email;
    private String nombres;
    private String apellidos;
    private String direccion;
    private Date fnacimiento;
    private String clave;
    private ArrayList<Postulacion> postulaciones;
    private GradoEstudio gradoEstudio;

    public Postulante(String DNI, String email, String nombres, String apellidos, String direccion, Date fnacimiento, String clave){
        this.DNI = DNI;
        this.email = email;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.fnacimiento = fnacimiento;
        this.clave = clave;
        this.postulaciones = new ArrayList<>();
    }
    
    public Postulante(){} // Constructor vacío 

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public boolean asignarGradoEstudio(GradoEstudio gradoEstudio) {
        if (gradoEstudio != null) {
            this.gradoEstudio = gradoEstudio;
            return true;
        }
        return false;
    }

    public boolean postularOferta(Oferta oferta, String glosa) {
        if (oferta != null){
            Postulacion nuevaPostulacion = new Postulacion(new Date(), glosa);
            postulaciones.add(nuevaPostulacion);
            return true;
        }
        return false;
    }

    public boolean anularPostulacion(Postulacion postulacion) {
        if (postulacion != null && postulaciones.contains(postulacion)) {
            postulacion.anular();
            return true;
        }
        return false;
    }    
    
    public Postulacion[] getPostulaciones() {
        return postulaciones.toArray(new Postulacion[0]);
    }
}
