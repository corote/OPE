package br.com.leonardonowacki.barbearia.view;

import br.com.leonardonowacki.barbearia.dao.ConnectionException;
import br.com.leonardonowacki.barbearia.interfaces.ProdutoListener;
import br.com.leonardonowacki.barbearia.javabeans.Produto;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroProduto extends javax.swing.JFrame {

    private final ProdutoListener listener;
    
    public CadastroProduto(ProdutoListener listener) {
        initComponents();
        this.listener = listener;;
        this.setVisible(true);
    }
    
    public void limparTela() {
        View.limpar(Text_IdProdutos, Text_NomeProdutos, Text_QuantidadeProdutos, Text_ValorProdutos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelCadastroProdutos = new javax.swing.JLabel();
        LabelNomeProdutos = new javax.swing.JLabel();
        LabelQuantidadeProdutos = new javax.swing.JLabel();
        LabelValorProdutos = new javax.swing.JLabel();
        LabelIdProdutos = new javax.swing.JLabel();
        Text_IdProdutos = new javax.swing.JTextField();
        Text_NomeProdutos = new javax.swing.JTextField();
        Text_QuantidadeProdutos = new javax.swing.JTextField();
        Text_ValorProdutos = new javax.swing.JTextField();
        Botao_ExcluirProdutos = new javax.swing.JButton();
        Botao_CadastrarProdutos = new javax.swing.JButton();
        Botao_EditarProdutos = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        Tabela_Produtos = new javax.swing.JTable();
        Botao_ProdutosVoltar_MenuPrincipal = new javax.swing.JButton();
        CadastroClientes_PainelFundo = new javax.swing.JLabel();
        CadastroProdutos_Fundo = new javax.swing.JLabel();
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

        LabelCadastroProdutos.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LabelCadastroProdutos.setForeground(new java.awt.Color(255, 255, 255));
        LabelCadastroProdutos.setText("Produtos");
        getContentPane().add(LabelCadastroProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        LabelNomeProdutos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelNomeProdutos.setForeground(new java.awt.Color(255, 255, 255));
        LabelNomeProdutos.setText("Nome");
        getContentPane().add(LabelNomeProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        LabelQuantidadeProdutos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelQuantidadeProdutos.setForeground(new java.awt.Color(255, 255, 255));
        LabelQuantidadeProdutos.setText("Quantidade");
        getContentPane().add(LabelQuantidadeProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        LabelValorProdutos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelValorProdutos.setForeground(new java.awt.Color(255, 255, 255));
        LabelValorProdutos.setText("Valor");
        getContentPane().add(LabelValorProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, -1));

        LabelIdProdutos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelIdProdutos.setForeground(new java.awt.Color(255, 255, 255));
        LabelIdProdutos.setText("Codigo");
        getContentPane().add(LabelIdProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));
        getContentPane().add(Text_IdProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 30, 40));
        getContentPane().add(Text_NomeProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 300, 40));
        getContentPane().add(Text_QuantidadeProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 300, 40));
        getContentPane().add(Text_ValorProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 300, 40));

        Botao_ExcluirProdutos.setBackground(new java.awt.Color(0, 0, 0));
        Botao_ExcluirProdutos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao_ExcluirProdutos.setForeground(new java.awt.Color(255, 255, 255));
        Botao_ExcluirProdutos.setText("Excluir");
        Botao_ExcluirProdutos.setToolTipText("");
        Botao_ExcluirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_ExcluirProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_ExcluirProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 740, 400, 50));

        Botao_CadastrarProdutos.setBackground(new java.awt.Color(0, 0, 0));
        Botao_CadastrarProdutos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao_CadastrarProdutos.setForeground(new java.awt.Color(255, 255, 255));
        Botao_CadastrarProdutos.setText("Cadastrar");
        Botao_CadastrarProdutos.setToolTipText("");
        Botao_CadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_CadastrarProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_CadastrarProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 400, 50));

        Botao_EditarProdutos.setBackground(new java.awt.Color(0, 0, 0));
        Botao_EditarProdutos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao_EditarProdutos.setForeground(new java.awt.Color(255, 255, 255));
        Botao_EditarProdutos.setText("Editar");
        Botao_EditarProdutos.setToolTipText("");
        Botao_EditarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_EditarProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_EditarProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 660, 400, 50));

        Tabela_Produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Quantidade", "Valor"
            }
        ));
        Tabela_Produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_ProdutosMouseClicked(evt);
            }
        });
        Tabela.setViewportView(Tabela_Produtos);

        getContentPane().add(Tabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 530, 530));

        Botao_ProdutosVoltar_MenuPrincipal.setBackground(new java.awt.Color(51, 153, 255));
        Botao_ProdutosVoltar_MenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Botao_ProdutosVoltar_MenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        Botao_ProdutosVoltar_MenuPrincipal.setText("Voltar");
        Botao_ProdutosVoltar_MenuPrincipal.setToolTipText("");
        Botao_ProdutosVoltar_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_ProdutosVoltar_MenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_ProdutosVoltar_MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, -1));

        CadastroClientes_PainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(CadastroClientes_PainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        CadastroProdutos_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/leonardonowacki/barbearia/view/imagens/AgendaFundo.jpg"))); // NOI18N
        getContentPane().add(CadastroProdutos_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void Botao_ExcluirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_ExcluirProdutosActionPerformed
        try {
            Produto produto = new Produto(
                Integer.parseInt(Text_IdProdutos.getText()));
            listener.excluir(produto);
            JOptionPane.showMessageDialog(null,"Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir: " + e);
        }
        limparTela();
    }//GEN-LAST:event_Botao_ExcluirProdutosActionPerformed

    private void Botao_CadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_CadastrarProdutosActionPerformed
        if(
            "".equals(Text_NomeProdutos.getText()) ||
            "".equals(Text_QuantidadeProdutos.getText()) ||
            "".equals(Text_ValorProdutos.getText())
        ) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para cadastrar.");
            return;
        }
        try {
            Produto produto = new Produto(
                Text_NomeProdutos.getText(),
                Integer.parseInt(Text_QuantidadeProdutos.getText()),
                new BigDecimal(Text_ValorProdutos.getText()));
            listener.cadastrar(produto);
            JOptionPane.showMessageDialog(null,"Sucesso.");
        }
        catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar: " + e);
        }
        limparTela();
    }//GEN-LAST:event_Botao_CadastrarProdutosActionPerformed

    private void Botao_EditarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_EditarProdutosActionPerformed
        try {
            Produto produto = new Produto(
                Integer.parseInt(Text_IdProdutos.getText()),
                Text_NomeProdutos.getText(),
                Integer.parseInt(Text_QuantidadeProdutos.getText()),
                new BigDecimal(Text_ValorProdutos.getText()));
            listener.editar(produto);
            JOptionPane.showMessageDialog(null, "Sucesso.");
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Editar: " + e);
        }
        limparTela();
    }//GEN-LAST:event_Botao_EditarProdutosActionPerformed

    private void Tabela_ProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_ProdutosMouseClicked
        Text_IdProdutos.setText(Tabela_Produtos.getValueAt(Tabela_Produtos.getSelectedRow(), 0).toString());
        Text_NomeProdutos.setText(Tabela_Produtos.getValueAt(Tabela_Produtos.getSelectedRow(), 1).toString());
        Text_QuantidadeProdutos.setText(Tabela_Produtos.getValueAt(Tabela_Produtos.getSelectedRow(), 2).toString());
        Text_ValorProdutos.setText(Tabela_Produtos.getValueAt(Tabela_Produtos.getSelectedRow(), 3).toString());

    }//GEN-LAST:event_Tabela_ProdutosMouseClicked

    private void Botao_ProdutosVoltar_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_ProdutosVoltar_MenuPrincipalActionPerformed
        this.listener.voltarMenu();
        this.dispose();
    }//GEN-LAST:event_Botao_ProdutosVoltar_MenuPrincipalActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            List<Produto> servicos = this.listener.listarTabela();
            DefaultTableModel modelo = (DefaultTableModel) Tabela_Produtos.getModel();
                modelo.setNumRows(0);
                servicos.forEach((produtos) -> {
                    modelo.addRow(new Object[]{
                        produtos.getId(),
                        produtos.getNome(),
                        produtos.getQuantidade(),
                        produtos.getValor()});
                    });
        } catch (ConnectionException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Produtos: " + e);
        }
    }//GEN-LAST:event_formWindowActivated

    private void MenuItem_TrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_TrabalhoActionPerformed
        this.listener.navegarParaRelatorio();
        this.dispose();
    }//GEN-LAST:event_MenuItem_TrabalhoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barra_Menu;
    private javax.swing.JButton Botao_CadastrarProdutos;
    private javax.swing.JButton Botao_EditarProdutos;
    private javax.swing.JButton Botao_ExcluirProdutos;
    private javax.swing.JButton Botao_ProdutosVoltar_MenuPrincipal;
    private javax.swing.JLabel CadastroClientes_PainelFundo;
    private javax.swing.JLabel CadastroProdutos_Fundo;
    private javax.swing.JLabel LabelCadastroProdutos;
    private javax.swing.JLabel LabelIdProdutos;
    private javax.swing.JLabel LabelNomeProdutos;
    private javax.swing.JLabel LabelQuantidadeProdutos;
    private javax.swing.JLabel LabelValorProdutos;
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
    private javax.swing.JTable Tabela_Produtos;
    private javax.swing.JTextField Text_IdProdutos;
    private javax.swing.JTextField Text_NomeProdutos;
    private javax.swing.JTextField Text_QuantidadeProdutos;
    private javax.swing.JTextField Text_ValorProdutos;
    // End of variables declaration//GEN-END:variables
}
