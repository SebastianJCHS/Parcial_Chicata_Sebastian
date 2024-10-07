import java.util.ArrayList;

public class ArregloCliente {
    private ArrayList<Cliente> clientes;

    public ArregloCliente() {
        this.clientes = new ArrayList<>();
    }

    public boolean agregar(Cliente cliente) {
        return clientes.add(cliente);
    }

    public Cliente buscar(String RUC) {
        for (Cliente cliente : clientes) {
            if (cliente.getRUC().equals(RUC)) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente[] buscarNombre(String nombre) {
        ArrayList<Cliente> resultado = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().contains(nombre)) {
                resultado.add(cliente);
            }
        }
        return resultado.toArray(new Cliente[0]);
    }
}
