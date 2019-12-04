package br.com.leonardonowacki.barbearia.controller;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.dao.ProdutoDAO;
import br.com.leonardonowacki.barbearia.interfaces.ProdutoListener;
import br.com.leonardonowacki.barbearia.javabeans.Produto;
import br.com.leonardonowacki.barbearia.view.CadastroProduto;
import java.sql.SQLException;
import java.util.List;

public class ProdutoController {
    
    public CadastroProduto tela() {
        return new CadastroProduto(new Interno());
    }

    private class Interno implements ProdutoListener {

        @Override
        public void cadastrar(Produto dados) throws ConnectionException {
            try {
                ProdutoDAO cadastrar = new ProdutoDAO();
                cadastrar.cadastrarProduto(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public void editar(Produto dados) throws ConnectionException {
            try {
                ProdutoDAO editar = new ProdutoDAO();
                editar.editarProduto(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public void excluir(Produto dados) throws ConnectionException {
            try {
                ProdutoDAO excluir = new ProdutoDAO();
                excluir.excluirProduto(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public List<Produto> listarTabela() throws ConnectionException {
            try {
                ProdutoDAO dao = new ProdutoDAO();
                List<Produto> lista = dao.listarProdutos();
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
