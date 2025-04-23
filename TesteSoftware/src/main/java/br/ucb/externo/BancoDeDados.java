package main.java.br.ucb.externo;

import main.java.br.ucb.entidade.Cliente;

import java.util.Random;

public class BancoDeDados {
    private static final Random random = new Random();

    public static Cliente buscarCliente(String nome) {
        boolean inadimplente = random.nextBoolean();
        return new Cliente(nome, inadimplente);
    }
}
