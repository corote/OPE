package br.com.leonardonowacki.barbearia.controller;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.dao.ServicoDAO;
import br.com.leonardonowacki.barbearia.interfaces.ServicoListener;
import br.com.leonardonowacki.barbearia.javabeans.Servico;
import br.com.leonardonowacki.barbearia.view.CadastroServico;
import java.sql.SQLException;
import java.util.List;

public class ServicoController {
    
    public CadastroServico tela() {
        return new CadastroServico(new Interno());
    }
    
    private class Interno implements ServicoListener {

        @Override
        public void cadastrar(Servico dados) throws ConnectionException {
            try {
                ServicoDAO cadastrar = new ServicoDAO();
                cadastrar.cadastrarServico(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public void editar(Servico dados) throws ConnectionException {
            try {
                ServicoDAO editar = new ServicoDAO();
                editar.editarServico(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public void excluir(Servico dados) throws ConnectionException {
            try {
                ServicoDAO excluir = new ServicoDAO();
                excluir.excluirServico(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public List<Servico> listarTabela() throws ConnectionException {
            try {
                ServicoDAO dao = new ServicoDAO();
                List<Servico> lista = dao.listarServicos();
                return lista;
            } catch (SQLException e) {
                throw new ConnectionException(e);
            }
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
