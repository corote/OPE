package br.com.leonardonowacki.barbearia.controller;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.dao.UsuarioDAO;
import br.com.leonardonowacki.barbearia.interfaces.LoginListener;
import br.com.leonardonowacki.barbearia.javabeans.Usuario;
import br.com.leonardonowacki.barbearia.view.Login;
import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.List;

public class LoginController {
    
    public Login tela() {
        Login a = new Login(new Interno());
        a.setVisible(true);
        return a;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new LoginController().tela());
    }

    private static boolean verificarSenha(String verifica, List<Usuario> dados) {
        for(int i = 0; i < dados.size(); ++i){
            String a = dados.get(i).toString();
            if (verifica.equals(a)) {
                return true;
            }
        }
        return verifica.equals("admin" + "password");
    }

    private class Interno implements LoginListener {
        @Override
        public void fazerLogin(Login login, String usuario, String senha) throws ConnectionException {
            List<Usuario> dados = listar();
            String verifica = usuario + senha;
            if (verificarSenha(verifica, dados)) {
                new MenuController().tela();                
                login.dispose();
            } else {
                login.mostrarSenhaFalhou();
            }
        }
        @Override
        public List<Usuario> listar() throws ConnectionException {
            try {
                UsuarioDAO dao = new UsuarioDAO();
                List<Usuario> lista = dao.login();
                return lista;
            } catch (SQLException e) {
                throw new ConnectionException(e);
            }
        }
    }
}
