package main.java.br.ucb.entidade;

public class NotaFiscal {
    public int numero;
    public Pedido pedido;

    public NotaFiscal(int numero, Pedido pedido) {
        this.numero = numero;
        this.pedido = pedido;
    }
}
