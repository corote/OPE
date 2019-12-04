package br.com.leonardonowacki.barbearia.javabeans;

public class Relatorio {
    
    private final long id;
    private final String relatorio;

    public Relatorio(long id, String relatorio) {
        this.id = id;
        this.relatorio = relatorio;
    }

    public Relatorio(long id) {
        this.id = id;
        this.relatorio = null;
    }
    
    public Relatorio(String relatorio) {
        this.id = 0;
        this.relatorio = relatorio;
    }

    public long getId() {
        return id;
    }

    public String getRelatorio() {
        return relatorio;
    }
}
