package br.com.leonardonowacki.barbearia.interfaces;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.javabeans.Relatorio;
import java.util.List;

public interface RelatorioListener {
    
    public void salvar(Relatorio dados) throws ConnectionException;

    public void editar(Relatorio dados) throws ConnectionException;

    public void excluir(Relatorio dados) throws ConnectionException;
    
    public List<Relatorio> listarTabela() throws ConnectionException;
    
    public void navegarParaCadastroClientes();

    public void navegarParaCadastroServico();

    public void navegarParaCadastroUsuarios();

    public void navegarParaCadastroProdutos();

    public void navegarParaAgenda();
    
    public void voltarMenu();
    
    public void navegarParaRelatorio();
}

