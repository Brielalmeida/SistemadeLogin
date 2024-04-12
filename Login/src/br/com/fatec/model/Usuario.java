package br.com.fatec.model;

public class Usuario {
    private long id;
    private String nome;
    private String login;
    private String senha;

    public Usuario(long id, String nome, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "\nID: " + id +" | Nome: " +nome+ " | Login: " + login + " | Senha: " + senha;
    }
    
    
}
