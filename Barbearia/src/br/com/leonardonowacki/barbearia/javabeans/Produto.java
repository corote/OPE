package br.com.leonardonowacki.barbearia.javabeans;

import java.math.BigDecimal;

public class Produto {
    
    private final long id;
    private final String nome;
    private final int quantidade;
    private final BigDecimal valor;
    
    public Produto(long id) {
        this.id = id;
        this.nome = null;
        this.quantidade = 0;
        this.valor = null;
    }
    
    public Produto(String nome, int quantidade, BigDecimal valor) {
        this.id = 0;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
    public Produto(long id, String nome, int quantidade, BigDecimal valor) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }   
}