package main.java.br.ucb.controle;

import main.java.br.ucb.entidade.Cliente;
import main.java.br.ucb.entidade.Pedido;
import main.java.br.ucb.entidade.NotaFiscal;
import main.java.br.ucb.externo.BancoDeDados;
import main.java.br.ucb.externo.ServicoExpedicao;
import main.java.br.ucb.externo.ServicoFinanceiro;

import java.util.Random;

public class PedidoCtrl {
    public void processarPedido(String nomeCliente, int idPedido) {
        Cliente cliente = BancoDeDados.buscarCliente(nomeCliente);
        Pedido pedido = new Pedido(idPedido, cliente);

        if (cliente.inadimplente) {
            new ServicoFinanceiro().enviarCobrancaInadimplente(cliente);
            pedido.cancelado = true;
            System.out.println("Pedido cancelado por inadimplência.");
            return;
        }

        NotaFiscal nf = new NotaFiscal(new Random().nextInt(1000), pedido);
        new ServicoExpedicao().separarMercadoria(nf);
        new ServicoFinanceiro().gerarCobranca(nf);

        pedido.finalizado = true;
        System.out.println("Pedido finalizado com sucesso.");
    }
}
