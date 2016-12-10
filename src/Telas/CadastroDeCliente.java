package Telas;

import ClassesDeControle.ControleCadDeClien;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastroDeCliente extends javax.swing.JFrame {

    public CadastroDeCliente() {
        initComponents();
        setIcon();
        setLocationRelativeTo(null);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l_titulo = new javax.swing.JLabel();
        l_icone = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        b_proximo = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        l_versao = new javax.swing.JLabel();
        l_nomeCliente = new javax.swing.JLabel();
        l_endereco = new javax.swing.JLabel();
        campo_cliente = new javax.swing.JTextField();
        campo_endereco = new javax.swing.JTextField();
        l_servico = new javax.swing.JLabel();
        campo_telefone = new javax.swing.JTextField();
        l_telefone = new javax.swing.JLabel();
        campo_email1 = new javax.swing.JTextField();
        l_ob1 = new javax.swing.JLabel();
        l_ob2 = new javax.swing.JLabel();
        l_ob3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 525));

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        l_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l_titulo.setForeground(new java.awt.Color(0, 153, 102));
        l_titulo.setText("VetHelper - Cadastro de Cliente");

        l_icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/mini_vh_semfundo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(l_icone))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(l_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l_icone)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        b_proximo.setBackground(new java.awt.Color(0, 153, 102));
        b_proximo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_proximo.setForeground(new java.awt.Color(255, 255, 255));
        b_proximo.setText("Próximo");
        b_proximo.setFocusable(false);
        b_proximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_proximoMouseClicked(evt);
            }
        });

        b_cancelar.setBackground(new java.awt.Color(0, 153, 102));
        b_cancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        b_cancelar.setText("Cancelar");
        b_cancelar.setFocusable(false);
        b_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_cancelarMouseClicked(evt);
            }
        });

        l_versao.setText("VetHelper Versão 3.0.1");

        l_nomeCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_nomeCliente.setText("Nome do Cliente");

        l_endereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_endereco.setText("Endereço");

        campo_cliente.setBackground(new java.awt.Color(240, 240, 240));
        campo_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        campo_endereco.setBackground(new java.awt.Color(240, 240, 240));
        campo_endereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        l_servico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_servico.setText("E-mail");

        campo_telefone.setBackground(new java.awt.Color(240, 240, 240));
        campo_telefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        l_telefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_telefone.setText("Telefone");

        campo_email1.setBackground(new java.awt.Color(240, 240, 240));
        campo_email1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        l_ob1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_ob1.setForeground(new java.awt.Color(255, 51, 0));
        l_ob1.setText("*");

        l_ob2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_ob2.setForeground(new java.awt.Color(255, 51, 0));
        l_ob2.setText("*");

        l_ob3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_ob3.setForeground(new java.awt.Color(255, 51, 0));
        l_ob3.setText("*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(l_versao))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(l_nomeCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_ob1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(b_proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                                .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campo_email1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(l_endereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l_ob2))
                                    .addComponent(campo_endereco, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                    .addComponent(l_servico)
                                    .addComponent(campo_telefone))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(l_telefone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(l_ob3))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_nomeCliente)
                    .addComponent(l_ob1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_endereco)
                    .addComponent(l_ob2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(l_servico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_telefone)
                    .addComponent(l_ob3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(l_versao))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cancelarMouseClicked
        ControleCadDeClien controle = new ControleCadDeClien();
        controle.chamaControleDeClientes(this);
    }//GEN-LAST:event_b_cancelarMouseClicked

    private void b_proximoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_proximoMouseClicked
        ControleCadDeClien controle = new ControleCadDeClien();
        controle.chamaCadastroDeAnimal(campo_cliente.getText(),campo_endereco.getText(),campo_email1.getText(),campo_telefone.getText(),this);
    }//GEN-LAST:event_b_proximoMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeCliente().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Telas/Imagens/icone.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_proximo;
    private javax.swing.JTextField campo_cliente;
    private javax.swing.JTextField campo_email1;
    private javax.swing.JTextField campo_endereco;
    private javax.swing.JTextField campo_telefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l_endereco;
    private javax.swing.JLabel l_icone;
    private javax.swing.JLabel l_nomeCliente;
    private javax.swing.JLabel l_ob1;
    private javax.swing.JLabel l_ob2;
    private javax.swing.JLabel l_ob3;
    private javax.swing.JLabel l_servico;
    private javax.swing.JLabel l_telefone;
    private javax.swing.JLabel l_titulo;
    private javax.swing.JLabel l_versao;
    // End of variables declaration//GEN-END:variables

    public void EXIT_ON_CLOSE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
