package br.com.leonardonowacki.barbearia.interfaces;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.javabeans.Cliente;

public interface ClienteListener {

    public void cadastrar(Cliente dados) throws ConnectionException;

    public void vizualizar();

    public void voltarMenu();

    public void navegarParaCadastroCliente();

    public void navegarParaCadastroUsuario();

    public void navegarParaCadastroProduto();

    public void navegarParaCadastroServico();

    public void navegarParaAgenda();
    
    public void navegarParaRelatorio();
}
