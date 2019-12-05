package br.com.leonardonowacki.barbearia.dao;

import br.com.leonardonowacki.barbearia.javabeans.Relatorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RelatorioDAO {
    
    private static final String SALVAR_SQL = "INSERT INTO relatorio (relatorio) VALUES (?)";
    private static final String EDITAR_SQL = "UPDATE relatorio SET relatorio = ? WHERE id_relatorio = ?";
    private static final String EXCLUIR_SQL = "DELETE FROM relatorio WHERE id_relatorio = ?";
    private static final String LISTAR_SQL = "SELECT * FROM relatorio";
    
    private final Connection conecta;
    
    public RelatorioDAO() throws SQLException {
        this.conecta = Conexao.conectar();
    }
    
    public void salvarRelatorio(Relatorio objeto) throws SQLException {
        try (PreparedStatement organizador = conecta.prepareStatement(SALVAR_SQL)) {            
            organizador.setString(1, objeto.getRelatorio());
            organizador.execute();
        }        
    }
    
    public void editarRelatorio(Relatorio objeto) throws SQLException {
        try (PreparedStatement organizador = conecta.prepareStatement(EDITAR_SQL)) {
            organizador.setString(1, objeto.getRelatorio());
            organizador.setLong(2, objeto.getId());            
            organizador.execute();
        }
    }
    
    public void excluirRelatorio(Relatorio objeto) throws SQLException {
        try(PreparedStatement organizador = conecta.prepareStatement(EXCLUIR_SQL)) {
            organizador.setLong(1, objeto.getId());
            organizador.execute();
        }
    }
    
    public List<Relatorio> listarRelatorio() throws SQLException {
        List<Relatorio> relatorio = new ArrayList<>();
        try (
            PreparedStatement declaracao = conecta.prepareStatement(LISTAR_SQL);
            ResultSet resultado = declaracao.executeQuery();
        ) {            
            while (resultado.next()) {
                Relatorio dados = new Relatorio(
                    resultado.getLong("id_relatorio"),
                    resultado.getString("relatorio"));

                relatorio.add(dados);
            }
            return relatorio;        
        }
    }
}
