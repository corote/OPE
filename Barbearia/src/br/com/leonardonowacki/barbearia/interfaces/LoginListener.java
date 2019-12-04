package br.com.leonardonowacki.barbearia.interfaces;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.javabeans.Usuario;
import br.com.leonardonowacki.barbearia.view.Login;
import java.util.List;

public interface LoginListener {
    
    public void fazerLogin(Login login, String usuario, String senha) throws ConnectionException;
    
    public List<Usuario> listar() throws ConnectionException;
}
