package br.com.leonardonowacki.barbearia.view;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.javabeans.Agendamento;
import br.com.leonardonowacki.barbearia.interfaces.AgendaListener;
import br.com.leonardonowacki.barbearia.javabeans.Cliente;
import br.com.leonardonowacki.barbearia.javabeans.Servico;

import java.math.BigDecimal;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class Agenda extends javax.swing.JFrame {
    
    private final AgendaListener listener;

    public Agenda(AgendaListener listener) {
        initComponents();
        this.listener = listener;
        this.setVisible(true);
    }
    
    public void limparTela() {
        View.limpar(textValor, textObservacao, textHorario);
        textData.setDateFormatString("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelCadastroCliente = new javax.swing.JLabel();
        LabelCliente = new javax.swing.JLabel();
        LabelServico = new javax.swing.JLabel();
        LabelValor = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
        LabelObservacao = new javax.swing.JLabel();
        LabelData = new javax.swing.JLabel();
        textData = new com.toedter.calendar.JDateChooser();
        textHorario = new javax.swing.JFormattedTextField();
        textValor = new javax.swing.JTextField();
        textServico = new javax.swing.JComboBox<>();
        textCliente = new javax.swing.JComboBox<>();
        TextArea_Observacao = new javax.swing.JScrollPane();
        textObservacao = new javax.swing.JTextArea();
        botaoAgendaVoltarMenu = new javax.swing.JButton();
        botaoVizualizar = new javax.swing.JButton();
        botaoAgendar = new javax.swing.JButton();
        Agenda_PainelFundo = new javax.swing.JLabel();
        Agenda_Fundo = new javax.swing.JLabel();
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
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCadastroCliente.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LabelCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelCadastroCliente.setText("Agenda");
        getContentPane().add(LabelCadastroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        LabelCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelCliente.setText("Cliente");
        getContentPane().add(LabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        LabelServico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelServico.setForeground(new java.awt.Color(255, 255, 255));
        LabelServico.setText("Serviço");
        getContentPane().add(LabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        LabelValor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelValor.setForeground(new java.awt.Color(255, 255, 255));
        LabelValor.setText("Valor R$");
        getContentPane().add(LabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        LabelHora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelHora.setForeground(new java.awt.Color(255, 255, 255));
        LabelHora.setText("Hora");
        getContentPane().add(LabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, -1, -1));

        LabelObservacao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelObservacao.setForeground(new java.awt.Color(255, 255, 255));
        LabelObservacao.setText("Observação");
        getContentPane().add(LabelObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 110, -1));

        LabelData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelData.setForeground(new java.awt.Color(255, 255, 255));
        LabelData.setText("Data");
        getContentPane().add(LabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, -1, -1));
        getContentPane().add(textData, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 300, 40));

        try {
            textHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(textHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, 40, 40));

        textValor.setToolTipText("");
        getContentPane().add(textValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 300, 40));

        getContentPane().add(textServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 300, 40));
        getContentPane().add(textCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 300, 40));

        textObservacao.setColumns(20);
        textObservacao.setRows(5);
        TextArea_Observacao.setViewportView(textObservacao);

        getContentPane().add(TextArea_Observacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 300, 140));

        botaoAgendaVoltarMenu.setBackground(new java.awt.Color(0, 0, 0));
        botaoAgendaVoltarMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoAgendaVoltarMenu.setForeground(new java.awt.Color(255, 255, 255));
        botaoAgendaVoltarMenu.setText("Voltar");
        botaoAgendaVoltarMenu.setToolTipText("");
        botaoAgendaVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAgendaVoltarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAgendaVoltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, -1));

        botaoVizualizar.setBackground(new java.awt.Color(0, 0, 0));
        botaoVizualizar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botaoVizualizar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVizualizar.setText("Visualizar");
        botaoVizualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVizualizarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVizualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 630, 500, 50));

        botaoAgendar.setBackground(new java.awt.Color(0, 0, 0));
        botaoAgendar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botaoAgendar.setForeground(new java.awt.Color(255, 255, 255));
        botaoAgendar.setText("Agendar");
        botaoAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, 500, 50));

        Agenda_PainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(Agenda_PainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        Agenda_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/AgendaFundo.jpg"))); // NOI18N
        getContentPane().add(Agenda_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 1000));

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

    private void botaoAgendaVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAgendaVoltarMenuActionPerformed
        this.listener.voltarMenu();
        this.dispose();
    }//GEN-LAST:event_botaoAgendaVoltarMenuActionPerformed

    private void botaoVizualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVizualizarActionPerformed
        this.listener.vizualizar();
        this.dispose();
    }//GEN-LAST:event_botaoVizualizarActionPerformed

    private void botaoAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAgendarActionPerformed
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String data = formato.format(textData.getDate());
            Agendamento agendamento = new Agendamento(
                textCliente.getSelectedItem().toString(),
                textServico.getSelectedItem().toString(),
                new BigDecimal(textValor.getText()),
                data,
                textHorario.getText(),
                textObservacao.getText());
            listener.agendar(agendamento);
            JOptionPane.showMessageDialog(this, "Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(this, "Erro." + e);
        }
        this.listener.navegarParaAgenda();
        this.dispose();
        limparTela();
    }//GEN-LAST:event_botaoAgendarActionPerformed

    private void MenuItem_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ClienteActionPerformed
        this.listener.navegarParaCadastroCliente();
        this.dispose();
    }//GEN-LAST:event_MenuItem_ClienteActionPerformed

    private void MenuItem_ServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ServicoActionPerformed
        this.listener.navegarParaCadastroServico();
        this.dispose();
    }//GEN-LAST:event_MenuItem_ServicoActionPerformed

    private void MenuItem_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ProdutoActionPerformed
        this.listener.navegarParaCadastroProduto();
        this.dispose();
    }//GEN-LAST:event_MenuItem_ProdutoActionPerformed

    private void MenuItem_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_UsuarioActionPerformed
        this.listener.navegarParaCadastroUsuario();
        this.dispose();
    }//GEN-LAST:event_MenuItem_UsuarioActionPerformed

    private void MenuItem_AgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_AgendarActionPerformed
        this.listener.navegarParaAgenda();
        this.dispose();
    }//GEN-LAST:event_MenuItem_AgendarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            List<Cliente> clientes = this.listener.preencherCliente();
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) textCliente.getModel();
            clientes.forEach((cliente) -> {
                modelo.addElement(cliente);
                });
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(this, "Erro ao preencher clientes: " + e);
        }
        
        try {
            List<Servico> servicos = this.listener.preencherServico();
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) textServico.getModel();
            servicos.forEach((servico) -> {
                modelo.addElement(servico);
                });
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(this, "Erro ao preencher serviços: " + e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void MenuItem_TrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_TrabalhoActionPerformed
        this.listener.navegarParaRelatorio();
        this.dispose();
    }//GEN-LAST:event_MenuItem_TrabalhoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agenda_Fundo;
    private javax.swing.JLabel Agenda_PainelFundo;
    private javax.swing.JMenuBar Barra_Menu;
    private javax.swing.JLabel LabelCadastroCliente;
    private javax.swing.JLabel LabelCliente;
    private javax.swing.JLabel LabelData;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelObservacao;
    private javax.swing.JLabel LabelServico;
    private javax.swing.JLabel LabelValor;
    private javax.swing.JMenu Manu_Cadastro;
    private javax.swing.JMenuItem MenuItem_Agendar;
    private javax.swing.JMenuItem MenuItem_Cliente;
    private javax.swing.JMenuItem MenuItem_Produto;
    private javax.swing.JMenuItem MenuItem_Servico;
    private javax.swing.JMenuItem MenuItem_Trabalho;
    private javax.swing.JMenuItem MenuItem_Usuario;
    private javax.swing.JMenu Menu_Operacao;
    private javax.swing.JMenu Menu_Relatorio;
    private javax.swing.JScrollPane TextArea_Observacao;
    private javax.swing.JButton botaoAgendaVoltarMenu;
    private javax.swing.JButton botaoAgendar;
    private javax.swing.JButton botaoVizualizar;
    private javax.swing.JComboBox<String> textCliente;
    private com.toedter.calendar.JDateChooser textData;
    private javax.swing.JFormattedTextField textHorario;
    private javax.swing.JTextArea textObservacao;
    private javax.swing.JComboBox<String> textServico;
    private javax.swing.JTextField textValor;
    // End of variables declaration//GEN-END:variables
}
