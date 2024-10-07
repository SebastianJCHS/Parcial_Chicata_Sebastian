public class Contacto {
    private String DNI;
    private String nombres;
    private String apellidos;
    private String puesto;

    public Contacto(String DNI, String nombres, String apellidos, String puesto) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.puesto = puesto;
    }
    
    public Contacto(){} // Constructor vacío

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
