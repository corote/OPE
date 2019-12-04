package br.com.leonardonowacki.barbearia.controller;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.dao.UsuarioDAO;
import br.com.leonardonowacki.barbearia.interfaces.UsuarioListener;
import br.com.leonardonowacki.barbearia.javabeans.Usuario;
import br.com.leonardonowacki.barbearia.view.CadastroUsuario;
import java.sql.SQLException;

public class UsuarioController {
    
    public CadastroUsuario tela() {
        return new CadastroUsuario(new Interno());
    }

    public class Interno implements UsuarioListener {

        @Override
        public void cadastrar(Usuario dados) throws ConnectionException {
            try {
                UsuarioDAO cadastrar = new UsuarioDAO();
                cadastrar.cadastrarUsuario(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public void vizualizar() {
            new EUsuarioController().tela();
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
