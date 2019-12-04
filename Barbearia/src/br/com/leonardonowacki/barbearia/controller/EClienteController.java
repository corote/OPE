package br.com.leonardonowacki.barbearia.controller;

import br.com.leonardonowacki.barbearia.dao.ClienteDAO;
import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.interfaces.EClienteListener;
import br.com.leonardonowacki.barbearia.javabeans.Cliente;
import br.com.leonardonowacki.barbearia.view.ECliente;
import java.sql.SQLException;
import java.util.List;

public class EClienteController {
    
    public ECliente tela() {
        return new ECliente(new Interno());
    }

    public class Interno implements EClienteListener {

        @Override
        public void editar(Cliente dados) throws ConnectionException {
            try {
                ClienteDAO editar = new ClienteDAO();
                editar.editarCliente(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public void excluir(Cliente dados) throws ConnectionException {
            try {
                ClienteDAO excluir = new ClienteDAO();
                excluir.excluirCliente(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public List<Cliente> listarTabela() throws ConnectionException {
            try {
                ClienteDAO dao = new ClienteDAO();
                List<Cliente> lista = dao.listarClientes();
                return lista;
            } catch (SQLException e) {
                throw new ConnectionException(e);
            }
        }

        @Override
        public void voltarCadastro() {
            new ClienteController().tela();
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
