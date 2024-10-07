import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        ArregloCliente arregloClientes = new ArregloCliente();
        ArregloPostulante arregloPostulantes = new ArregloPostulante();
        ArregloGradoEstudio arregloGradoEstudio = new ArregloGradoEstudio();
        ArrayList<Oferta> ofertas = new ArrayList<>();
        
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Crear Cliente");
            System.out.println("2. Crear Oferta");
            System.out.println("3. Registrar Contacto para Cliente");
            System.out.println("4. Crear Postulante");
            System.out.println("5. Asignar Grado de Estudio al Postulante");
            System.out.println("6. Postular a una Oferta");
            System.out.println("7. Anular Postulación");
            System.out.println("8. Mostrar Clientes");
            System.out.println("9. Mostrar Postulantes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = consola.nextInt();
            consola.nextLine();  

            switch(opcion) {
                case 1:
                    System.out.print("Ingrese RUC del Cliente: ");
                    String RUC = consola.nextLine();
                    System.out.print("Ingrese nombre del Cliente: ");
                    String nombre = consola.nextLine();
                    System.out.print("Ingrese email del Cliente: ");
                    String email = consola.nextLine();
                    System.out.print("Ingrese teléfono del Cliente: ");
                    String telefono = consola.nextLine();
                    System.out.print("Ingrese clave del Cliente: ");
                    String clave = consola.nextLine();
                    
                    Cliente cliente = new Cliente(RUC, nombre, email, telefono, clave);
                    arregloClientes.agregar(cliente);
                    System.out.println("Cliente creado y agregado correctamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el puesto de la oferta: ");
                    String puesto = consola.nextLine();
                    System.out.print("Ingrese la descripción de la oferta: ");
                    String descripcion = consola.nextLine();
                    System.out.print("Ingrese el área de la oferta: ");
                    String area = consola.nextLine();

                    Oferta oferta = new Oferta(puesto, descripcion, area, new Date(), new Date());
                    ofertas.add(oferta);
                    System.out.println("Oferta creada y agregada correctamente.");
                    break;

                case 3:
                    System.out.print("Ingrese RUC del Cliente para registrar contacto: ");
                    String RUCContacto = consola.nextLine();
                    Cliente clienteContacto = arregloClientes.buscar(RUCContacto);
                    if (clienteContacto != null) {
                        System.out.print("Ingrese DNI del contacto: ");
                        String DNIContacto = consola.nextLine();
                        System.out.print("Ingrese nombres del contacto: ");
                        String nombresContacto = consola.nextLine();
                        System.out.print("Ingrese apellidos del contacto: ");
                        String apellidosContacto = consola.nextLine();
                        System.out.print("Ingrese puesto del contacto: ");
                        String puestoContacto = consola.nextLine();

                        clienteContacto.registrarContacto(DNIContacto, nombresContacto, apellidosContacto, puestoContacto);
                        System.out.println("Contacto registrado correctamente.");
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese DNI del Postulante: ");
                    String DNIPostulante = consola.nextLine();
                    System.out.print("Ingrese email del Postulante: ");
                    String emailPostulante = consola.nextLine();
                    System.out.print("Ingrese nombres del Postulante: ");
                    String nombresPostulante = consola.nextLine();
                    System.out.print("Ingrese apellidos del Postulante: ");
                    String apellidosPostulante = consola.nextLine();
                    System.out.print("Ingrese dirección del Postulante: ");
                    String direccionPostulante = consola.nextLine();
                    System.out.print("Ingrese clave del Postulante: ");
                    String clavePostulante = consola.nextLine();

                    Postulante postulante = new Postulante(DNIPostulante, emailPostulante, nombresPostulante, apellidosPostulante, direccionPostulante, new Date(), clavePostulante);
                    arregloPostulantes.agregar(postulante);
                    System.out.println("Postulante creado y agregado correctamente.");
                    break;

                case 5:
                    System.out.print("Ingrese el DNI del Postulante: ");
                    String DNIPostulanteGrado = consola.nextLine();
                    Postulante postulanteGrado = arregloPostulantes.buscar(DNIPostulanteGrado);
                    if (postulanteGrado != null) {
                        System.out.print("Ingrese la descripción del grado de estudio: ");
                        String descripcionGrado = consola.nextLine();
                        GradoEstudio gradoEstudio = new GradoEstudio(descripcionGrado);
                        arregloGradoEstudio.agregar(gradoEstudio);
                        postulanteGrado.asignarGradoEstudio(gradoEstudio);
                        System.out.println("Grado de estudio asignado correctamente.");
                    } else {
                        System.out.println("Postulante no encontrado.");
                    }
                    break;

                case 6:
                    System.out.print("Ingrese el DNI del Postulante: ");
                    String DNIPostulacion = consola.nextLine();
                    Postulante postulanteOferta = arregloPostulantes.buscar(DNIPostulacion);
                    if (postulanteOferta != null) {
                        System.out.print("Ingrese el índice de la oferta (0 a " + (ofertas.size() - 1) + "): ");
                        int indiceOferta = consola.nextInt();
                        consola.nextLine();  // Limpiar el buffer
                        if (indiceOferta >= 0 && indiceOferta < ofertas.size()) {
                            System.out.print("Ingrese glosa para la postulación: ");
                            String glosa = consola.nextLine();
                            postulanteOferta.postularOferta(ofertas.get(indiceOferta), glosa);
                            System.out.println("Postulación realizada correctamente.");
                        } else {
                            System.out.println("Índice de oferta inválido.");
                        }
                    } else {
                        System.out.println("Postulante no encontrado.");
                    }
                    break;

                case 7:
                    System.out.print("Ingrese el DNI del Postulante: ");
                    String DNIPostulanteAnular = consola.nextLine();
                    Postulante postulanteAnular = arregloPostulantes.buscar(DNIPostulanteAnular);
                    if (postulanteAnular != null) {
                        Postulacion[] postulaciones = postulanteAnular.getPostulaciones();
                        if (postulaciones.length > 0) {
                            System.out.print("Ingrese el índice de la postulación a anular (0 a " + (postulaciones.length - 1) + "): ");
                            int indicePostulacion = consola.nextInt();
                            consola.nextLine(); 
                            if (indicePostulacion >= 0 && indicePostulacion < postulaciones.length) {
                                postulanteAnular.anularPostulacion(postulaciones[indicePostulacion]);
                                System.out.println("Postulación anulada correctamente.");
                            } else {
                                System.out.println("Índice de postulación inválido.");
                            }
                        } else {
                            System.out.println("No existen postulaciones para anular.");
                        }
                    } else {
                        System.out.println("Postulante no encontrado.");
                    }
                    break;

                case 8:
                    for (Cliente c : arregloClientes.buscarNombre("")) {
                        System.out.println("Cliente: " + c.getNombre() + " (RUC: " + c.getRUC() + ")");
                    }
                    break;

                case 9:
                    for (Postulante p : arregloPostulantes.getPostulantes()) {
                        System.out.println("Postulante: " + p.getNombres() + " (DNI: " + p.getDNI() + ")");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, por favor intente de nuevo.");
                    break;
            }
        }
        consola.close();
    }
}