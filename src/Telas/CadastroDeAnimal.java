package Telas;

import ClassesDeControle.ControleCadDeAni;

import java.awt.Toolkit;

public class CadastroDeAnimal extends javax.swing.JFrame {

    public CadastroDeAnimal() {
        initComponents();
        setIcon();
        setLocationRelativeTo(null);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        l_titulo = new javax.swing.JLabel();
        l_icone = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        b_cadastrar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        l_versao = new javax.swing.JLabel();
        l_nomeCliente = new javax.swing.JLabel();
        l_raca = new javax.swing.JLabel();
        campo_animal = new javax.swing.JTextField();
        campo_raca = new javax.swing.JTextField();
        l_cor = new javax.swing.JLabel();
        l_tipo = new javax.swing.JLabel();
        campo_cor = new javax.swing.JTextField();
        radiob_cao = new javax.swing.JRadioButton();
        radiob_gato = new javax.swing.JRadioButton();
        l_dono = new javax.swing.JLabel();
        campo_dono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Animal");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 525));

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        l_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l_titulo.setForeground(new java.awt.Color(0, 153, 102));
        l_titulo.setText("VetHelper - Cadastro de Animal");

        l_icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/mini_vh_semfundo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
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

        b_cadastrar.setBackground(new java.awt.Color(0, 153, 102));
        b_cadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        b_cadastrar.setText("Cadastrar");
        b_cadastrar.setFocusable(false);
        b_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_cadastrarMouseClicked(evt);
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
        l_nomeCliente.setText("Nome do Animal");

        l_raca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_raca.setText("Raça");

        campo_animal.setBackground(new java.awt.Color(240, 240, 240));
        campo_animal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        campo_raca.setBackground(new java.awt.Color(240, 240, 240));
        campo_raca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        l_cor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_cor.setText("Cor");

        l_tipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_tipo.setText("Tipo");

        campo_cor.setBackground(new java.awt.Color(240, 240, 240));
        campo_cor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        buttonGroup1.add(radiob_cao);
        radiob_cao.setText("Cão");

        buttonGroup1.add(radiob_gato);
        radiob_gato.setText("Gato");

        l_dono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_dono.setText("Dono");

        campo_dono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campo_dono.setEnabled(false);

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
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(b_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(radiob_cao)
                                .addGap(18, 18, 18)
                                .addComponent(radiob_gato))
                            .addComponent(campo_cor)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_animal, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                    .addComponent(l_raca)
                                    .addComponent(campo_raca, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                    .addComponent(l_cor))
                                .addComponent(l_tipo))
                            .addComponent(l_dono)
                            .addComponent(campo_dono))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(l_nomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(l_raca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(l_cor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(l_tipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiob_cao)
                    .addComponent(radiob_gato))
                .addGap(13, 13, 13)
                .addComponent(l_dono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_dono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
    public void preencheDono(String dono) {
        campo_dono.setText(dono);
    }
    private void b_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cancelarMouseClicked
        ControleCadDeAni controle = new ControleCadDeAni();
        controle.chamaControleDeClientes(this);
    }//GEN-LAST:event_b_cancelarMouseClicked

    private void b_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cadastrarMouseClicked
        ControleCadDeAni controle = new ControleCadDeAni();
        String tipo;
        if(radiob_cao.isSelected())
            tipo = "Cão";
        else
            tipo = "Gato";
        controle.cadastrarAnimal(campo_animal.getText(),campo_raca.getText(),campo_cor.getText(),tipo,campo_dono.getText(),this);
        campo_animal.setText(""); campo_raca.setText(""); campo_cor.setText("");
        campo_animal.requestFocus();
    }//GEN-LAST:event_b_cadastrarMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new CadastroDeAnimal().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Telas/Imagens/icone.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cadastrar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campo_animal;
    private javax.swing.JTextField campo_cor;
    private javax.swing.JTextField campo_dono;
    private javax.swing.JTextField campo_raca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l_cor;
    private javax.swing.JLabel l_dono;
    private javax.swing.JLabel l_icone;
    private javax.swing.JLabel l_nomeCliente;
    private javax.swing.JLabel l_raca;
    private javax.swing.JLabel l_tipo;
    private javax.swing.JLabel l_titulo;
    private javax.swing.JLabel l_versao;
    private javax.swing.JRadioButton radiob_cao;
    private javax.swing.JRadioButton radiob_gato;
    // End of variables declaration//GEN-END:variables

    public void EXIT_ON_CLOSE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
