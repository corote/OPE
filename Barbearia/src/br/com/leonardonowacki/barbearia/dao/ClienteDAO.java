package br.com.leonardonowacki.barbearia.dao;

import br.com.leonardonowacki.barbearia.javabeans.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    
    private static final String INSERIR_SQL = "INSERT INTO clientes(nome, sexo, celular, email, endereco) VALUES(?, ?, ?, ?, ?)";
    private static final String EDITAR_SQL = "UPDATE clientes SET nome = ?, sexo = ?, celular = ?, email = ?, endereco = ? WHERE id_cliente = ?";
    private static final String EXCLUIR_SQL = "DELETE FROM clientes WHERE id_cliente=?";
    private static final String LISTAR_SQL = "SELECT * FROM clientes";
    private static final String CLIENTE_SQL = "SELECT nome FROM clientes";
    
    private final Connection conecta;
    
    public ClienteDAO() throws SQLException {
        this.conecta = Conexao.conectar();
    }
    
    public void cadastrarCliente(Cliente objeto) throws SQLException {
        try (PreparedStatement organizador = conecta.prepareStatement(INSERIR_SQL)) {            
            organizador.setString(1, objeto.getNome());
            organizador.setString(2, objeto.getSexo());
            organizador.setString(3, objeto.getCelular());
            organizador.setString(4, objeto.getEmail());
            organizador.setString(5, objeto.getEndereco());            
            organizador.execute();
        }        
    }
    
    public void editarCliente(Cliente objeto) throws SQLException {
        try (PreparedStatement organizador = conecta.prepareStatement(EDITAR_SQL)) {
            organizador.setString(1, objeto.getNome());
            organizador.setString(2, objeto.getSexo());
            organizador.setString(3, objeto.getCelular());
            organizador.setString(4, objeto.getEmail());
            organizador.setString(5, objeto.getEndereco());
            organizador.setLong(6, objeto.getId());            
            organizador.execute();
        }
    }
    
    public void excluirCliente(Cliente objeto) throws SQLException {
        try(PreparedStatement organizador = conecta.prepareStatement(EXCLUIR_SQL)) {
            organizador.setLong(1, objeto.getId());
            organizador.execute();
        }
    }
    
    public List<Cliente> listarClientes() throws SQLException {
        List<Cliente> listaClientes = new ArrayList<>();
        try (
            PreparedStatement declaracao = conecta.prepareStatement(LISTAR_SQL);
            ResultSet resultado = declaracao.executeQuery();
        ) {            
            while (resultado.next()) {
                Cliente clientes = new Cliente(
                    resultado.getLong("id_cliente"),
                    resultado.getString("nome"),
                    resultado.getString("sexo"),
                    resultado.getString("celular"),
                    resultado.getString("email"),
                    resultado.getString("endereco"));

                listaClientes.add(clientes);
            }
            return listaClientes;        
        }
    }
    
    public ArrayList<Cliente> listar_nomeClientes() throws SQLException {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        try (
            PreparedStatement declaracao = conecta.prepareStatement(CLIENTE_SQL);
            ResultSet resultado = declaracao.executeQuery();
        ) {            
            while (resultado.next()) {
                Cliente clientes = new Cliente(
                    resultado.getString("nome"));

                listaClientes.add(clientes);
            }
            return listaClientes;
        }
    }
}