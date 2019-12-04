package br.com.leonardonowacki.barbearia.controller;

import br.com.leonardonowacki.barbearia.dao.ClienteDAO;
import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.interfaces.ClienteListener;
import br.com.leonardonowacki.barbearia.javabeans.Cliente;
import br.com.leonardonowacki.barbearia.view.CadastroCliente;
import java.sql.SQLException;

public class ClienteController {
    
    public CadastroCliente tela() {
        return new CadastroCliente(new Interno());
    }

    public class Interno implements ClienteListener {

        @Override
        public void cadastrar(Cliente dados) throws ConnectionException {
            try {
                ClienteDAO cadastrar = new ClienteDAO();
                cadastrar.cadastrarCliente(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public void vizualizar() {
            new EClienteController().tela();
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
