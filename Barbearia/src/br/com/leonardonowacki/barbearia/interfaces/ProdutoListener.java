package br.com.leonardonowacki.barbearia.interfaces;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.javabeans.Produto;
import java.util.List;

public interface ProdutoListener {

    public void cadastrar(Produto dados) throws ConnectionException;

    public void editar(Produto dados) throws ConnectionException;

    public void excluir(Produto dados) throws ConnectionException;

    public List<Produto> listarTabela() throws ConnectionException;

    public void voltarMenu();

    public void navegarParaCadastroCliente();

    public void navegarParaCadastroUsuario();

    public void navegarParaCadastroProduto();

    public void navegarParaCadastroServico();

    public void navegarParaAgenda();
    
    public void navegarParaRelatorio();
}
