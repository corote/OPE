package br.com.leonardonowacki.barbearia.interfaces;


import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.javabeans.Usuario;
import java.util.List;

public interface EUsuarioListener {

    public void editar(Usuario dados) throws ConnectionException;

    public void excluir(Usuario dados) throws ConnectionException;

    public List<Usuario> listarTabela() throws ConnectionException;

    public void voltarCadastro();
    
    public void navegarParaCadastroClientes();

    public void navegarParaCadastroServico();

    public void navegarParaCadastroUsuarios();

    public void navegarParaCadastroProdutos();

    public void navegarParaAgenda();
    
    public void navegarParaRelatorio();
}
