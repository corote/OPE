package br.com.leonardonowacki.barbearia.controller;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.dao.UsuarioDAO;
import br.com.leonardonowacki.barbearia.interfaces.EUsuarioListener;
import br.com.leonardonowacki.barbearia.javabeans.Usuario;
import br.com.leonardonowacki.barbearia.view.EUsuario;
import java.sql.SQLException;
import java.util.List;

public class EUsuarioController {
    
    public EUsuario tela() {
        return new EUsuario(new Interno());
    }

    public class Interno implements EUsuarioListener {

        @Override
        public void editar(Usuario dados) throws ConnectionException {
            try {
                UsuarioDAO editar = new UsuarioDAO();
                editar.editarUsuario(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public void excluir(Usuario dados) throws ConnectionException {
            try {
                UsuarioDAO excluir = new UsuarioDAO();
                excluir.excluirUsuario(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public List<Usuario> listarTabela() throws ConnectionException {
            try {
                UsuarioDAO dao = new UsuarioDAO();
                List<Usuario> lista = dao.listarUsuarios();
                return lista;
            } catch (SQLException e) {
                throw new ConnectionException(e);
            }
        }

        @Override
        public void voltarCadastro() {
            new UsuarioController().tela();
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
