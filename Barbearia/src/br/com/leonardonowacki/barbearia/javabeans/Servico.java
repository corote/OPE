package br.com.leonardonowacki.barbearia.javabeans;

import java.math.BigDecimal;

public class Servico {
    
    private final long id;
    private final String descricao;
    private final BigDecimal valor;
    
    public Servico(long id) {
        this.id = id;
        this.descricao = null;
        this.valor = null;
    }
    
    public Servico(String descricao, BigDecimal valor) {
        this.id = 0;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public Servico(long id, String descricao, BigDecimal valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public Servico(String descricao) {
        this.id = 0;
        this.descricao = descricao;
        this.valor = null;
    }

    public long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }
    
    @Override
    public String toString() {
        return descricao;
    }
}
