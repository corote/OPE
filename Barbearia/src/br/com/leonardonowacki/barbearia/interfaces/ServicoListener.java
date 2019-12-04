package br.com.leonardonowacki.barbearia.interfaces;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.javabeans.Servico;
import java.util.List;

public interface ServicoListener {

    public void cadastrar(Servico dados) throws ConnectionException;

    public void editar(Servico dados) throws ConnectionException;

    public void excluir(Servico dados) throws ConnectionException;

    public List<Servico> listarTabela() throws ConnectionException;

    public void voltarMenu();

    public void navegarParaCadastroCliente();

    public void navegarParaCadastroUsuario();

    public void navegarParaCadastroProduto();

    public void navegarParaCadastroServico();

    public void navegarParaAgenda();
    
    public void navegarParaRelatorio();
}
