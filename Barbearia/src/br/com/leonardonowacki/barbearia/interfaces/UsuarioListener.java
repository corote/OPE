package br.com.leonardonowacki.barbearia.interfaces;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.javabeans.Usuario;

public interface UsuarioListener {

    public void cadastrar(Usuario dados) throws ConnectionException;

    public void vizualizar();

    public void voltarMenu();

    public void navegarParaCadastroCliente();

    public void navegarParaCadastroUsuario();

    public void navegarParaCadastroProduto();

    public void navegarParaCadastroServico();

    public void navegarParaAgenda();
    
    public void navegarParaRelatorio();
}
