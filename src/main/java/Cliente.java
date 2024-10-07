public class Cliente {
    private String RUC;
    private String nombre;
    private String email;
    private String telefono;
    private String clave;
    
    public Cliente(String RUC, String nombre, String email, String telefono, String clave){
        this.RUC = RUC;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.clave = clave;
    }
    
    public Cliente(){} // Constructor vacío

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public boolean agregarOferta(Oferta oferta) {
        
        return true;
    }

    public boolean eliminarOferta(Oferta oferta) {
        
        return true;
    }

    public Oferta[] getOfertas() {
        
        return null;
    }

    public void registrarContacto(String DNI, String nombres, String apellidos, String puesto) {
       
    }
}
