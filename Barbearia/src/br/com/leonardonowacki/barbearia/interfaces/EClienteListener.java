package br.com.leonardonowacki.barbearia.interfaces;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.javabeans.Cliente;
import java.util.List;

public interface EClienteListener {

    public void editar(Cliente dados) throws ConnectionException;

    public void excluir(Cliente dados) throws ConnectionException;

    public List<Cliente> listarTabela() throws ConnectionException;

    public void voltarCadastro();
    
    public void navegarParaCadastroClientes();

    public void navegarParaCadastroServico();

    public void navegarParaCadastroUsuarios();

    public void navegarParaCadastroProdutos();

    public void navegarParaAgenda();
    
    public void navegarParaRelatorio();
}
