package br.com.leonardonowacki.barbearia.dao;

import br.com.leonardonowacki.barbearia.javabeans.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    
    private static final String CADASTRAR_SQL = "INSERT INTO produtos(nome, quantidade, valor) VALUES(?, ?, ?)";
    private static final String EDITAR_SQL = "UPDATE produtos SET nome = ?, quantidade = ?, valor = ? WHERE id_produto = ?";
    private static final String EXCLUIR_SQL = "DELETE FROM produtos WHERE id_produto = ?";
    private static final String LISTAR_SQL = "SELECT * FROM produtos";
            
    private final Connection conecta;
    
    public ProdutoDAO() throws SQLException {
        this.conecta = Conexao.conectar();
    }
    
    public void cadastrarProduto(Produto objeto) throws SQLException {
        try(PreparedStatement organizador = conecta.prepareStatement(CADASTRAR_SQL)) {
            organizador.setString(1, objeto.getNome());
            organizador.setInt(2, objeto.getQuantidade());
            organizador.setString(3, objeto.getValor().toPlainString());            
            organizador.execute();
        }
    }
    
    public void editarProduto(Produto objeto) throws SQLException {
        try(PreparedStatement organizador = conecta.prepareStatement(EDITAR_SQL)) {            
            organizador.setString(1, objeto.getNome());
            organizador.setInt(2, objeto.getQuantidade());
            organizador.setString(3, objeto.getValor().toPlainString());
            organizador.setLong(4, objeto.getId());
            organizador.execute();
        }
    }
    
    public void excluirProduto(Produto objeto) throws SQLException {
        try(PreparedStatement organizador = conecta.prepareStatement(EXCLUIR_SQL)) {            
            organizador.setLong(1, objeto.getId());            
            organizador.execute();
        }
    }
    
    public List<Produto> listarProdutos() throws SQLException {
        List<Produto> listaProdutos = new ArrayList<>();
        try(
            PreparedStatement declaracao = conecta.prepareStatement(LISTAR_SQL);
            ResultSet resultado = declaracao.executeQuery();
        ) {        
            while(resultado.next()){
                Produto produto = new Produto(
                    resultado.getLong("id_produto"),
                    resultado.getString("nome"),
                    resultado.getInt("quantidade"),
                    resultado.getBigDecimal("valor"));

                listaProdutos.add(produto);
            }
            return listaProdutos;
        }
    }
}
