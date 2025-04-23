package main.java.br.ucb.entidade;

public class Cliente {
    public String nome;
    public boolean inadimplente;

    public Cliente(String nome, boolean inadimplente) {
        this.nome = nome;
        this.inadimplente = inadimplente;
    }
}
