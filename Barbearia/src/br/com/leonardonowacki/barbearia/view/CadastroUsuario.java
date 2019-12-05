package br.com.leonardonowacki.barbearia.view;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.interfaces.UsuarioListener;
import br.com.leonardonowacki.barbearia.javabeans.Usuario;
import javax.swing.JOptionPane;

public class CadastroUsuario extends javax.swing.JFrame {

    private final UsuarioListener listener;
    
    public CadastroUsuario(UsuarioListener listener) {
        initComponents();
        this.listener = listener;
        this.setVisible(true);
    }
    
    public void limparTela() {
        View.limpar(Text_NomeUsuario, Text_EmailUsuario, Text_CPFUsuario, Text_CelularUsuario, Text_RGUsuario, Text_LoginUsuario, Text_SenhaUsuario);
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
        Text_CelularUsuario = new javax.swing.JFormattedTextField();
        Text_EmailUsuario = new javax.swing.JTextField();
        Text_RGUsuario = new javax.swing.JFormattedTextField();
        Text_NomeUsuario = new javax.swing.JTextField();
        Text_SexoUsuario = new javax.swing.JComboBox<>();
        Text_CPFUsuario = new javax.swing.JFormattedTextField();
        Text_SenhaUsuario = new javax.swing.JPasswordField();
        Text_LoginUsuario = new javax.swing.JTextField();
        Botao_CadastrarUsuario = new javax.swing.JButton();
        Botao_VizualizarUsuario = new javax.swing.JButton();
        Botao_UsuarioVoltar_MenuPrincipal = new javax.swing.JButton();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCadastroUsuario.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LabelCadastroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelCadastroUsuario.setText("Usuarios");
        getContentPane().add(LabelCadastroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        LabelNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelNomeUsuario.setText("Nome");
        getContentPane().add(LabelNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        LabelCelularUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelCelularUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelCelularUsuario.setText("Celular");
        getContentPane().add(LabelCelularUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        LabelEmailUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelEmailUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelEmailUsuario.setText("E-mail");
        getContentPane().add(LabelEmailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, 20));

        LabelRGUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelRGUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelRGUsuario.setText("RG");
        getContentPane().add(LabelRGUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, -1, -1));

        LabelSexoUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelSexoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelSexoUsuario.setText("Sexo");
        getContentPane().add(LabelSexoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, -1, -1));

        LabelCPFUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelCPFUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelCPFUsuario.setText("CPF");
        getContentPane().add(LabelCPFUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        LabelLoginUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelLoginUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelLoginUsuario.setText("Login");
        getContentPane().add(LabelLoginUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));

        LabelSenhaUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelSenhaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelSenhaUsuario.setText("Senha");
        getContentPane().add(LabelSenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, -1, -1));

        try {
            Text_CelularUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(Text_CelularUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 300, 40));

        Text_EmailUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_EmailUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Text_EmailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 300, 40));

        try {
            Text_RGUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(Text_RGUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 300, 40));

        Text_NomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NomeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Text_NomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 300, 40));

        Text_SexoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        getContentPane().add(Text_SexoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 300, 40));

        try {
            Text_CPFUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(Text_CPFUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 300, 40));
        getContentPane().add(Text_SenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, 300, 40));
        getContentPane().add(Text_LoginUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 300, 40));

        Botao_CadastrarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        Botao_CadastrarUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao_CadastrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        Botao_CadastrarUsuario.setText("Cadastrar");
        Botao_CadastrarUsuario.setToolTipText("");
        Botao_CadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_CadastrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_CadastrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 400, 50));

        Botao_VizualizarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        Botao_VizualizarUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao_VizualizarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        Botao_VizualizarUsuario.setText("Vizualizar");
        Botao_VizualizarUsuario.setToolTipText("");
        Botao_VizualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_VizualizarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_VizualizarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 400, 50));

        Botao_UsuarioVoltar_MenuPrincipal.setBackground(new java.awt.Color(51, 153, 255));
        Botao_UsuarioVoltar_MenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Botao_UsuarioVoltar_MenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        Botao_UsuarioVoltar_MenuPrincipal.setText("Voltar");
        Botao_UsuarioVoltar_MenuPrincipal.setToolTipText("");
        Botao_UsuarioVoltar_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_UsuarioVoltar_MenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_UsuarioVoltar_MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, -1));

        CadastroUsuario_PainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(CadastroUsuario_PainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        CadastroUsuarios_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/AgendaFundo.jpg"))); // NOI18N
        getContentPane().add(CadastroUsuarios_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void Text_EmailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_EmailUsuarioActionPerformed

    }//GEN-LAST:event_Text_EmailUsuarioActionPerformed

    private void Text_NomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NomeUsuarioActionPerformed

    }//GEN-LAST:event_Text_NomeUsuarioActionPerformed

    private void Botao_CadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_CadastrarUsuarioActionPerformed
        if(
            "".equals(Text_NomeUsuario.getText()) ||
            "".equals(Text_CelularUsuario.getText()) ||
            "".equals(Text_EmailUsuario.getText()) ||
            "".equals(Text_CPFUsuario.getText()) ||
            "".equals(Text_RGUsuario.getText()) ||
            "".equals(Text_LoginUsuario.getText()) ||
            "".equals(Text_SenhaUsuario.getText())
        ) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos para cadastrar.");
            return;
        } try {
            Usuario usuario = new Usuario(
                Text_NomeUsuario.getText(),
                Text_SexoUsuario.getSelectedItem().toString(),
                Text_CelularUsuario.getText(),
                Text_EmailUsuario.getText(),
                Text_CPFUsuario.getText(),
                Text_RGUsuario.getText(),
                Text_LoginUsuario.getText(),
                Text_SenhaUsuario.getText());

            listener.cadastrar(usuario);
            JOptionPane.showMessageDialog(this,"Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(this,"Erro ao Cadastrar: " + e);
        }
        limparTela();
    }//GEN-LAST:event_Botao_CadastrarUsuarioActionPerformed

    private void Botao_VizualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_VizualizarUsuarioActionPerformed
        this.listener.vizualizar();
        this.dispose();
    }//GEN-LAST:event_Botao_VizualizarUsuarioActionPerformed

    private void Botao_UsuarioVoltar_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_UsuarioVoltar_MenuPrincipalActionPerformed
        this.listener.voltarMenu();
        this.dispose();
    }//GEN-LAST:event_Botao_UsuarioVoltar_MenuPrincipalActionPerformed

    private void MenuItem_TrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_TrabalhoActionPerformed
        this.listener.navegarParaRelatorio();
        this.dispose();
    }//GEN-LAST:event_MenuItem_TrabalhoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barra_Menu;
    private javax.swing.JButton Botao_CadastrarUsuario;
    private javax.swing.JButton Botao_UsuarioVoltar_MenuPrincipal;
    private javax.swing.JButton Botao_VizualizarUsuario;
    private javax.swing.JLabel CadastroUsuario_PainelFundo;
    private javax.swing.JLabel CadastroUsuarios_Fundo;
    private javax.swing.JLabel LabelCPFUsuario;
    private javax.swing.JLabel LabelCadastroUsuario;
    private javax.swing.JLabel LabelCelularUsuario;
    private javax.swing.JLabel LabelEmailUsuario;
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
    private javax.swing.JFormattedTextField Text_CPFUsuario;
    private javax.swing.JFormattedTextField Text_CelularUsuario;
    private javax.swing.JTextField Text_EmailUsuario;
    private javax.swing.JTextField Text_LoginUsuario;
    private javax.swing.JTextField Text_NomeUsuario;
    private javax.swing.JFormattedTextField Text_RGUsuario;
    private javax.swing.JPasswordField Text_SenhaUsuario;
    private javax.swing.JComboBox<String> Text_SexoUsuario;
    // End of variables declaration//GEN-END:variables
}
