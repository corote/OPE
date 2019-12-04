
package br.com.leonardonowacki.barbearia.view;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.interfaces.EUsuarioListener;
import br.com.leonardonowacki.barbearia.javabeans.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EUsuario extends javax.swing.JFrame {
    
    private final EUsuarioListener listener;

    public EUsuario(EUsuarioListener listener) {
        initComponents();
        this.listener = listener;
        this.setVisible(true);
    }
    
    public void limparTela() {
        View.limpar(Text_IdUsuario, Text_NomeUsuario, Text_EmailUsuario, Text_CPFUsuario, Text_CelularUsuario, Text_RGUsuario, Text_LoginUsuario, Text_SenhaUsuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelCadastroUsuario = new javax.swing.JLabel();
        LabelNomeUsuario = new javax.swing.JLabel();
        LabelCelularUsuario = new javax.swing.JLabel();
        LabelEmailUsuario = new javax.swing.JLabel();
        LabelRGUsuario = new javax.swing.JLabel();
        LabelSexoUsuario = new javax.swing.JLabel();
        LabelCPFUsuario = new javax.swing.JLabel();
        LabelLoginUsuario = new javax.swing.JLabel();
        LabelSenhaUsuario = new javax.swing.JLabel();
        LabelIdUsuario = new javax.swing.JLabel();
        Text_CelularUsuario = new javax.swing.JFormattedTextField();
        Text_EmailUsuario = new javax.swing.JTextField();
        Text_RGUsuario = new javax.swing.JFormattedTextField();
        Text_IdUsuario = new javax.swing.JTextField();
        Text_CPFUsuario = new javax.swing.JFormattedTextField();
        Text_LoginUsuario = new javax.swing.JTextField();
        Text_SexoUsuario = new javax.swing.JComboBox<>();
        Text_NomeUsuario = new javax.swing.JTextField();
        Text_SenhaUsuario = new javax.swing.JPasswordField();
        Botao_Voltar = new javax.swing.JButton();
        Botao_EditarUsuario = new javax.swing.JButton();
        Botao_ExcluirUsuario = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        Tabela_Usuarios = new javax.swing.JTable();
        CadastroUsuario_PainelFundo = new javax.swing.JLabel();
        CadastroUsuarios_Fundo = new javax.swing.JLabel();
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

        LabelCadastroUsuario.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LabelCadastroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelCadastroUsuario.setText("Edição");
        getContentPane().add(LabelCadastroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        LabelNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelNomeUsuario.setText("Nome");
        getContentPane().add(LabelNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        LabelCelularUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelCelularUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelCelularUsuario.setText("Celular");
        getContentPane().add(LabelCelularUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        LabelEmailUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelEmailUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelEmailUsuario.setText("E-mail");
        getContentPane().add(LabelEmailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, -1, 20));

        LabelRGUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelRGUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelRGUsuario.setText("RG");
        getContentPane().add(LabelRGUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, -1, -1));

        LabelSexoUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelSexoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelSexoUsuario.setText("Sexo");
        getContentPane().add(LabelSexoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, -1, -1));

        LabelCPFUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelCPFUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelCPFUsuario.setText("CPF");
        getContentPane().add(LabelCPFUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        LabelLoginUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelLoginUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelLoginUsuario.setText("Login");
        getContentPane().add(LabelLoginUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        LabelSenhaUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelSenhaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelSenhaUsuario.setText("Senha");
        getContentPane().add(LabelSenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        LabelIdUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelIdUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelIdUsuario.setText("Codigo");
        getContentPane().add(LabelIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        try {
            Text_CelularUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(Text_CelularUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 300, 40));
        getContentPane().add(Text_EmailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 300, 40));

        try {
            Text_RGUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(Text_RGUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 300, 40));
        getContentPane().add(Text_IdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 40, 40));

        try {
            Text_CPFUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(Text_CPFUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 300, 40));
        getContentPane().add(Text_LoginUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 300, 40));

        Text_SexoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        getContentPane().add(Text_SexoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 300, 40));
        getContentPane().add(Text_NomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 300, 40));
        getContentPane().add(Text_SenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 300, 40));

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
        getContentPane().add(Botao_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 80, -1));

        Botao_EditarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        Botao_EditarUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao_EditarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        Botao_EditarUsuario.setText("Editar");
        Botao_EditarUsuario.setToolTipText("");
        Botao_EditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_EditarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_EditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 400, 50));

        Botao_ExcluirUsuario.setBackground(new java.awt.Color(0, 0, 0));
        Botao_ExcluirUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao_ExcluirUsuario.setForeground(new java.awt.Color(255, 255, 255));
        Botao_ExcluirUsuario.setText("Excluir");
        Botao_ExcluirUsuario.setToolTipText("");
        Botao_ExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_ExcluirUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_ExcluirUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 400, 50));

        Tabela_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Sexo", "Celular", "Email", "RG", "CPF", "Login", "Senha"
            }
        ));
        Tabela_Usuarios.getTableHeader().setReorderingAllowed(false);
        Tabela_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_UsuariosMouseClicked(evt);
            }
        });
        Tabela.setViewportView(Tabela_Usuarios);

        getContentPane().add(Tabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 1020, 230));

        CadastroUsuario_PainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(CadastroUsuario_PainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CadastroUsuarios_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/AgendaFundo.jpg"))); // NOI18N
        getContentPane().add(CadastroUsuarios_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

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

    private void Botao_EditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_EditarUsuarioActionPerformed
        try {
            Usuario usuario = new Usuario(
                Integer.parseInt(Text_IdUsuario.getText()),
                Text_NomeUsuario.getText(),
                Text_SexoUsuario.getSelectedItem().toString(),
                Text_CelularUsuario.getText(),
                Text_EmailUsuario.getText(),
                Text_CPFUsuario.getText(),
                Text_RGUsuario.getText(),
                Text_LoginUsuario.getText(),
                Text_SenhaUsuario.getText());
            listener.editar(usuario);
            JOptionPane.showMessageDialog(null, "Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Editar: " + e);
        }
        //limparTela();
    }//GEN-LAST:event_Botao_EditarUsuarioActionPerformed

    private void Botao_ExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_ExcluirUsuarioActionPerformed
        try {
            Usuario usuario = new Usuario(
                Integer.parseInt(Text_IdUsuario.getText()));
            listener.excluir(usuario);
            JOptionPane.showMessageDialog(null, "Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Editar: " + e);
        }
        //limparTela();
    }//GEN-LAST:event_Botao_ExcluirUsuarioActionPerformed

    private void Tabela_UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_UsuariosMouseClicked
        Text_IdUsuario.setText(Tabela_Usuarios.getValueAt(Tabela_Usuarios.getSelectedRow(), 0).toString());
        Text_NomeUsuario.setText(Tabela_Usuarios.getValueAt(Tabela_Usuarios.getSelectedRow(), 1).toString());
        Text_SexoUsuario.setSelectedItem(Tabela_Usuarios.getValueAt(Tabela_Usuarios.getSelectedRow(), 2).toString());
        Text_CelularUsuario.setText(Tabela_Usuarios.getValueAt(Tabela_Usuarios.getSelectedRow(), 3).toString());
        Text_EmailUsuario.setText(Tabela_Usuarios.getValueAt(Tabela_Usuarios.getSelectedRow(), 4).toString());
        Text_RGUsuario.setText(Tabela_Usuarios.getValueAt(Tabela_Usuarios.getSelectedRow(), 6).toString());
        Text_CPFUsuario.setText(Tabela_Usuarios.getValueAt(Tabela_Usuarios.getSelectedRow(), 5).toString());
        Text_LoginUsuario.setText(Tabela_Usuarios.getValueAt(Tabela_Usuarios.getSelectedRow(), 7).toString());
        Text_SenhaUsuario.setText(Tabela_Usuarios.getValueAt(Tabela_Usuarios.getSelectedRow(), 8).toString());
    }//GEN-LAST:event_Tabela_UsuariosMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            List<Usuario> servicos = this.listener.listarTabela();
            DefaultTableModel modelo = (DefaultTableModel) Tabela_Usuarios.getModel();
                modelo.setNumRows(0);
                servicos.forEach((usuarios) -> {
                    modelo.addRow(new Object[]{
                        usuarios.getId(),
                        usuarios.getNome(),
                        usuarios.getSexo(),
                        usuarios.getCelular(),
                        usuarios.getEmail(),
                        usuarios.getCpf(),
                        usuarios.getRg(),
                        usuarios.getLogin(),
                        usuarios.getSenha()});
                    });
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Usuarios: " + e);
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
    private javax.swing.JButton Botao_EditarUsuario;
    private javax.swing.JButton Botao_ExcluirUsuario;
    private javax.swing.JButton Botao_Voltar;
    private javax.swing.JLabel CadastroUsuario_PainelFundo;
    private javax.swing.JLabel CadastroUsuarios_Fundo;
    private javax.swing.JLabel LabelCPFUsuario;
    private javax.swing.JLabel LabelCadastroUsuario;
    private javax.swing.JLabel LabelCelularUsuario;
    private javax.swing.JLabel LabelEmailUsuario;
    private javax.swing.JLabel LabelIdUsuario;
    private javax.swing.JLabel LabelLoginUsuario;
    private javax.swing.JLabel LabelNomeUsuario;
    private javax.swing.JLabel LabelRGUsuario;
    private javax.swing.JLabel LabelSenhaUsuario;
    private javax.swing.JLabel LabelSexoUsuario;
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
    private javax.swing.JTable Tabela_Usuarios;
    private javax.swing.JFormattedTextField Text_CPFUsuario;
    private javax.swing.JFormattedTextField Text_CelularUsuario;
    private javax.swing.JTextField Text_EmailUsuario;
    private javax.swing.JTextField Text_IdUsuario;
    private javax.swing.JTextField Text_LoginUsuario;
    private javax.swing.JTextField Text_NomeUsuario;
    private javax.swing.JFormattedTextField Text_RGUsuario;
    private javax.swing.JPasswordField Text_SenhaUsuario;
    private javax.swing.JComboBox<String> Text_SexoUsuario;
    // End of variables declaration//GEN-END:variables
}
