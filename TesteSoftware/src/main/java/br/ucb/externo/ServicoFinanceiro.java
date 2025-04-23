package main.java.br.ucb.externo;

import main.java.br.ucb.entidade.Cliente;
import main.java.br.ucb.entidade.NotaFiscal;

public class ServicoFinanceiro {
    public void gerarCobranca(NotaFiscal nf) {
        System.out.println("Financeiro: Gerando cobrança para NF " + nf.numero);
    }

    public void enviarCobrancaInadimplente(Cliente cliente) {
        System.out.println("Financeiro: Cliente " + cliente.nome + " inadimplente. Enviando cobrança.");
    }
}
