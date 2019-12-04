package br.com.leonardonowacki.barbearia.view;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.interfaces.ClienteListener;
import br.com.leonardonowacki.barbearia.javabeans.Cliente;
import javax.swing.JOptionPane;

public class CadastroCliente extends javax.swing.JFrame {
    
    private final ClienteListener listener;

    public CadastroCliente(ClienteListener listener) {
        initComponents();
        this.listener = listener;
        this.setVisible(true);
    }
    
    public void limparTela() {
        View.limpar(Text_NomeCliente, Text_EmailCliente, Text_CelularCliente, Text_EnderecoCliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelCadastroCliente = new javax.swing.JLabel();
        LabelNomeCliente = new javax.swing.JLabel();
        LabelCelularCliente = new javax.swing.JLabel();
        LabelEmailCliente = new javax.swing.JLabel();
        LabelSexoCliente = new javax.swing.JLabel();
        LabelEnderecoCliente = new javax.swing.JLabel();
        Text_NomeCliente = new javax.swing.JTextField();
        Text_CelularCliente = new javax.swing.JFormattedTextField();
        Text_EmailCliente = new javax.swing.JTextField();
        Text_Sexo_Cleinte = new javax.swing.JComboBox<>();
        Text_EnderecoCliente = new javax.swing.JTextField();
        Botao_ClienteVoltar_MenuPrincipal2 = new javax.swing.JButton();
        Botao_CadastrarCliente = new javax.swing.JButton();
        Botao_VizualizarCliente = new javax.swing.JButton();
        CadastroClientes_PainelFundo = new javax.swing.JLabel();
        CadastroClientes_Fundo = new javax.swing.JLabel();
        Barra_Menu3 = new javax.swing.JMenuBar();
        Manu_Cadastro3 = new javax.swing.JMenu();
        MenuItem_Cliente3 = new javax.swing.JMenuItem();
        MenuItem_Servico = new javax.swing.JMenuItem();
        MenuItem_Produto = new javax.swing.JMenuItem();
        MenuItem_Usuario = new javax.swing.JMenuItem();
        Menu_Operacao = new javax.swing.JMenu();
        MenuItem_Agendar = new javax.swing.JMenuItem();
        Menu_Relatorio = new javax.swing.JMenu();
        MenuItem_Trabalho = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCadastroCliente.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LabelCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelCadastroCliente.setText("Clientes");
        getContentPane().add(LabelCadastroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        LabelNomeCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelNomeCliente.setText("Nome");
        getContentPane().add(LabelNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        LabelCelularCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelCelularCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelCelularCliente.setText("Celular");
        getContentPane().add(LabelCelularCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        LabelEmailCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelEmailCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelEmailCliente.setText("E-mail");
        getContentPane().add(LabelEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, 20));

        LabelSexoCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelSexoCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelSexoCliente.setText("Sexo");
        getContentPane().add(LabelSexoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, -1, -1));

        LabelEnderecoCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelEnderecoCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelEnderecoCliente.setText("Endereço");
        getContentPane().add(LabelEnderecoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));
        getContentPane().add(Text_NomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 300, 40));

        try {
            Text_CelularCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(Text_CelularCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 300, 40));
        getContentPane().add(Text_EmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 300, 40));

        Text_Sexo_Cleinte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        getContentPane().add(Text_Sexo_Cleinte, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 300, 40));
        getContentPane().add(Text_EnderecoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 300, 40));

        Botao_ClienteVoltar_MenuPrincipal2.setBackground(new java.awt.Color(51, 153, 255));
        Botao_ClienteVoltar_MenuPrincipal2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Botao_ClienteVoltar_MenuPrincipal2.setForeground(new java.awt.Color(255, 255, 255));
        Botao_ClienteVoltar_MenuPrincipal2.setText("Voltar");
        Botao_ClienteVoltar_MenuPrincipal2.setToolTipText("");
        Botao_ClienteVoltar_MenuPrincipal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_ClienteVoltar_MenuPrincipal2ActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_ClienteVoltar_MenuPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, -1));

        Botao_CadastrarCliente.setBackground(new java.awt.Color(0, 0, 0));
        Botao_CadastrarCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao_CadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        Botao_CadastrarCliente.setText("Cadastrar");
        Botao_CadastrarCliente.setToolTipText("");
        Botao_CadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_CadastrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_CadastrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 400, 50));

        Botao_VizualizarCliente.setBackground(new java.awt.Color(0, 0, 0));
        Botao_VizualizarCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao_VizualizarCliente.setForeground(new java.awt.Color(255, 255, 255));
        Botao_VizualizarCliente.setText("Vizualizar");
        Botao_VizualizarCliente.setToolTipText("");
        Botao_VizualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_VizualizarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_VizualizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 400, 50));

        CadastroClientes_PainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(CadastroClientes_PainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        CadastroClientes_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/AgendaFundo.jpg"))); // NOI18N
        getContentPane().add(CadastroClientes_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Manu_Cadastro3.setText("Cadastro");
        Manu_Cadastro3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        MenuItem_Cliente3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuItem_Cliente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/icons/cliente.png"))); // NOI18N
        MenuItem_Cliente3.setText("Cliente");
        MenuItem_Cliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_Cliente3ActionPerformed(evt);
            }
        });
        Manu_Cadastro3.add(MenuItem_Cliente3);

        MenuItem_Servico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuItem_Servico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/icons/serviços.png"))); // NOI18N
        MenuItem_Servico.setText("Serviço");
        MenuItem_Servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ServicoActionPerformed(evt);
            }
        });
        Manu_Cadastro3.add(MenuItem_Servico);

        MenuItem_Produto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuItem_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/icons/produtos.png"))); // NOI18N
        MenuItem_Produto.setText("Produtos");
        MenuItem_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ProdutoActionPerformed(evt);
            }
        });
        Manu_Cadastro3.add(MenuItem_Produto);

        MenuItem_Usuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuItem_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/icons/usuarios.png"))); // NOI18N
        MenuItem_Usuario.setText("Usuário");
        MenuItem_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_UsuarioActionPerformed(evt);
            }
        });
        Manu_Cadastro3.add(MenuItem_Usuario);

        Barra_Menu3.add(Manu_Cadastro3);

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

        Barra_Menu3.add(Menu_Operacao);

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

        Barra_Menu3.add(Menu_Relatorio);

        setJMenuBar(Barra_Menu3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_ClienteVoltar_MenuPrincipal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_ClienteVoltar_MenuPrincipal2ActionPerformed
        this.listener.voltarMenu();
        this.dispose();
    }//GEN-LAST:event_Botao_ClienteVoltar_MenuPrincipal2ActionPerformed

    private void Botao_CadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_CadastrarClienteActionPerformed
        if (
            "".equals(Text_NomeCliente.getText()) ||
            "".equals(Text_CelularCliente.getText())
        ) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para cadastrar.");
            return;
        }
        try {
            Cliente cliente = new Cliente(
                Text_NomeCliente.getText(),
                Text_Sexo_Cleinte.getSelectedItem().toString(),
                Text_CelularCliente.getText(),
                Text_EmailCliente.getText(),
                Text_EnderecoCliente.getText());
            listener.cadastrar(cliente);
            JOptionPane.showMessageDialog(null,"Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar: " + e);
        }
        limparTela();
    }//GEN-LAST:event_Botao_CadastrarClienteActionPerformed

    private void Botao_VizualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_VizualizarClienteActionPerformed
        this.listener.vizualizar();
        this.dispose();
    }//GEN-LAST:event_Botao_VizualizarClienteActionPerformed

    private void MenuItem_Cliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_Cliente3ActionPerformed
        this.listener.navegarParaCadastroCliente();
        this.dispose();
    }//GEN-LAST:event_MenuItem_Cliente3ActionPerformed

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

    private void MenuItem_TrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_TrabalhoActionPerformed
        this.listener.navegarParaRelatorio();
        this.dispose();
    }//GEN-LAST:event_MenuItem_TrabalhoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barra_Menu3;
    private javax.swing.JButton Botao_CadastrarCliente;
    private javax.swing.JButton Botao_ClienteVoltar_MenuPrincipal2;
    private javax.swing.JButton Botao_VizualizarCliente;
    private javax.swing.JLabel CadastroClientes_Fundo;
    private javax.swing.JLabel CadastroClientes_PainelFundo;
    private javax.swing.JLabel LabelCadastroCliente;
    private javax.swing.JLabel LabelCelularCliente;
    private javax.swing.JLabel LabelEmailCliente;
    private javax.swing.JLabel LabelEnderecoCliente;
    private javax.swing.JLabel LabelNomeCliente;
    private javax.swing.JLabel LabelSexoCliente;
    private javax.swing.JMenu Manu_Cadastro3;
    private javax.swing.JMenuItem MenuItem_Agendar;
    private javax.swing.JMenuItem MenuItem_Cliente3;
    private javax.swing.JMenuItem MenuItem_Produto;
    private javax.swing.JMenuItem MenuItem_Servico;
    private javax.swing.JMenuItem MenuItem_Trabalho;
    private javax.swing.JMenuItem MenuItem_Usuario;
    private javax.swing.JMenu Menu_Operacao;
    private javax.swing.JMenu Menu_Relatorio;
    private javax.swing.JFormattedTextField Text_CelularCliente;
    private javax.swing.JTextField Text_EmailCliente;
    private javax.swing.JTextField Text_EnderecoCliente;
    private javax.swing.JTextField Text_NomeCliente;
    private javax.swing.JComboBox<String> Text_Sexo_Cleinte;
    // End of variables declaration//GEN-END:variables
}
