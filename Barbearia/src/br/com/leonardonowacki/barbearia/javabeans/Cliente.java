package br.com.leonardonowacki.barbearia.javabeans;

public class Cliente {
    
    private final long id;
    private final String nome;
    private final String sexo;
    private final String celular;
    private final String email;
    private final String endereco;
    
    public Cliente(long id) {
        this.id = id;
        this.nome = null;
        this.sexo = null;
        this.celular = null;
        this.email = null;
        this.endereco = null;
    }
    
    public Cliente(String nome) {
        this.id  =0;
        this.nome = nome;
        this.sexo = null;
        this.celular = null;
        this.email = null;
        this.endereco = null;
    }
    
    public Cliente(String nome, String sexo, String celular, String email, String endereco) {
        this.id  =0;
        this.nome = nome;
        this.sexo = sexo;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
    }
    public Cliente(long id, String nome, String sexo, String celular, String email, String endereco) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
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

    public String getEndereco() {
        return endereco;
    }
    
    @Override
    public String toString() {
        return nome;
    }
}