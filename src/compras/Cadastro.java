package compras;

import javax.swing.JOptionPane;


public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
        setSize(360,235);
        setLocationRelativeTo(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(1, 1, 1));
        jButton1.setText("Cadastrar");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 80, 100, 42);

        jLabel2.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Produto:");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 90, 30);

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(110, 90, 110, 30);

        jButton2.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(1, 1, 1));
        jButton2.setText("Cancelar");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(240, 130, 100, 42);

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(110, 130, 110, 30);

        jLabel3.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Preço:");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 130, 90, 30);

        jLabel4.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Quantidade:");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 170, 100, 30);

        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(110, 170, 110, 30);

        jLabel6.setFont(new java.awt.Font("Ubuntu Condensed", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("     Cadastrando Produtos");
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 10, 320, 30);

        jLabel1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Cliente:");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 50, 90, 30);

        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(110, 50, 110, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compras/0557bd128221118.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -20, 360, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
       
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Tela_Inicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       String NomePro = jTextField1.getText();
       String Preco = jTextField2.getText();
       String Quant = jTextField3.getText();
       String Client = jTextField4.getText();
       
       Produto pro = new Produto();
       pro.setProduto(NomePro);
       pro.setPreco(Preco);
       pro.setQuantidade(Quant);
       pro.setCliente(Client);
       
           pro.cadastrar (NomePro, Preco, Quant, Client);
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
        new Lista_Compras(jTextField4.getText()).setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
