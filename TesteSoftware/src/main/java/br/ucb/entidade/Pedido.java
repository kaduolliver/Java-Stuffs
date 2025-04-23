package main.java.br.ucb.entidade;

public class Pedido {
    public int id;
    public Cliente cliente;
    public boolean finalizado = false;
    public boolean cancelado = false;

    public Pedido(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }
}
