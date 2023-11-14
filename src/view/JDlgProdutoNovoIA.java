/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GasFornecedor;
import bean.GasProduto;
import bean.GasTipo;
import dao.FornecedorDAO;
import dao.ProdutoDAO;
import dao.TipoDAO;
import java.util.List;
import tools.Util;

/**
 *
 * @author u05682855140
 */
public class JDlgProdutoNovoIA extends javax.swing.JDialog {

    /**
     * Creates new form JDlgProdutoNovoIA
     */
    JDlgProdutoNovo jDlgProdutoNovo;
    ProdutoDAO produtoDAO;
    GasProduto gasProduto;
    public boolean incluindo;

    public JDlgProdutoNovoIA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("produtoIA");
        setLocationRelativeTo(null);

        produtoDAO = new ProdutoDAO();
        gasProduto = new GasProduto();

//        jDlgProdutoNovo = new JDlgProdutoNovo(null, true);
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        List lista = fornecedorDAO.listALL();
        for (int i = 0; i < lista.size(); i++) {
            jCboFkFornecedor.addItem((GasFornecedor) lista.get(i));
        }

        TipoDAO tipoDAO = new TipoDAO();
        List lista1 = tipoDAO.listALL();
        for (int j = 0; j < lista1.size(); j++) {
            jCboFkTipo.addItem((GasTipo) lista1.get(j));
        }

    }

    public GasProduto viewBean() {
        gasProduto.setGasIdproduto(Util.strInt(jTxtCodigo.getText()));
        gasProduto.setGasNome(jTxtNome.getText());
        gasProduto.setGasValor(Util.strInt(jFmtValor.getText()));
        gasProduto.setGasTipo((GasTipo) jCboFkTipo.getSelectedItem());
        gasProduto.setGasFornecedor((GasFornecedor) jCboFkFornecedor.getSelectedItem());

        return gasProduto;
    }

    public void beanView(GasProduto gasProduto) {
        jTxtCodigo.setText(Util.intStr(gasProduto.getGasIdproduto()));
        jTxtNome.setText(gasProduto.getGasNome());
        jCboFkFornecedor.setSelectedItem((GasFornecedor) gasProduto.getGasFornecedor());
        jCboFkTipo.setSelectedItem((GasTipo) gasProduto.getGasTipo());
        jFmtValor.setText(Util.intStr(gasProduto.getGasValor()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jBtnOk = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCboFkFornecedor = new javax.swing.JComboBox<GasFornecedor>();
        jFmtValor = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCboFkTipo = new javax.swing.JComboBox<GasTipo>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jBtnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok_1.png"))); // NOI18N
        jBtnOk.setText("OK");
        jBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jBtnOk);

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar_1.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jBtnCancelar);

        jLabel6.setText("Fk_fornecedor");

        jLabel1.setText("Valor");

        jCboFkFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboFkFornecedorActionPerformed(evt);
            }
        });

        jFmtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtValorActionPerformed(evt);
            }
        });

        jLabel5.setText("Codigo");

        jTxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo");

        jCboFkTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboFkTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jFmtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jCboFkTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jCboFkFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCboFkFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCboFkTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkActionPerformed
        // TODO add your handling code here:
        JDlgProdutoNovo jDlgProdutoNovo = new JDlgProdutoNovo(null, true);
        gasProduto = viewBean();
        if (incluindo == true) {
            produtoDAO.insert(gasProduto);
        } else {
            produtoDAO.update(gasProduto);
            
        }
        setVisible(false);
    }//GEN-LAST:event_jBtnOkActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jFmtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtValorActionPerformed

    private void jTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigoActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jCboFkFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboFkFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboFkFornecedorActionPerformed

    private void jCboFkTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboFkTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboFkTipoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDlgProdutoNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgProdutoNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgProdutoNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgProdutoNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgProdutoNovoIA dialog = new JDlgProdutoNovoIA(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnOk;
    private javax.swing.JComboBox<GasFornecedor> jCboFkFornecedor;
    private javax.swing.JComboBox<GasTipo> jCboFkTipo;
    private javax.swing.JFormattedTextField jFmtValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtNome;
    // End of variables declaration//GEN-END:variables
}
