package TrabalhoPOO;
public class Pedido extends Pizza{
    private String nomeCliente;
    private double preco;
    
    public Pedido(){}

    public String getPedido() {
        return nomeCliente;
    }

    public void setPedido(String pedido) {
        this.nomeCliente = pedido;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}

