package main.java.br.ucb.app;

import main.java.br.ucb.controle.PedidoCtrl;

public class Main {
    public static void main(String[] args) {
        PedidoCtrl controller = new PedidoCtrl();
        controller.processarPedido("Carlos Eduardo", 1);
    }
}
