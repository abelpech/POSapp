/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DIEZ
 */
public class buscarproductos extends javax.swing.JFrame {
String Timezone = "";
    /**
     * Creates new form BuscarProds
     */
    public buscarproductos() {
        initComponents();
                Timezone = "?allowMultiQueries=true&useUnicode=true&useJDBCCompliantTimezoneShift=true\" + "
                + "\"&useLegacyDatetimeCode=false&serverTimezone=UTC &autoReconnect=true&useSSL=false";
                rbVentas.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        rbVentas = new javax.swing.JRadioButton();
        rbInventario = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Descripcion", "Precio", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(jtProductos);

        btnBuscar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        rbVentas.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        rbVentas.setText("Ventas");
        rbVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbVentasMouseClicked(evt);
            }
        });

        rbInventario.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        rbInventario.setText("Inventario");
        rbInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbInventarioMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Buscar por:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Ventas Producto");

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbInventario)
                                .addComponent(rbVentas))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(9, 9, 9))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(rbVentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbInventario)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        int row = 0;
        String q = "";
        String textoABuscar = txtBuscar.getText();
        // Clear table
        jtProductos.setModel(new DefaultTableModel());
        // Model for Table
        conectar c = new conectar();
        
         try {
             DefaultTableModel model = (DefaultTableModel)jtProductos.getModel();
            // TODO add your handling code here:
            Connection con = c.conexion();
                    /*DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda"
                    +Timezone,"root","Horadeaventura1");*/
            Statement st = con.createStatement();
            
            if (rbVentas.isSelected())
            {
                model.addColumn("Productos");
                model.addColumn("Total");
                q = "Select * from ventasproducto where productos like '%" + textoABuscar + "%' or totalventa like '%" +textoABuscar + "%';";
            }
            else if (rbInventario.isSelected())
            {
                model.addColumn("Producto");
                model.addColumn("Descripcion");
                model.addColumn("Precio");
                model.addColumn("Cantidad");
                q = "Select * from producto where producto like '%" + textoABuscar + "%' or descripcion like '%" +textoABuscar + "%' or precio like '%" +textoABuscar + "%'"
                        + "or cantidad like '%" +textoABuscar + "%'";
            }
            
            ResultSet rs=st.executeQuery(q);
            while(rs.next())
            {
                
                if (rbVentas.isSelected())
                {
                    model.addRow(new Object[0]);
                    model.setValueAt(rs.getString("productos"), row, 0);
                    model.setValueAt(rs.getString("totalventa"), row, 1);
                }
                else if (rbInventario.isSelected())
                {
                    model.addRow(new Object[0]);
                    model.setValueAt(rs.getString("producto"), row, 0);
                    model.setValueAt(rs.getString("descripcion"), row, 1);
                    model.setValueAt(rs.getString("precio"), row, 2);
                    model.setValueAt(rs.getString("cantidad"), row, 3);
                }
                
                row++;
            }
            rs.close();
            
        } catch (Exception ex) {
            //Logger.getLogger(F1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rbInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbInventarioMouseClicked
        // TODO add your handling code here:
        rbVentas.setSelected(false);
        rbInventario.setSelected(true);
        
    }//GEN-LAST:event_rbInventarioMouseClicked

    private void rbVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbVentasMouseClicked
        // TODO add your handling code here:
        rbInventario.setSelected(false);
        rbVentas.setSelected(true);
    }//GEN-LAST:event_rbVentasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        menu m = new menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(buscarproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscarproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscarproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscarproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscarproductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProductos;
    private javax.swing.JRadioButton rbInventario;
    private javax.swing.JRadioButton rbVentas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
