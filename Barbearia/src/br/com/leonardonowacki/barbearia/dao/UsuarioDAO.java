package br.com.leonardonowacki.barbearia.dao;

import br.com.leonardonowacki.barbearia.javabeans.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    
    private static final String CADASTRAR_SQL = "INSERT INTO usuarios(nome, sexo, celular, email, cpf, rg, login, senha) values(?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String EDITAR_SQL = "UPDATE usuarios SET nome = ?, sexo = ?, celular = ?, email = ?, cpf = ?, rg = ?, login = ?, senha = ? WHERE id_usuario = ?";
    private static final String EXCLUIR_SQL = "DELETE FROM usuarios WHERE id_usuario = ?";
    private static final String LISTAR_SQL = "SELECT * FROM usuarios";
    private static final String LOGIN_SQL = "SELECT login, senha FROM usuarios";
             
    private final Connection conecta;
    
    public UsuarioDAO() throws SQLException{
        this.conecta = Conexao.conectar();
    }
    
    public void cadastrarUsuario(Usuario objeto) throws SQLException {
        try(PreparedStatement organizador = conecta.prepareStatement(CADASTRAR_SQL)) {            
            organizador.setString(1, objeto.getNome());
            organizador.setString(2, objeto.getSexo());
            organizador.setString(3, objeto.getCelular());
            organizador.setString(4, objeto.getEmail());
            organizador.setString(5, objeto.getCpf());
            organizador.setString(6, objeto.getRg());
            organizador.setString(7, objeto.getLogin());
            organizador.setString(8, objeto.getSenha());            
            organizador.execute();
        }
    }
    
    public void editarUsuario(Usuario objeto) throws SQLException {
        try(PreparedStatement organizador = conecta.prepareStatement(EDITAR_SQL)) {            
            organizador.setString(1, objeto.getNome());
            organizador.setString(2, objeto.getSexo());
            organizador.setString(3, objeto.getCelular());
            organizador.setString(4, objeto.getEmail());
            organizador.setString(5, objeto.getCpf());
            organizador.setString(6, objeto.getRg());
            organizador.setString(7, objeto.getLogin());
            organizador.setString(8, objeto.getSenha());
            organizador.setLong(9, objeto.getId());            
            organizador.execute();
        }
    }
    
    public void excluirUsuario(Usuario objeto) throws SQLException {
        try(PreparedStatement organizador = conecta.prepareStatement(EXCLUIR_SQL)) {            
            organizador.setLong(1,objeto.getId());            
            organizador.execute();
        }
    }
    
    public List<Usuario> listarUsuarios() throws SQLException {
        List<Usuario> listausuarios = new ArrayList<>();
        try(
                PreparedStatement declaracao = conecta.prepareStatement(LISTAR_SQL);
                ResultSet resultado = declaracao.executeQuery();
        ) {
            while(resultado.next()) {
                Usuario usuarios = new Usuario(
                    resultado.getLong("id_usuario"),
                    resultado.getString("nome"),
                    resultado.getString("sexo"),
                    resultado.getString("celular"),
                    resultado.getString("email"),
                    resultado.getString("cpf"),
                    resultado.getString("rg"),
                    resultado.getString("login"),
                    resultado.getString("senha"));
                listausuarios.add(usuarios);
            }
            return listausuarios;
        }
    }
    
    public List<Usuario> login() throws SQLException {
        List<Usuario> login = new ArrayList<>();
        try (
                PreparedStatement declaracao = conecta.prepareStatement(LOGIN_SQL);
                ResultSet resultado = declaracao.executeQuery();
        ) {
            while(resultado.next()) {
                Usuario usuario = new Usuario(
                    resultado.getString("login"),
                    resultado.getString("senha"));
                login.add(usuario);
            }
        }
        return login;
    }
}
