/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Archivos.BD_User;
import Forms.Menu_NewItem;
import javax.swing.JOptionPane;

/**
 *
 * @author jose miguel
 */
public class Jframe_menu extends javax.swing.JFrame {

    /**
     * Creates new form Jframe_menu
     */
    public Jframe_menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_User = new javax.swing.JButton();
        JB_Items = new javax.swing.JButton();
        JB_proveedor = new javax.swing.JButton();
        JB_INV = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JB_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImanegesMenuBar/usuarioMenu.png"))); // NOI18N
        JB_User.setText("USUARIO");
        JB_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_UserActionPerformed(evt);
            }
        });

        JB_Items.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImanegesMenuBar/ventaMenu.png"))); // NOI18N
        JB_Items.setText("ARTICULO (ITEM)");
        JB_Items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ItemsActionPerformed(evt);
            }
        });

        JB_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/comprasNegro.png"))); // NOI18N
        JB_proveedor.setText("PROVEEDOR");
        JB_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_proveedorActionPerformed(evt);
            }
        });

        JB_INV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu/reporteNegro.png"))); // NOI18N
        JB_INV.setText("INVENTARIO");
        JB_INV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_INVActionPerformed(evt);
            }
        });

        jLabel1.setText("Bienvenido al sistema de ventas SAMS. Elija una opcion");

        jButton1.setText("Usuarios (Existentes)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Items(Existentes)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JB_proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(JB_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JB_Items, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JB_INV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel1)))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_User, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_Items, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton2)))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JB_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_INV, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_UserActionPerformed
        // TODO add your handling code here:
        /*
            Aqui se crea el nuevo usuario
        */
        
        try{
            System.out.println("creando nuevo usuario");
            //se crea directamente la instancia de "nuevo user"
            Menu_NuevoUser newUser = new Menu_NuevoUser();
            newUser.setVisible(true);
            //se cierra esta ventana
            this.setVisible(false);

        }catch(Exception e){
            System.out.println(e);
        }

    }//GEN-LAST:event_JB_UserActionPerformed

    private void JB_ItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ItemsActionPerformed
        // TODO add your handling code here:
        /*
        aqui se crea el nuevo item
        */
        try{
            System.out.println("creando nuevo item");
            //se crea directamente la instancia de la interfaz de "nuevo item"
            Menu_NewItem newItem = new Menu_NewItem();
            
            
            newItem.setVisible(true);
            //se cierra esta ventana
            
            this.dispose();

        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_JB_ItemsActionPerformed

    private void JB_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_proveedorActionPerformed
        // TODO add your handling code here:
        /*
            Aqui se crea el NUEVO PROVEEDOR
        */
        try{
            System.out.println("creando nuevo proveedor");
            //se crea directamente la instancia de "nuevo user"
            Menu_NewProveedor new_menu_pro = new Menu_NewProveedor();
            new_menu_pro.setVisible(true);
            //se cierra esta ventana
            this.setVisible(false);

        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_JB_proveedorActionPerformed

    private void JB_INVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_INVActionPerformed
        // TODO add your handling code here:
        /*
            Aqui se crea el nuevo inventario
        */
        try{
            System.out.println("creando nuevo inventario");
            //se crea directamente la instancia de "nuevo user"
            Menu_NewInv new_menu_inv = new Menu_NewInv();
            new_menu_inv.setVisible(true);
            //se cierra esta ventana
            this.setVisible(false);

        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_JB_INVActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        BD_User Usuarios = new BD_User();
        
        System.out.println("Nombres\n"+Usuarios.getArr_Nombre().toString());
        System.out.println("Direcciones\n"+Usuarios.getArr_Direccion().toString());
        JOptionPane.showMessageDialog(this,Usuarios.getArr_Nombre().toString(), "Usuarios existentes",1);
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
            java.util.logging.Logger.getLogger(Jframe_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_INV;
    private javax.swing.JButton JB_Items;
    private javax.swing.JButton JB_User;
    private javax.swing.JButton JB_proveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
