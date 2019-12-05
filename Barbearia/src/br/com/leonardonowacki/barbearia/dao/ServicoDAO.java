package br.com.leonardonowacki.barbearia.dao;

import br.com.leonardonowacki.barbearia.javabeans.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServicoDAO {
    
    private static final String CADASTRAR_SQL = "INSERT INTO servicos(descricao, valor) VALUES(?, ?)";
    private static final String EDITAR_SQL = "UPDATE servicos SET descricao = ?, valor = ? WHERE id_servico=?";
    private static final String EXCLUIR_SQL = "DELETE FROM servicos WHERE id_servico = ?";
    private static final String LISTAR_SQL = "SELECT * FROM servicos";
    private static final String SERVICO_SQL = "SELECT descricao FROM servicos";
            
    private final Connection conecta;
    
    public ServicoDAO() throws SQLException {
        this.conecta = Conexao.conectar();
    }
    
    public void cadastrarServico(Servico objeto) throws SQLException {
        try(PreparedStatement organizador = conecta.prepareStatement(CADASTRAR_SQL)) {
            organizador.setString(1, objeto.getDescricao());
            organizador.setString(2, objeto.getValor().toPlainString());            
            organizador.execute();
        }
    }
    
    public void editarServico(Servico objeto) throws SQLException {
        try(PreparedStatement organizador = conecta.prepareStatement(EDITAR_SQL)) {            
            organizador.setString(1, objeto.getDescricao());
            organizador.setString(2, objeto.getValor().toPlainString());
            organizador.setLong(3, objeto.getId());
            organizador.execute();
        }
    }
    
    public void excluirServico(Servico objeto) throws SQLException{
        try(PreparedStatement organizador = conecta.prepareStatement(EXCLUIR_SQL)) {            
            organizador.setLong(1,objeto.getId());            
            organizador.execute();
        }
    }
    
    public List<Servico> listarServicos() throws SQLException {
        List<Servico> listaServicos = new ArrayList<>();
        try(
                PreparedStatement declaracao = conecta.prepareStatement(LISTAR_SQL);
                ResultSet resultado = declaracao.executeQuery();
            ) {
            while(resultado.next()){
                Servico servico = new Servico(
                    resultado.getLong("id_servico"),
                    resultado.getString("descricao"),
                    resultado.getBigDecimal("valor"));

                listaServicos.add(servico);
            }
            return listaServicos;
        }
    }
    
    public ArrayList<Servico> listar_descricaoServicos() throws SQLException {
        ArrayList<Servico> listaServicos = new ArrayList<>();
        try(
                PreparedStatement declaracao = conecta.prepareStatement(SERVICO_SQL);
                ResultSet resultado = declaracao.executeQuery();
            ) {
            while(resultado.next()) {
                Servico servico = new Servico(
                    resultado.getString("descricao"));

                listaServicos.add(servico);
            }
            return listaServicos;
        }
    }
}