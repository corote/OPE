package br.com.leonardonowacki.barbearia.controller;

import br.com.leonardonowacki.barbearia.interfaces.MenuListener;
import br.com.leonardonowacki.barbearia.view.Menu;

public class MenuController {
    
    public Menu tela() {
        return new Menu(new Interno());
    }

    private class Interno implements MenuListener {
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
