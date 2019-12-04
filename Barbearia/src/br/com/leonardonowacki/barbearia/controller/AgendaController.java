package br.com.leonardonowacki.barbearia.controller;

import br.com.leonardonowacki.barbearia.dao.AgendamentoDAO;
import br.com.leonardonowacki.barbearia.dao.ClienteDAO;
import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.dao.ServicoDAO;
import br.com.leonardonowacki.barbearia.interfaces.AgendaListener;
import br.com.leonardonowacki.barbearia.javabeans.Agendamento;
import br.com.leonardonowacki.barbearia.javabeans.Cliente;
import br.com.leonardonowacki.barbearia.javabeans.Servico;
import br.com.leonardonowacki.barbearia.view.Agenda;
import java.sql.SQLException;
import java.util.List;

public class AgendaController {
    
    public Agenda tela() {
        return new Agenda(new Interno());
    }

    private class Interno implements AgendaListener {

        @Override
        public void agendar(Agendamento dados) throws ConnectionException {
            try {
                AgendamentoDAO agendar = new AgendamentoDAO();
                agendar.cadastrarAgendamento(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public List<Cliente> preencherCliente() throws ConnectionException {
            try {
                ClienteDAO dao = new ClienteDAO();
                List<Cliente> listaCliente = dao.listar_nomeClientes();
                return listaCliente;                
            } catch (SQLException e) {
                throw new ConnectionException(e);
            }
        }

        @Override
        public List<Servico> preencherServico() throws ConnectionException {
            try {
                ServicoDAO dao = new ServicoDAO();
                List<Servico> listaServicos = dao.listar_descricaoServicos();
                return listaServicos;                
            } catch (SQLException e) {
                throw new ConnectionException(e);
            }
        }

        @Override
        public void vizualizar() {
            new EAgendaController().tela();
        }

        @Override
        public void voltarMenu() {
            new MenuController().tela();
        }

        @Override
        public void navegarParaCadastroCliente() {
            new ClienteController().tela();
        }

        @Override
        public void navegarParaCadastroUsuario() {
            new UsuarioController().tela();
        }

        @Override
        public void navegarParaCadastroProduto() {
            new ProdutoController().tela();
        }

        @Override
        public void navegarParaCadastroServico() {
            new ServicoController().tela();
        }

        @Override
        public void navegarParaAgenda() {
            new AgendaController().tela();
        }
        
        @Override
        public void navegarParaRelatorio() {
            new RelatorioController().tela();
        }
    }    
}
