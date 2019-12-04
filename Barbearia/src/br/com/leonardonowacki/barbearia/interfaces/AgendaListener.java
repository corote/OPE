package br.com.leonardonowacki.barbearia.interfaces;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.javabeans.Cliente;
import br.com.leonardonowacki.barbearia.javabeans.Agendamento;
import br.com.leonardonowacki.barbearia.javabeans.Servico;
import java.util.List;

public interface AgendaListener {

    public void agendar(Agendamento dados) throws ConnectionException;

    public List<Cliente> preencherCliente() throws ConnectionException;

    public List<Servico> preencherServico() throws ConnectionException;

    public void vizualizar();

    public void voltarMenu();

    public void navegarParaCadastroCliente();

    public void navegarParaCadastroUsuario();

    public void navegarParaCadastroProduto();

    public void navegarParaCadastroServico();

    public void navegarParaAgenda();
    
    public void navegarParaRelatorio();
}
