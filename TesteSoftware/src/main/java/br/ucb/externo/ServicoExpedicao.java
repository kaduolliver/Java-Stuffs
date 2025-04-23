package main.java.br.ucb.externo;

import main.java.br.ucb.entidade.NotaFiscal;

public class ServicoExpedicao {
    public void separarMercadoria(NotaFiscal nf) {
        System.out.println("Expedição: Separando mercadoria para NF " + nf.numero);
    }
}
