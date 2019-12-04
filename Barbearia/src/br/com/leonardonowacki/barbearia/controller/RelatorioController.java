package br.com.leonardonowacki.barbearia.controller;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.dao.RelatorioDAO;
import br.com.leonardonowacki.barbearia.interfaces.RelatorioListener;
import br.com.leonardonowacki.barbearia.javabeans.Relatorio;
import br.com.leonardonowacki.barbearia.view.Trabalho;
import java.sql.SQLException;
import java.util.List;

public class RelatorioController {
    
    public Trabalho tela() {
        return new Trabalho(new Interno());
    }
    
    public class Interno implements RelatorioListener {
        
        @Override
        public void salvar(Relatorio dados) throws ConnectionException {
            try {
                RelatorioDAO cadastrar = new RelatorioDAO();
                cadastrar.salvarRelatorio(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public void editar(Relatorio dados) throws ConnectionException {
            try {
                RelatorioDAO editar = new RelatorioDAO();
                editar.editarRelatorio(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }

        @Override
        public void excluir(Relatorio dados) throws ConnectionException {
            try {
                RelatorioDAO excluir = new RelatorioDAO();
                excluir.excluirRelatorio(dados);
            } catch (SQLException x) {
                throw new ConnectionException(x);
            }
        }
        
        public List<Relatorio> listarTabela() throws ConnectionException {
            try {
                RelatorioDAO dao = new RelatorioDAO();
                List<Relatorio> lista = dao.listarRelatorio();
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
        public void voltarMenu() {
            new MenuController().tela();
        }
        
        @Override
        public void navegarParaRelatorio() {
            new RelatorioController().tela();
        }
    }
}
