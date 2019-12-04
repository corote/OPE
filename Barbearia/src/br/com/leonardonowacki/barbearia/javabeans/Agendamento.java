package br.com.leonardonowacki.barbearia.javabeans;

import java.math.BigDecimal;

public class Agendamento {
    
    private final long id;
    private final String cliente;
    private final String servico;
    private final BigDecimal valor;
    private final String data;
    private final String horario;
    private final String observacao;

    public Agendamento(long id, String cliente, String Servico, BigDecimal valor, String data, String horario, String observacao) {
        this.id = id;
        this.cliente = cliente;
        this.servico = Servico;
        this.valor = valor;
        this.data = data;
        this.horario = horario;
        this.observacao = observacao;
    }

    public Agendamento(String cliente, String Servico, BigDecimal valor, String data, String horario, String observacao) {
        this.id = 0;
        this.cliente = cliente;
        this.servico = Servico;
        this.valor = valor;
        this.data = data;
        this.horario = horario;
        this.observacao = observacao;
    }

    public Agendamento(long id) {
        this.id = id;
        this.cliente = null;
        this.servico = null;
        this.valor = null;
        this.data = null;
        this.horario = null;
        this.observacao = null;
    }

    public long getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getServico() {
        return servico;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }
    
    public String getObservacao() {
        return observacao;
    }
}
