public class pedidos {
    public clientes cliente;
    public String produto;
    public double valor;
    public int codigo;

    public pedidos() {
    }
    public pedidos(clientes cliente, String produto, double valor, int codigo){

        this.cliente = cliente;
        this.produto = produto;
        this.valor = valor;
        this.codigo = codigo;
    }

    public clientes getCliente() {
        return cliente;
    }

    public void setCliente(clientes cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}


