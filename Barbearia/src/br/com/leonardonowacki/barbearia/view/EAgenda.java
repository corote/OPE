package br.com.leonardonowacki.barbearia.view;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.interfaces.EAgendaListener;
import br.com.leonardonowacki.barbearia.javabeans.Agendamento;
import br.com.leonardonowacki.barbearia.javabeans.Cliente;
import br.com.leonardonowacki.barbearia.javabeans.Servico;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EAgenda extends javax.swing.JFrame {
    
    private final EAgendaListener listener;

    public EAgenda(EAgendaListener listener) {
        initComponents();
        this.listener = listener;
        this.setVisible(true);
    }
    
    public void limparTela() {
        View.limpar(textValorEA, textObservacaoEA, textHorarioEA, textDataEA);
    }
    
    /*public void atualizaValor(){
    Servico servico = (Servico) textServicoEA.getSelectedItem();
    setarValor(servico.getValor());
    }
    
    public void setarValor(BigDecimal valor) {
    textValorEA.setText(valor+"");
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelCodigoEAgenda = new javax.swing.JLabel();
        Botao_EAgendaVoltar_MenuPrincipal = new javax.swing.JButton();
        LabelEAgenda = new javax.swing.JLabel();
        LabelClienteEAgenda = new javax.swing.JLabel();
        LabelServicoEAgenda = new javax.swing.JLabel();
        LabelValorEAgenda = new javax.swing.JLabel();
        LabelObservacaoEAgenda = new javax.swing.JLabel();
        LabelDataEAgenda = new javax.swing.JLabel();
        LabelHoraEAgenda = new javax.swing.JLabel();
        textClienteEA = new javax.swing.JComboBox<>();
        textServicoEA = new javax.swing.JComboBox<>();
        textId = new javax.swing.JTextField();
        textDataEA = new javax.swing.JFormattedTextField();
        textValorEA = new javax.swing.JTextField();
        TextArea_Observacao = new javax.swing.JScrollPane();
        textObservacaoEA = new javax.swing.JTextArea();
        Tabela = new javax.swing.JScrollPane();
        tabelaAgendamentos = new javax.swing.JTable();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        textHorarioEA = new javax.swing.JFormattedTextField();
        EAgenda_PainelFundo = new javax.swing.JLabel();
        EAgenda_Fundo = new javax.swing.JLabel();
        Barra_Menu = new javax.swing.JMenuBar();
        Manu_Cadastro = new javax.swing.JMenu();
        MenuItem_Cliente = new javax.swing.JMenuItem();
        MenuItem_Servico = new javax.swing.JMenuItem();
        MenuItem_Produto = new javax.swing.JMenuItem();
        MenuItem_Usuario = new javax.swing.JMenuItem();
        Menu_Operacao = new javax.swing.JMenu();
        MenuItem_Agendar = new javax.swing.JMenuItem();
        Menu_Relatorio = new javax.swing.JMenu();
        MenuItem_Trabalho = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCodigoEAgenda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelCodigoEAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelCodigoEAgenda.setText("Codigo");
        getContentPane().add(LabelCodigoEAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, -1, -1));

        Botao_EAgendaVoltar_MenuPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        Botao_EAgendaVoltar_MenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Botao_EAgendaVoltar_MenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        Botao_EAgendaVoltar_MenuPrincipal.setText("Voltar");
        Botao_EAgendaVoltar_MenuPrincipal.setToolTipText("");
        Botao_EAgendaVoltar_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_EAgendaVoltar_MenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_EAgendaVoltar_MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, -1));

        LabelEAgenda.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LabelEAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelEAgenda.setText("Edição");
        getContentPane().add(LabelEAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        LabelClienteEAgenda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelClienteEAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelClienteEAgenda.setText("Cliente");
        getContentPane().add(LabelClienteEAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        LabelServicoEAgenda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelServicoEAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelServicoEAgenda.setText("Serviço");
        getContentPane().add(LabelServicoEAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        LabelValorEAgenda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelValorEAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelValorEAgenda.setText("Valor R$");
        getContentPane().add(LabelValorEAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        LabelObservacaoEAgenda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelObservacaoEAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelObservacaoEAgenda.setText("Observação");
        getContentPane().add(LabelObservacaoEAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 110, -1));

        LabelDataEAgenda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelDataEAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelDataEAgenda.setText("Data");
        getContentPane().add(LabelDataEAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, -1, -1));

        LabelHoraEAgenda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelHoraEAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelHoraEAgenda.setText("Hora");
        getContentPane().add(LabelHoraEAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, -1, -1));
        getContentPane().add(textClienteEA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 300, 40));

        textServicoEA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                textServicoEAItemStateChanged(evt);
            }
        });
        getContentPane().add(textServicoEA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 300, 40));

        textId.setToolTipText("");
        getContentPane().add(textId, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, 40, 40));

        try {
            textDataEA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(textDataEA, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 290, 40));

        textValorEA.setToolTipText("");
        getContentPane().add(textValorEA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 300, 40));

        textObservacaoEA.setColumns(20);
        textObservacaoEA.setRows(5);
        TextArea_Observacao.setViewportView(textObservacaoEA);

        getContentPane().add(TextArea_Observacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 300, 100));

        tabelaAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cleinte", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        tabelaAgendamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAgendamentosMouseClicked(evt);
            }
        });
        Tabela.setViewportView(tabelaAgendamentos);

        getContentPane().add(Tabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, 1090, 300));

        botaoEditar.setBackground(new java.awt.Color(0, 0, 0));
        botaoEditar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botaoEditar.setForeground(new java.awt.Color(255, 255, 255));
        botaoEditar.setText("Editar");
        botaoEditar.setToolTipText("");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 400, 50));

        botaoExcluir.setBackground(new java.awt.Color(0, 0, 0));
        botaoExcluir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluir.setText("Excluir");
        botaoExcluir.setToolTipText("");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 400, 50));

        try {
            textHorarioEA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(textHorarioEA, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, 40, 40));

        EAgenda_PainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(EAgenda_PainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        EAgenda_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/AgendaFundo.jpg"))); // NOI18N
        getContentPane().add(EAgenda_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 1000));

        Manu_Cadastro.setText("Cadastro");
        Manu_Cadastro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        MenuItem_Cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuItem_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/icons/cliente.png"))); // NOI18N
        MenuItem_Cliente.setText("Cliente");
        MenuItem_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ClienteActionPerformed(evt);
            }
        });
        Manu_Cadastro.add(MenuItem_Cliente);

        MenuItem_Servico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuItem_Servico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/icons/serviços.png"))); // NOI18N
        MenuItem_Servico.setText("Serviço");
        MenuItem_Servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ServicoActionPerformed(evt);
            }
        });
        Manu_Cadastro.add(MenuItem_Servico);

        MenuItem_Produto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuItem_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/icons/produtos.png"))); // NOI18N
        MenuItem_Produto.setText("Produtos");
        MenuItem_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ProdutoActionPerformed(evt);
            }
        });
        Manu_Cadastro.add(MenuItem_Produto);

        MenuItem_Usuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuItem_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/icons/usuarios.png"))); // NOI18N
        MenuItem_Usuario.setText("Usuário");
        MenuItem_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_UsuarioActionPerformed(evt);
            }
        });
        Manu_Cadastro.add(MenuItem_Usuario);

        Barra_Menu.add(Manu_Cadastro);

        Menu_Operacao.setText("Operação");
        Menu_Operacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        MenuItem_Agendar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuItem_Agendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/icons/agenda.png"))); // NOI18N
        MenuItem_Agendar.setText("Agendar");
        MenuItem_Agendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_AgendarActionPerformed(evt);
            }
        });
        Menu_Operacao.add(MenuItem_Agendar);

        Barra_Menu.add(Menu_Operacao);

        Menu_Relatorio.setText("Relatório");
        Menu_Relatorio.setBorderPainted(true);
        Menu_Relatorio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        MenuItem_Trabalho.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuItem_Trabalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/icons/relatório.png"))); // NOI18N
        MenuItem_Trabalho.setText("Trabalho");
        MenuItem_Trabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_TrabalhoActionPerformed(evt);
            }
        });
        Menu_Relatorio.add(MenuItem_Trabalho);

        Barra_Menu.add(Menu_Relatorio);

        setJMenuBar(Barra_Menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_EAgendaVoltar_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_EAgendaVoltar_MenuPrincipalActionPerformed
        this.listener.voltarAgenda();
        this.dispose();
    }//GEN-LAST:event_Botao_EAgendaVoltar_MenuPrincipalActionPerformed

    private void textServicoEAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_textServicoEAItemStateChanged
        //atualizaValor();
    }//GEN-LAST:event_textServicoEAItemStateChanged

    private void tabelaAgendamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAgendamentosMouseClicked
        textId.setText(tabelaAgendamentos.getValueAt(tabelaAgendamentos.getSelectedRow(), 0).toString());
        textClienteEA.setSelectedItem(tabelaAgendamentos.getValueAt(tabelaAgendamentos.getSelectedRow(), 1).toString());
        textServicoEA.setSelectedItem(tabelaAgendamentos.getValueAt(tabelaAgendamentos.getSelectedRow(), 2).toString());
        textValorEA.setText(tabelaAgendamentos.getValueAt(tabelaAgendamentos.getSelectedRow(), 3).toString());
        textDataEA.setText(tabelaAgendamentos.getValueAt(tabelaAgendamentos.getSelectedRow(), 4).toString());
        textHorarioEA.setText(tabelaAgendamentos.getValueAt(tabelaAgendamentos.getSelectedRow(), 5).toString());
        textObservacaoEA.setText(tabelaAgendamentos.getValueAt(tabelaAgendamentos.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_tabelaAgendamentosMouseClicked

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        try {
            Agendamento agendamento;
            agendamento = new Agendamento(
                Long.parseLong(textId.getText()),
                textClienteEA.getSelectedItem().toString(),
                textServicoEA.getSelectedItem().toString(),
                new BigDecimal(textValorEA.getText()),
                textDataEA.getText(),
                textHorarioEA.getText(),
                textObservacaoEA.getText());
            this.listener.editar(agendamento);
            JOptionPane.showMessageDialog(this, "Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(this, "Erro ao Editar: " + e);
        }
        limparTela();
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        try {
            Agendamento agenda;
            agenda = new Agendamento(
                Long.parseLong(textId.getText()));
            this.listener.excluir(agenda);
            JOptionPane.showMessageDialog(this, "Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(this, "Erro ao Excluir." + e);
        }
        limparTela();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            List<Agendamento> agendamentos = this.listener.listar();
            DefaultTableModel modelo = (DefaultTableModel)tabelaAgendamentos.getModel();
                modelo.setNumRows(0);
                agendamentos.forEach((agendamento) -> {
                    modelo.addRow(new Object[]{
                        agendamento.getId(),
                        agendamento.getCliente(),
                        agendamento.getServico(),
                        agendamento.getValor(),                        
                        agendamento.getData(),
                        agendamento.getHorario(),
                        agendamento.getObservacao()});
                    });
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(this, "Erro ao listar agendamentos: " + e);
        }
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            List<Cliente> clientes = this.listener.preencherCliente();
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) textClienteEA.getModel();
            clientes.forEach((cliente) -> {
                modelo.addElement(cliente);
                });
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(this, "Erro ao preencher clientes: " + e);
        }
        
        try {
            List<Servico> servicos = this.listener.preencherServico();
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) textServicoEA.getModel();
            servicos.forEach((servico) -> {
                modelo.addElement(servico);
                });
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(this, "Erro ao preencher serviços: " + e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void MenuItem_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ClienteActionPerformed
        this.listener.navegarParaCadastroClientes();
        this.dispose();
    }//GEN-LAST:event_MenuItem_ClienteActionPerformed

    private void MenuItem_ServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ServicoActionPerformed
        this.listener.navegarParaCadastroServico();
        this.dispose();
    }//GEN-LAST:event_MenuItem_ServicoActionPerformed

    private void MenuItem_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ProdutoActionPerformed
        this.listener.navegarParaCadastroProdutos();
        this.dispose();
    }//GEN-LAST:event_MenuItem_ProdutoActionPerformed

    private void MenuItem_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_UsuarioActionPerformed
        this.listener.navegarParaCadastroUsuarios();
        this.dispose();
    }//GEN-LAST:event_MenuItem_UsuarioActionPerformed

    private void MenuItem_AgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_AgendarActionPerformed
        this.listener.navegarParaAgenda();
        this.dispose();
    }//GEN-LAST:event_MenuItem_AgendarActionPerformed

    private void MenuItem_TrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_TrabalhoActionPerformed
        this.listener.navegarParaRelatorio();
        this.dispose();
    }//GEN-LAST:event_MenuItem_TrabalhoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barra_Menu;
    private javax.swing.JButton Botao_EAgendaVoltar_MenuPrincipal;
    private javax.swing.JLabel EAgenda_Fundo;
    private javax.swing.JLabel EAgenda_PainelFundo;
    private javax.swing.JLabel LabelClienteEAgenda;
    private javax.swing.JLabel LabelCodigoEAgenda;
    private javax.swing.JLabel LabelDataEAgenda;
    private javax.swing.JLabel LabelEAgenda;
    private javax.swing.JLabel LabelHoraEAgenda;
    private javax.swing.JLabel LabelObservacaoEAgenda;
    private javax.swing.JLabel LabelServicoEAgenda;
    private javax.swing.JLabel LabelValorEAgenda;
    private javax.swing.JMenu Manu_Cadastro;
    private javax.swing.JMenuItem MenuItem_Agendar;
    private javax.swing.JMenuItem MenuItem_Cliente;
    private javax.swing.JMenuItem MenuItem_Produto;
    private javax.swing.JMenuItem MenuItem_Servico;
    private javax.swing.JMenuItem MenuItem_Trabalho;
    private javax.swing.JMenuItem MenuItem_Usuario;
    private javax.swing.JMenu Menu_Operacao;
    private javax.swing.JMenu Menu_Relatorio;
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JScrollPane TextArea_Observacao;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JTable tabelaAgendamentos;
    private javax.swing.JComboBox<String> textClienteEA;
    private javax.swing.JFormattedTextField textDataEA;
    private javax.swing.JFormattedTextField textHorarioEA;
    private javax.swing.JTextField textId;
    private javax.swing.JTextArea textObservacaoEA;
    private javax.swing.JComboBox<String> textServicoEA;
    private javax.swing.JTextField textValorEA;
    // End of variables declaration//GEN-END:variables
}
