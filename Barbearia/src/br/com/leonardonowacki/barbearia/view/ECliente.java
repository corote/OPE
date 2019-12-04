package br.com.leonardonowacki.barbearia.view;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.interfaces.EClienteListener;
import br.com.leonardonowacki.barbearia.javabeans.Cliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ECliente extends javax.swing.JFrame {

    private final EClienteListener listener;
    
    public ECliente(EClienteListener listener) {
        initComponents();
        this.listener = listener;
        this.setVisible(true);
    }
    
    public void limparTela() {
        View.limpar(Text_IdEdicao, Text_NomeEdicao, Text_EmailEdicao, Text_CelularEdicao, Text_EnderecoEdicao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelEdicaoClientes = new javax.swing.JLabel();
        LabelNomeEdicao = new javax.swing.JLabel();
        LabelCelularEdicao = new javax.swing.JLabel();
        LabelEmailEdicao = new javax.swing.JLabel();
        LabelSexoEdicao = new javax.swing.JLabel();
        LabelEnderecoEdicao = new javax.swing.JLabel();
        Text_NomeEdicao = new javax.swing.JTextField();
        Text_EmailEdicao = new javax.swing.JTextField();
        Text_CelularEdicao = new javax.swing.JFormattedTextField();
        Text_EnderecoEdicao = new javax.swing.JTextField();
        Text_SexoEdicao = new javax.swing.JComboBox<>();
        Botao_Voltar = new javax.swing.JButton();
        Botao_EditarCliente = new javax.swing.JButton();
        Botao_ExcluirCliente = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        Tabela_EClientes = new javax.swing.JTable();
        Text_IdEdicao = new javax.swing.JTextField();
        LabelIdEdicao = new javax.swing.JLabel();
        EdicaoClientes_PainelFundo = new javax.swing.JLabel();
        EdicaoClientes_Fundo = new javax.swing.JLabel();
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

        LabelEdicaoClientes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LabelEdicaoClientes.setForeground(new java.awt.Color(255, 255, 255));
        LabelEdicaoClientes.setText("Edição");
        getContentPane().add(LabelEdicaoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        LabelNomeEdicao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelNomeEdicao.setForeground(new java.awt.Color(255, 255, 255));
        LabelNomeEdicao.setText("Nome");
        getContentPane().add(LabelNomeEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        LabelCelularEdicao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelCelularEdicao.setForeground(new java.awt.Color(255, 255, 255));
        LabelCelularEdicao.setText("Celular");
        getContentPane().add(LabelCelularEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        LabelEmailEdicao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelEmailEdicao.setForeground(new java.awt.Color(255, 255, 255));
        LabelEmailEdicao.setText("E-mail");
        getContentPane().add(LabelEmailEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, 20));

        LabelSexoEdicao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelSexoEdicao.setForeground(new java.awt.Color(255, 255, 255));
        LabelSexoEdicao.setText("Sexo");
        getContentPane().add(LabelSexoEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, -1, -1));

        LabelEnderecoEdicao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelEnderecoEdicao.setForeground(new java.awt.Color(255, 255, 255));
        LabelEnderecoEdicao.setText("Endereço");
        getContentPane().add(LabelEnderecoEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));
        getContentPane().add(Text_NomeEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 300, 40));
        getContentPane().add(Text_EmailEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 300, 40));

        try {
            Text_CelularEdicao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(Text_CelularEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 300, 40));
        getContentPane().add(Text_EnderecoEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 300, 40));

        Text_SexoEdicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        getContentPane().add(Text_SexoEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 300, 40));

        Botao_Voltar.setBackground(new java.awt.Color(51, 153, 255));
        Botao_Voltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Botao_Voltar.setForeground(new java.awt.Color(255, 255, 255));
        Botao_Voltar.setText("Voltar");
        Botao_Voltar.setToolTipText("");
        Botao_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, -1));

        Botao_EditarCliente.setBackground(new java.awt.Color(0, 0, 0));
        Botao_EditarCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao_EditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        Botao_EditarCliente.setText("Editar");
        Botao_EditarCliente.setToolTipText("");
        Botao_EditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_EditarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_EditarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 400, 50));

        Botao_ExcluirCliente.setBackground(new java.awt.Color(0, 0, 0));
        Botao_ExcluirCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao_ExcluirCliente.setForeground(new java.awt.Color(255, 255, 255));
        Botao_ExcluirCliente.setText("Excluir");
        Botao_ExcluirCliente.setToolTipText("");
        Botao_ExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_ExcluirClienteActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_ExcluirCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 400, 50));

        Tabela_EClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Sexo", "Celular", "Email", "Endereço"
            }
        ));
        Tabela_EClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_EClientesMouseClicked(evt);
            }
        });
        Tabela.setViewportView(Tabela_EClientes);

        getContentPane().add(Tabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 1020, 260));
        getContentPane().add(Text_IdEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 30, 40));

        LabelIdEdicao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelIdEdicao.setForeground(new java.awt.Color(255, 255, 255));
        LabelIdEdicao.setText("Codigo");
        getContentPane().add(LabelIdEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, -1, -1));

        EdicaoClientes_PainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(EdicaoClientes_PainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        EdicaoClientes_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/AgendaFundo.jpg"))); // NOI18N
        getContentPane().add(EdicaoClientes_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void Botao_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_VoltarActionPerformed
        this.listener.voltarCadastro();
        this.dispose();
    }//GEN-LAST:event_Botao_VoltarActionPerformed

    private void Botao_EditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_EditarClienteActionPerformed
        try {
            Cliente cliente = new Cliente(
                Integer.parseInt(Text_IdEdicao.getText()),
                Text_NomeEdicao.getText(),
                Text_SexoEdicao.getSelectedItem().toString(),
                Text_CelularEdicao.getText(),
                Text_EmailEdicao.getText(),
                Text_EnderecoEdicao.getText());
            listener.editar(cliente);
            JOptionPane.showMessageDialog(null, "Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Editar: " + e);
        }
        limparTela();
    }//GEN-LAST:event_Botao_EditarClienteActionPerformed

    private void Botao_ExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_ExcluirClienteActionPerformed
        try {
            Cliente cliente = new Cliente(
                Integer.parseInt(Text_IdEdicao.getText()));
            listener.excluir(cliente);
            JOptionPane.showMessageDialog(null, "Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: " + e);
        }
        limparTela();
    }//GEN-LAST:event_Botao_ExcluirClienteActionPerformed

    private void Tabela_EClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_EClientesMouseClicked
        Text_IdEdicao.setText(Tabela_EClientes.getValueAt(Tabela_EClientes.getSelectedRow(), 0).toString());
        Text_NomeEdicao.setText(Tabela_EClientes.getValueAt(Tabela_EClientes.getSelectedRow(), 1).toString());
        Text_SexoEdicao.setSelectedItem(Tabela_EClientes.getValueAt(Tabela_EClientes.getSelectedRow(), 2).toString());
        Text_CelularEdicao.setText(Tabela_EClientes.getValueAt(Tabela_EClientes.getSelectedRow(), 3).toString());
        Text_EmailEdicao.setText(Tabela_EClientes.getValueAt(Tabela_EClientes.getSelectedRow(), 4).toString());
        Text_EnderecoEdicao.setText(Tabela_EClientes.getValueAt(Tabela_EClientes.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_Tabela_EClientesMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            List<Cliente> servicos = this.listener.listarTabela();
            DefaultTableModel modelo = (DefaultTableModel) Tabela_EClientes.getModel();
                modelo.setNumRows(0);
                servicos.forEach((clientes) -> {
                    modelo.addRow(new Object[]{
                        clientes.getId(),
                        clientes.getNome(),
                        clientes.getSexo(),
                        clientes.getCelular(),
                        clientes.getEmail(),
                        clientes.getEndereco()});
                    });
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar clientes: " + e);
        }
    }//GEN-LAST:event_formWindowActivated

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
    private javax.swing.JButton Botao_EditarCliente;
    private javax.swing.JButton Botao_ExcluirCliente;
    private javax.swing.JButton Botao_Voltar;
    private javax.swing.JLabel EdicaoClientes_Fundo;
    private javax.swing.JLabel EdicaoClientes_PainelFundo;
    private javax.swing.JLabel LabelCelularEdicao;
    private javax.swing.JLabel LabelEdicaoClientes;
    private javax.swing.JLabel LabelEmailEdicao;
    private javax.swing.JLabel LabelEnderecoEdicao;
    private javax.swing.JLabel LabelIdEdicao;
    private javax.swing.JLabel LabelNomeEdicao;
    private javax.swing.JLabel LabelSexoEdicao;
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
    private javax.swing.JTable Tabela_EClientes;
    private javax.swing.JFormattedTextField Text_CelularEdicao;
    private javax.swing.JTextField Text_EmailEdicao;
    private javax.swing.JTextField Text_EnderecoEdicao;
    private javax.swing.JTextField Text_IdEdicao;
    private javax.swing.JTextField Text_NomeEdicao;
    private javax.swing.JComboBox<String> Text_SexoEdicao;
    // End of variables declaration//GEN-END:variables
}
