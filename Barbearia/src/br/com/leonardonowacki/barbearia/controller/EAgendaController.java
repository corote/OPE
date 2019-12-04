package br.com.leonardonowacki.barbearia.controller;

import br.com.leonardonowacki.barbearia.dao.AgendamentoDAO;
import br.com.leonardonowacki.barbearia.dao.ClienteDAO;
import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.dao.ServicoDAO;
import br.com.leonardonowacki.barbearia.interfaces.EAgendaListener;
import br.com.leonardonowacki.barbearia.javabeans.Agendamento;
import br.com.leonardonowacki.barbearia.javabeans.Cliente;
import br.com.leonardonowacki.barbearia.javabeans.Servico;
import br.com.leonardonowacki.barbearia.view.EAgenda;
import java.sql.SQLException;
import java.util.List;

public class EAgendaController {
    
    public EAgenda tela() {
        return new EAgenda(new Interno());
    }

    private class Interno implements EAgendaListener {

        @Override
        public void voltarAgenda() {
            new AgendaController().tela();
        }

        @Override
        public void editar(Agendamento dados) throws ConnectionException {
            try {
                AgendamentoDAO editar = new AgendamentoDAO();
                editar.editarAgendamento(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public void excluir(Agendamento dados) throws ConnectionException {
            try {
                AgendamentoDAO excluir = new AgendamentoDAO();
                excluir.excluirAgendamento(dados);
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
        public List<Agendamento> listar() throws ConnectionException {
            try {
                AgendamentoDAO dao = new AgendamentoDAO();
                List<Agendamento> lista = dao.listarAgendamentos();
                return lista;
            } catch (SQLException e) {
                throw new ConnectionException(e);
            }
        }
        
        @Override
        public void navegarParaCadastroClientes() {
            new ClienteController().tela();
        }

        @Override
        public void navegarParaCadastroServico(){
            new ServicoController().tela();
        }

        @Override
        public void navegarParaCadastroUsuarios() {
            new UsuarioController().tela();
        }

        @Override
        public void navegarParaCadastroProdutos() {
            new ProdutoController().tela();
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
