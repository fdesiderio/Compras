package compras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Lista_Botao extends javax.swing.JFrame {

    
    public Lista_Botao(String Nome) {
        initComponents();
         setSize(536,280);
         setLocationRelativeTo(this);
         
         Cliente.setText(Nome);
        try {
            Lista();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lista_Botao.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
    public void Lista() throws FileNotFoundException{
        DefaultTableModel tabela = (DefaultTableModel) Tabela.getModel();
        
        File pro = new File ("cadastrados");
        File clientes[] = pro.listFiles();
        double PrecoTot = 0;
        if(clientes != null){
            for (int i = 0; i < clientes.length; i++) {
                
                String nome = clientes[i].getName();
                String Nnome = Cliente.getText();
                
                if (Nnome.equals(nome)) {
                    
                    File prosss = new File("cadastrados/"+Cliente.getText());
                    File P[] = prosss.listFiles();
                    //System.out.println("pmktmdgosfkgmkorsjdfoipgksrdfnigmk");
                    
                    for(int j = 0; j < P.length; j++) {
                        
                        File file = P[j];
                        String Nome = file.getName();
                        //System.out.println(Nome);
                      
                        
                    FileReader qtn = new FileReader("cadastrados/"+Cliente.getText()+"/"+Nome+"/Quantidade.txt");
                    BufferedReader Lqtn = new BufferedReader(qtn);
                    FileReader prc = new FileReader("cadastrados/"+Cliente.getText()+"/"+Nome+"/Preco.txt");
                    BufferedReader Lprc = new BufferedReader(prc);
                        
                        
                        
                        
                        try {
                            String Quantidade = Lqtn.readLine();
                            String Preco = Lprc.readLine();
                            
                            double Preco_Pro = Double.parseDouble(Quantidade)*Double.parseDouble(Preco);
                            
                             
                            PrecoTot =  PrecoTot + Preco_Pro; 
                            
                            Object lin[] = {Nome,Quantidade,Preco,Preco_Pro};
                            
                            Vt.setText(PrecoTot+"");
                            
                            tabela.addRow(lin);
                            
                        } catch (IOException ex) {
                        }
                        
                    }
 
                    
                    
                    
                    
                    
                    
                    
                }
                
            }
                
            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Cliente = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Vt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        Tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produtos", "Quantidade", "Preço", "Valor  Total"
            }
        ));
        jScrollPane2.setViewportView(Tabela);
        if (Tabela.getColumnModel().getColumnCount() > 0) {
            Tabela.getColumnModel().getColumn(0).setHeaderValue("Produtos");
            Tabela.getColumnModel().getColumn(1).setHeaderValue("Quantidade");
            Tabela.getColumnModel().getColumn(2).setHeaderValue("Preço");
            Tabela.getColumnModel().getColumn(3).setHeaderValue("Valor  Total");
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 20, 360, 210);

        Cliente.setForeground(java.awt.Color.white);
        Cliente.setText("Nome");
        getContentPane().add(Cliente);
        Cliente.setBounds(50, 234, 230, 20);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 230, 90, 23);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Valor Total:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 50, 70, 14);

        Vt.setForeground(new java.awt.Color(255, 255, 255));
        Vt.setText("valor");
        getContentPane().add(Vt);
        Vt.setBounds(430, 80, 70, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compras/0557bd128221118.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 530, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Tela_Inicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cliente;
    private javax.swing.JTable Tabela;
    private javax.swing.JLabel Vt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
