package br.com.leonardonowacki.barbearia.interfaces;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.javabeans.Agendamento;
import br.com.leonardonowacki.barbearia.javabeans.Cliente;
import br.com.leonardonowacki.barbearia.javabeans.Servico;
import java.util.List;

public interface EAgendaListener {

    public void voltarAgenda();

    public void editar(Agendamento dados) throws ConnectionException;

    public void excluir(Agendamento dados) throws ConnectionException;

    public List<Cliente> preencherCliente() throws ConnectionException;

    public List<Servico> preencherServico() throws ConnectionException;

    public List<Agendamento> listar() throws ConnectionException;
    
    public void navegarParaCadastroClientes();

    public void navegarParaCadastroServico();

    public void navegarParaCadastroUsuarios();

    public void navegarParaCadastroProdutos();

    public void navegarParaAgenda();
    
    public void navegarParaRelatorio();
}
