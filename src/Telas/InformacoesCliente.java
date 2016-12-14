package Telas;

import ClassesDeControle.ControleInfoDeCliente;
import ClassesDoDominio.Animal;
import ClassesDoDominio.ArquivoXML;
import ClassesDoDominio.Cliente;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class InformacoesCliente extends javax.swing.JFrame {
    ControleInfoDeCliente controle = new ControleInfoDeCliente();
    ArquivoXML<Animal> arquivoXMLAnimal = new ArquivoXML<>("animais.XML");
    ArquivoXML<Cliente> arquivoXMLCliente = new ArquivoXML<>("clientes.XML");
    DefaultListModel model = new DefaultListModel();
    
    public InformacoesCliente() {
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
        b_add_ani = new javax.swing.JButton();
        b_voltar = new javax.swing.JButton();
        l_versao = new javax.swing.JLabel();
        l_nomeCliente = new javax.swing.JLabel();
        l_endereco = new javax.swing.JLabel();
        campo_cliente = new javax.swing.JTextField();
        campo_endereco = new javax.swing.JTextField();
        l_servico = new javax.swing.JLabel();
        campo_telefone = new javax.swing.JTextField();
        l_telefone = new javax.swing.JLabel();
        campo_email = new javax.swing.JTextField();
        l_animal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_ani = new javax.swing.JList();
        b_excluir1 = new javax.swing.JButton();
        b_remove_ani = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informações do Cliente");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 525));

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        l_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l_titulo.setForeground(new java.awt.Color(0, 153, 102));
        l_titulo.setText("VetHelper - Informações do Cliente");

        l_icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/mini_vh_semfundo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
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

        b_add_ani.setBackground(new java.awt.Color(0, 153, 102));
        b_add_ani.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_add_ani.setForeground(new java.awt.Color(255, 255, 255));
        b_add_ani.setText("Adicionar");
        b_add_ani.setFocusable(false);
        b_add_ani.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_add_aniMouseClicked(evt);
            }
        });

        b_voltar.setBackground(new java.awt.Color(0, 153, 102));
        b_voltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_voltar.setForeground(new java.awt.Color(255, 255, 255));
        b_voltar.setText("Voltar");
        b_voltar.setFocusable(false);
        b_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_voltarMouseClicked(evt);
            }
        });

        l_versao.setText("VetHelper Versão 3.0.1");

        l_nomeCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_nomeCliente.setText("Nome do Cliente");

        l_endereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_endereco.setText("Endereço");

        campo_cliente.setEditable(false);
        campo_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campo_cliente.setFocusable(false);

        campo_endereco.setEditable(false);
        campo_endereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campo_endereco.setFocusable(false);

        l_servico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_servico.setText("E-mail");

        campo_telefone.setEditable(false);
        campo_telefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campo_telefone.setFocusable(false);

        l_telefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_telefone.setText("Telefone");

        campo_email.setEditable(false);
        campo_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campo_email.setFocusable(false);

        l_animal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_animal.setText("Animais");

        jScrollPane1.setViewportView(lista_ani);

        b_excluir1.setBackground(new java.awt.Color(0, 153, 102));
        b_excluir1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_excluir1.setForeground(new java.awt.Color(255, 255, 255));
        b_excluir1.setText("Excluir Cadastro");
        b_excluir1.setFocusable(false);
        b_excluir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_excluir1MouseClicked(evt);
            }
        });

        b_remove_ani.setBackground(new java.awt.Color(0, 153, 102));
        b_remove_ani.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_remove_ani.setForeground(new java.awt.Color(255, 255, 255));
        b_remove_ani.setText("Remover");
        b_remove_ani.setFocusable(false);
        b_remove_ani.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_remove_aniMouseClicked(evt);
            }
        });

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
                        .addComponent(b_excluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_nomeCliente)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campo_email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(l_telefone)
                                    .addGap(290, 290, 290)))
                            .addComponent(campo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_endereco)
                            .addComponent(l_servico)
                            .addComponent(campo_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(l_animal)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_add_ani, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b_remove_ani, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_nomeCliente)
                    .addComponent(l_animal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(campo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l_endereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l_servico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l_telefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_remove_ani, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_add_ani, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_excluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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

    public void preencherCadastro(Cliente cliente) {
        campo_cliente.setText(cliente.getNomeCliente());
        campo_endereco.setText(cliente.getEnderecoCliente());
        campo_email.setText(cliente.getEmailCliente());
        campo_telefone.setText(cliente.getTelefoneCliente());
        this.lista_ani.setModel(model);
        ArrayList<Animal> listaAnimal = cliente.getListaAnimal();
        for (int i = 0; i < listaAnimal.size(); i++) {
            model.add(i, listaAnimal.get(i).getNomeAnimal());
        }
        //System.out.println(cliente.getListaAnimal().get(0).getNomeAnimal());
    }
    
    public void removerAnimalDaLista(Cliente cliente) {
        //String nomeAnimal = lista_ani.getName();
        //System.out.println(nomeAnimal);
        //model.remove(selectedIndex);
        //cliente.removeAnimal(cliente.getListaAnimal().get(selectedIndex));
        //arquivoXMLAnimal.leXML();
        //ArrayList<Animal> listaAnimal = arquivoXMLAnimal.getList();
        //arquivoXMLAnimal.escreveXML(getLista());
        //return selectedIndex;
    }
    
    private void b_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_voltarMouseClicked
        controle.chamaConsultaDeCadastro(this);
    }//GEN-LAST:event_b_voltarMouseClicked

    private void b_add_aniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_add_aniMouseClicked
        controle.adicionaAnimal(this,campo_cliente.getText());
    }//GEN-LAST:event_b_add_aniMouseClicked

    private void b_excluir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_excluir1MouseClicked
        controle.excluiCadastroCliente(campo_cliente.getText(),this);
    }//GEN-LAST:event_b_excluir1MouseClicked

    private void b_remove_aniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_remove_aniMouseClicked
        //removeAnimal();
        controle.removeAnimal(this,model.size(),model.toString());
    }//GEN-LAST:event_b_remove_aniMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InformacoesCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacoesCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacoesCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacoesCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new InformacoesCliente().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Telas/Imagens/icone.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_add_ani;
    private javax.swing.JButton b_excluir1;
    private javax.swing.JButton b_remove_ani;
    private javax.swing.JButton b_voltar;
    private javax.swing.JTextField campo_cliente;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_endereco;
    private javax.swing.JTextField campo_telefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_animal;
    private javax.swing.JLabel l_endereco;
    private javax.swing.JLabel l_icone;
    private javax.swing.JLabel l_nomeCliente;
    private javax.swing.JLabel l_servico;
    private javax.swing.JLabel l_telefone;
    private javax.swing.JLabel l_titulo;
    private javax.swing.JLabel l_versao;
    private javax.swing.JList lista_ani;
    // End of variables declaration//GEN-END:variables

    public void EXIT_ON_CLOSE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
