
package br.com.leonardonowacki.barbearia.view;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.interfaces.LoginListener;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    private final LoginListener listener;

    public Login(LoginListener listener) {
        initComponents();
        this.listener = listener;
    }
    
    public void mostrarSenhaFalhou() {
        JOptionPane.showMessageDialog(this, "Usuario ou Senha incorretos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botao_Entrar = new javax.swing.JButton();
        Text_Senha = new javax.swing.JPasswordField();
        Text_Usuario = new javax.swing.JTextField();
        Label_Senha = new javax.swing.JLabel();
        Label_Usuario = new javax.swing.JLabel();
        Label_Login = new javax.swing.JLabel();
        Painel_Fundo = new javax.swing.JLabel();
        Login_Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Botao_Entrar.setBackground(new java.awt.Color(0, 0, 0));
        Botao_Entrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Botao_Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Botao_Entrar.setText("Entrar");
        Botao_Entrar.setToolTipText("");
        Botao_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, 380, 50));
        getContentPane().add(Text_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 380, 40));
        getContentPane().add(Text_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 380, 40));

        Label_Senha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Label_Senha.setForeground(new java.awt.Color(255, 255, 255));
        Label_Senha.setText("Senha");
        getContentPane().add(Label_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, -1));

        Label_Usuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Label_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Label_Usuario.setText("Usuário");
        getContentPane().add(Label_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        Label_Login.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Label_Login.setForeground(new java.awt.Color(255, 255, 255));
        Label_Login.setText("Login");
        getContentPane().add(Label_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        Painel_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/painel-login.png"))); // NOI18N
        getContentPane().add(Painel_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 570, 500));

        Login_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/Logo.jpg"))); // NOI18N
        getContentPane().add(Login_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 813, 1200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_EntrarActionPerformed
        try {
            this.listener.fazerLogin(this, Text_Usuario.getText(), Text_Senha.getText());
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(this, "Erro" + e);
        }
    }//GEN-LAST:event_Botao_EntrarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Entrar;
    private javax.swing.JLabel Label_Login;
    private javax.swing.JLabel Label_Senha;
    private javax.swing.JLabel Label_Usuario;
    private javax.swing.JLabel Login_Fundo;
    private javax.swing.JLabel Painel_Fundo;
    private javax.swing.JPasswordField Text_Senha;
    private javax.swing.JTextField Text_Usuario;
    // End of variables declaration//GEN-END:variables
}
