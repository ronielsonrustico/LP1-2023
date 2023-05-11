import java.util.ArrayList;
import java.util.List;

public class loja {
    public String nome;
    public List<pedidos> pedidos = new ArrayList<>();
    public List<clientes> clientes = new ArrayList<>();

    public loja(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<pedidos> pedidos) {
        this.pedidos = pedidos;
    }

    public List<clientes> getClientes() {
        return clientes;
    }

    public void setClientes(List<clientes> clientes) {
        this.clientes = clientes;
    }

    public void addPedidos(pedidos pedidos) {
        pedidos.add(pedidos);
    }

    public void addClientes(clientes clientes) {
        clientes.add(clientes);
    }
}
