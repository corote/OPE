package br.com.leonardonowacki.barbearia.view;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.interfaces.RelatorioListener;
import br.com.leonardonowacki.barbearia.javabeans.Relatorio;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Trabalho extends javax.swing.JFrame {
    
    private final RelatorioListener listener;

    public Trabalho(RelatorioListener listener) {
        initComponents();
        this.listener = listener;
        this.setVisible(true);
    }
    
    public void limparTela() {
        View.limpar(textId, textRelatorio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaRelatorio = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        textRelatorio = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        botaoRelatorioVoltarMenu = new javax.swing.JButton();
        labelRelatorio = new javax.swing.JLabel();
        relatorioPainel = new javax.swing.JLabel();
        relatorioFundo = new javax.swing.JLabel();
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
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));
        getContentPane().add(textId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 50, 40));

        tabelaRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Dados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaRelatorioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaRelatorio);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 550, 550));

        textRelatorio.setColumns(20);
        textRelatorio.setRows(5);
        jScrollPane1.setViewportView(textRelatorio);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 440, 240));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 660, 130, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, 130, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 660, 130, 30));

        botaoRelatorioVoltarMenu.setBackground(new java.awt.Color(0, 0, 0));
        botaoRelatorioVoltarMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoRelatorioVoltarMenu.setForeground(new java.awt.Color(255, 255, 255));
        botaoRelatorioVoltarMenu.setText("Voltar");
        botaoRelatorioVoltarMenu.setToolTipText("");
        botaoRelatorioVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatorioVoltarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(botaoRelatorioVoltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, -1));

        labelRelatorio.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        labelRelatorio.setText("Relatório");
        getContentPane().add(labelRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        relatorioPainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(relatorioPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        relatorioFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/AgendaFundo.jpg"))); // NOI18N
        getContentPane().add(relatorioFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 1000));

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

    private void botaoRelatorioVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatorioVoltarMenuActionPerformed
        this.listener.voltarMenu();
        this.dispose();
    }//GEN-LAST:event_botaoRelatorioVoltarMenuActionPerformed

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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            List<Relatorio> servicos = this.listener.listarTabela();
            DefaultTableModel modelo = (DefaultTableModel) tabelaRelatorio.getModel();
                modelo.setNumRows(0);
                servicos.forEach((produtos) -> {
                    modelo.addRow(new Object[]{
                        produtos.getId(),
                        produtos.getRelatorio()});
                    });
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Produtos: " + e);
        }
        limparTela();
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Relatorio produto = new Relatorio(
                textRelatorio.getText());
            listener.salvar(produto);
            JOptionPane.showMessageDialog(null,"Sucesso.");
        }
        catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar: " + e);
        }
        limparTela();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Relatorio dados = new Relatorio(
                Integer.parseInt(textId.getText()),
                textRelatorio.getText());
            listener.editar(dados);
            JOptionPane.showMessageDialog(null, "Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Editar: " + e);
        }
        limparTela();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Relatorio dados = new Relatorio(
                Integer.parseInt(textId.getText()));
            listener.excluir(dados);
            JOptionPane.showMessageDialog(null,"Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir: " + e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void MenuItem_TrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_TrabalhoActionPerformed
        this.listener.navegarParaRelatorio();
        this.dispose();
    }//GEN-LAST:event_MenuItem_TrabalhoActionPerformed

    private void tabelaRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRelatorioMouseClicked
        textId.setText(tabelaRelatorio.getValueAt(tabelaRelatorio.getSelectedRow(), 0).toString());
        textRelatorio.setText(tabelaRelatorio.getValueAt(tabelaRelatorio.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_tabelaRelatorioMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barra_Menu;
    private javax.swing.JMenu Manu_Cadastro;
    private javax.swing.JMenuItem MenuItem_Agendar;
    private javax.swing.JMenuItem MenuItem_Cliente;
    private javax.swing.JMenuItem MenuItem_Produto;
    private javax.swing.JMenuItem MenuItem_Servico;
    private javax.swing.JMenuItem MenuItem_Trabalho;
    private javax.swing.JMenuItem MenuItem_Usuario;
    private javax.swing.JMenu Menu_Operacao;
    private javax.swing.JMenu Menu_Relatorio;
    private javax.swing.JButton botaoRelatorioVoltarMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelRelatorio;
    private javax.swing.JLabel relatorioFundo;
    private javax.swing.JLabel relatorioPainel;
    private javax.swing.JTable tabelaRelatorio;
    private javax.swing.JTextField textId;
    private javax.swing.JTextArea textRelatorio;
    // End of variables declaration//GEN-END:variables
}
