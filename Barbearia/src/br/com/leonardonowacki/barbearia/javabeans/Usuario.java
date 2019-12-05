package br.com.leonardonowacki.barbearia.javabeans;

public class Usuario {
    
    private final long id;
    private final String nome;
    private final String sexo;
    private final String celular;
    private final String email;
    private final String cpf;
    private final String rg;
    private final String login;
    private final String senha;
    
    public Usuario(long id) {
        this.id = id;
        this.nome = null;
        this.sexo = null;
        this.celular = null;
        this.email = null;
        this.cpf = null;
        this.rg = null;
        this.login = null;
        this.senha = null;
    }
        
    public Usuario(String nome, String sexo, String celular, String email, String cpf, String rg, String login, String senha) {
        this.id = 0;
        this.nome = nome;
        this.sexo = sexo;
        this.celular = celular;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.login = login;
        this.senha = senha;
    }
    
    public Usuario(long id, String nome, String sexo, String celular, String email, String cpf, String rg, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.celular = celular;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.login = login;
        this.senha = senha;
    }
    
    public Usuario(String login, String senha) {
        this.id = 0;
        this.nome = null;
        this.sexo = null;
        this.celular = null;
        this.email = null;
        this.cpf = null;
        this.rg = null;
        this.login = login;
        this.senha = senha;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
    
    @Override
    public String toString() {
        return login + senha;        
    }
}
