package br.com.leonardonowacki.barbearia.dao;

import br.com.leonardonowacki.barbearia.javabeans.Agendamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgendamentoDAO {
    
    private static final String CADASTRAR_SQL = "INSERT INTO agenda (cliente_agenda, servico_agenda, valor_agenda, data, horario, observacao) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String EDITAR_SQL = "UPDATE agenda SET cliente_agenda = ?, servico_agenda = ?, valor_agenda = ?, data = ?, horario = ?, observacao = ? WHERE id_agenda = ?";
    private static final String EXCLUIR_SQL = "DELETE FROM agenda WHERE id_agenda = ?";
    private static final String LISTAR_SQL = "SELECT * FROM agenda";

    private final Connection conecta;
    
    public AgendamentoDAO() throws SQLException {
        this.conecta = Conexao.conectar();
    }
    
    public void cadastrarAgendamento(Agendamento objeto) throws SQLException {
        try (PreparedStatement organizador = conecta.prepareStatement(CADASTRAR_SQL)) {
            organizador.setString(1, objeto.getCliente());
            organizador.setString(2, objeto.getServico());
            organizador.setString(3, objeto.getValor().toPlainString());
            organizador.setString(4, objeto.getData());
            organizador.setString(5, objeto.getHorario());
            organizador.setString(6, objeto.getObservacao());
            organizador.execute();
        }
    }
    
    public void editarAgendamento(Agendamento objeto) throws SQLException {
        try (PreparedStatement organizador = conecta.prepareStatement(EDITAR_SQL)) {
            organizador.setString(1, objeto.getCliente());
            organizador.setString(2, objeto.getServico());
            organizador.setString(3, objeto.getValor().toPlainString());
            organizador.setString(4, objeto.getData());
            organizador.setString(5, objeto.getHorario());
            organizador.setString(6, objeto.getObservacao());
            organizador.setLong(7, objeto.getId());
            organizador.execute();
        }
    }
    
    public void excluirAgendamento(Agendamento objeto) throws SQLException {
        try (PreparedStatement organizador = conecta.prepareStatement(EXCLUIR_SQL)) {
            organizador.setLong(1, objeto.getId());
            organizador.execute();
        }
    }
    
    public List<Agendamento> listarAgendamentos() throws SQLException {
        List<Agendamento> lista = new ArrayList<>();
        try (
                PreparedStatement declaracao = conecta.prepareStatement(LISTAR_SQL);
                ResultSet resultado = declaracao.executeQuery();
        ) {
            while (resultado.next()) {
                Agendamento agendamento = new Agendamento(
                    resultado.getLong("id_agenda"),
                    resultado.getString("cliente_agenda"),
                    resultado.getString("servico_agenda"),
                    resultado.getBigDecimal("valor_agenda"),
                    resultado.getString("data"),
                    resultado.getString("horario"),
                    resultado.getString("observacao"));
                lista.add(agendamento);
            }
            return lista;
        }
    }
}
