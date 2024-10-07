import java.util.ArrayList;

public class Cliente {
    private String RUC;
    private String nombre;
    private String email;
    private String telefono;
    private String clave;
    private ArrayList<Oferta> ofertas;
    private ArrayList<Contacto> contactos;
    
    public Cliente(String RUC, String nombre, String email, String telefono, String clave){
        this.RUC = RUC;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.clave = clave;
        this.ofertas = new ArrayList<>();
        this.contactos = new ArrayList<>();
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
        if (oferta != null && !ofertas.contains(oferta)) {
            ofertas.add(oferta);
        }
        return true;
    }

    public boolean eliminarOferta(Oferta oferta){
        if (oferta != null && ofertas.contains(oferta)) {
            ofertas.remove(oferta);
        }
        return true;
    }

    public Oferta[] getOfertas(){
        return ofertas.toArray(new Oferta[0]);
    }

    public void registrarContacto(String DNI, String nombres, String apellidos, String puesto) {
       if (DNI != null && nombres != null && apellidos != null && puesto != null) {
            Contacto nuevoContacto = new Contacto(DNI, nombres, apellidos, puesto);
            contactos.add(nuevoContacto);
        }
    }
}
