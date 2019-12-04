package br.com.leonardonowacki.barbearia.view;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.interfaces.ServicoListener;
import br.com.leonardonowacki.barbearia.javabeans.Servico;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroServico extends javax.swing.JFrame {

    private final ServicoListener listener;
    
    public CadastroServico(ServicoListener listener) {
        initComponents();
        this.listener = listener;
        this.setVisible(true);
    }
    
    public void limparTela() {
        View.limpar(Text_IdServico, Text_DescricaoServico, Text_ValorServico);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelCadastroServico = new javax.swing.JLabel();
        LabelDescricaoServico = new javax.swing.JLabel();
        LabelValorServico = new javax.swing.JLabel();
        LabelIdServico = new javax.swing.JLabel();
        Text_IdServico = new javax.swing.JTextField();
        Text_DescricaoServico = new javax.swing.JTextField();
        Text_ValorServico = new javax.swing.JTextField();
        Botao_ExcluirServico = new javax.swing.JButton();
        Botao_EditarServico = new javax.swing.JButton();
        Botao_CadastrarServico = new javax.swing.JButton();
        Botao_ServicoVoltar_MenuPrincipal = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        Tabela_Servicos = new javax.swing.JTable();
        CadastroServico_PainelFundo = new javax.swing.JLabel();
        CadastroServico_Fundo = new javax.swing.JLabel();
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

        LabelCadastroServico.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LabelCadastroServico.setForeground(new java.awt.Color(255, 255, 255));
        LabelCadastroServico.setText("Serviço");
        getContentPane().add(LabelCadastroServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        LabelDescricaoServico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelDescricaoServico.setForeground(new java.awt.Color(255, 255, 255));
        LabelDescricaoServico.setText("Descrição");
        getContentPane().add(LabelDescricaoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        LabelValorServico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelValorServico.setForeground(new java.awt.Color(255, 255, 255));
        LabelValorServico.setText("Valor");
        getContentPane().add(LabelValorServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, 20));

        LabelIdServico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelIdServico.setForeground(new java.awt.Color(255, 255, 255));
        LabelIdServico.setText("Codigo");
        getContentPane().add(LabelIdServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));
        getContentPane().add(Text_IdServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 30, 40));
        getContentPane().add(Text_DescricaoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 300, 40));
        getContentPane().add(Text_ValorServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 300, 40));

        Botao_ExcluirServico.setBackground(new java.awt.Color(0, 0, 0));
        Botao_ExcluirServico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao_ExcluirServico.setForeground(new java.awt.Color(255, 255, 255));
        Botao_ExcluirServico.setText("Excluir");
        Botao_ExcluirServico.setToolTipText("");
        Botao_ExcluirServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_ExcluirServicoActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_ExcluirServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 740, 400, 50));

        Botao_EditarServico.setBackground(new java.awt.Color(0, 0, 0));
        Botao_EditarServico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao_EditarServico.setForeground(new java.awt.Color(255, 255, 255));
        Botao_EditarServico.setText("Editar");
        Botao_EditarServico.setToolTipText("");
        Botao_EditarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_EditarServicoActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_EditarServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 660, 400, 50));

        Botao_CadastrarServico.setBackground(new java.awt.Color(0, 0, 0));
        Botao_CadastrarServico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao_CadastrarServico.setForeground(new java.awt.Color(255, 255, 255));
        Botao_CadastrarServico.setText("Cadastrar");
        Botao_CadastrarServico.setToolTipText("");
        Botao_CadastrarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_CadastrarServicoActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_CadastrarServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 400, 50));

        Botao_ServicoVoltar_MenuPrincipal.setBackground(new java.awt.Color(51, 153, 255));
        Botao_ServicoVoltar_MenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Botao_ServicoVoltar_MenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        Botao_ServicoVoltar_MenuPrincipal.setText("Voltar");
        Botao_ServicoVoltar_MenuPrincipal.setToolTipText("");
        Botao_ServicoVoltar_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_ServicoVoltar_MenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_ServicoVoltar_MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, -1));

        Tabela_Servicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição", "Valor"
            }
        ));
        Tabela_Servicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_ServicosMouseClicked(evt);
            }
        });
        Tabela.setViewportView(Tabela_Servicos);

        getContentPane().add(Tabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 530, 530));

        CadastroServico_PainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(CadastroServico_PainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        CadastroServico_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/AgendaFundo.jpg"))); // NOI18N
        getContentPane().add(CadastroServico_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, -1));

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

    private void Botao_ExcluirServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_ExcluirServicoActionPerformed
        try {
            Servico servico = new Servico(
                Integer.parseInt(Text_IdServico.getText()));
            listener.excluir(servico);
            JOptionPane.showMessageDialog(null, "Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Editar: " + e);
        }
        limparTela();
    }//GEN-LAST:event_Botao_ExcluirServicoActionPerformed

    private void Botao_EditarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_EditarServicoActionPerformed
        try {
            Servico servico = new Servico(
                Integer.parseInt(Text_IdServico.getText()),
                Text_DescricaoServico.getText(),
                new BigDecimal(Text_ValorServico.getText()));

            listener.editar(servico);
            JOptionPane.showMessageDialog(null,"Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Editar: " + e);
        }
        limparTela();
    }//GEN-LAST:event_Botao_EditarServicoActionPerformed

    private void Botao_CadastrarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_CadastrarServicoActionPerformed
        if (
            "".equals(Text_DescricaoServico.getText()) ||
            "".equals(Text_ValorServico.getText())
        ) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para cadastrar.");
            return;
        }
        try {
            Servico servico = new Servico(
                Text_DescricaoServico.getText(),
                new BigDecimal(Text_ValorServico.getText()));
            listener.cadastrar(servico);
            JOptionPane.showMessageDialog(null,"Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar: " + e);
        }
        limparTela();
    }//GEN-LAST:event_Botao_CadastrarServicoActionPerformed

    private void Botao_ServicoVoltar_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_ServicoVoltar_MenuPrincipalActionPerformed
        this.listener.voltarMenu();
        this.dispose();
    }//GEN-LAST:event_Botao_ServicoVoltar_MenuPrincipalActionPerformed

    private void Tabela_ServicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_ServicosMouseClicked
        Text_IdServico.setText(Tabela_Servicos.getValueAt(Tabela_Servicos.getSelectedRow(), 0).toString());
        Text_DescricaoServico.setText(Tabela_Servicos.getValueAt(Tabela_Servicos.getSelectedRow(), 1).toString());
        Text_ValorServico.setText(Tabela_Servicos.getValueAt(Tabela_Servicos.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_Tabela_ServicosMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            List<Servico> servicos = this.listener.listarTabela();
            DefaultTableModel modelo = (DefaultTableModel) Tabela_Servicos.getModel();
                modelo.setNumRows(0);
                servicos.forEach((clientes) -> {
                    modelo.addRow(new Object[]{
                        clientes.getId(),
                        clientes.getDescricao(),
                        clientes.getValor()});
                    });
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Servicos: " + e);
        }
    }//GEN-LAST:event_formWindowActivated

    private void MenuItem_TrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_TrabalhoActionPerformed
        this.listener.navegarParaRelatorio();
        this.dispose();
    }//GEN-LAST:event_MenuItem_TrabalhoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barra_Menu;
    private javax.swing.JButton Botao_CadastrarServico;
    private javax.swing.JButton Botao_EditarServico;
    private javax.swing.JButton Botao_ExcluirServico;
    private javax.swing.JButton Botao_ServicoVoltar_MenuPrincipal;
    private javax.swing.JLabel CadastroServico_Fundo;
    private javax.swing.JLabel CadastroServico_PainelFundo;
    private javax.swing.JLabel LabelCadastroServico;
    private javax.swing.JLabel LabelDescricaoServico;
    private javax.swing.JLabel LabelIdServico;
    private javax.swing.JLabel LabelValorServico;
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
    private javax.swing.JTable Tabela_Servicos;
    private javax.swing.JTextField Text_DescricaoServico;
    private javax.swing.JTextField Text_IdServico;
    private javax.swing.JTextField Text_ValorServico;
    // End of variables declaration//GEN-END:variables
}
