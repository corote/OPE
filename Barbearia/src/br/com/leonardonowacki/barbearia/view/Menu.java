package br.com.leonardonowacki.barbearia.view;

import br.com.leonardonowacki.barbearia.interfaces.MenuListener;

public class Menu extends javax.swing.JFrame {

    private final MenuListener listener;
    
    public Menu(MenuListener listener) {
        initComponents();
        this.listener = listener;
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fundo_Menu = new javax.swing.JLabel();
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

        Fundo_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/fundo-MenuPrincipal.jpg"))); // NOI18N
        getContentPane().add(Fundo_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

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
    private javax.swing.JLabel Fundo_Menu;
    private javax.swing.JMenu Manu_Cadastro;
    private javax.swing.JMenuItem MenuItem_Agendar;
    private javax.swing.JMenuItem MenuItem_Cliente;
    private javax.swing.JMenuItem MenuItem_Produto;
    private javax.swing.JMenuItem MenuItem_Servico;
    private javax.swing.JMenuItem MenuItem_Trabalho;
    private javax.swing.JMenuItem MenuItem_Usuario;
    private javax.swing.JMenu Menu_Operacao;
    private javax.swing.JMenu Menu_Relatorio;
    // End of variables declaration//GEN-END:variables
}
