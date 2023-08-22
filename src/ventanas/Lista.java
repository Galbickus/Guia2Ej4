
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.TreeSet;

/**
 *
 * @author Veronica
 */
public class Lista extends javax.swing.JFrame {

    public static TreeSet<Producto> listaProductos = new TreeSet<>(); //ESTATICO

   
    public Lista() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarProductos();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/tienda B.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalida = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jDesktopPaneESCRITORIO = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemPorRubro = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItemPorPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalida.setBackground(new java.awt.Color(0, 0, 51));
        jButtonSalida.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButtonSalida.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalida.setText("Salir");
        jButtonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tienda.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 54)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Super Todo S.A. ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 420, 70));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gradient_2.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 661, 517));

        javax.swing.GroupLayout jDesktopPaneESCRITORIOLayout = new javax.swing.GroupLayout(jDesktopPaneESCRITORIO);
        jDesktopPaneESCRITORIO.setLayout(jDesktopPaneESCRITORIOLayout);
        jDesktopPaneESCRITORIOLayout.setHorizontalGroup(
            jDesktopPaneESCRITORIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jDesktopPaneESCRITORIOLayout.setVerticalGroup(
            jDesktopPaneESCRITORIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPaneESCRITORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 500));

        jMenu1.setForeground(new java.awt.Color(0, 0, 51));
        jMenu1.setText("Administración");
        jMenu1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N

        jMenuItemProductos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jMenuItemProductos.setForeground(new java.awt.Color(0, 0, 102));
        jMenuItemProductos.setText("Productos");
        jMenuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 0, 51));
        jMenu2.setText("Consultas");
        jMenu2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N

        jMenuItemPorRubro.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jMenuItemPorRubro.setForeground(new java.awt.Color(0, 0, 102));
        jMenuItemPorRubro.setText("Por Rubro...");
        jMenuItemPorRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPorRubroActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemPorRubro);

        jMenuItem3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 0, 102));
        jMenuItem3.setText("Por Nombre...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItemPorPrecio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jMenuItemPorPrecio.setForeground(new java.awt.Color(0, 0, 102));
        jMenuItemPorPrecio.setText("Por Precio...");
        jMenuItemPorPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPorPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemPorPrecio);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSalidaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here://Este es BUSQUEDA POR NOMBRE me olvidè de cambiar el nombre del botón
        jDesktopPaneESCRITORIO.removeAll();
        jDesktopPaneESCRITORIO.repaint();
        BusquedaPorNombreView bpn = new BusquedaPorNombreView();  //es mi clase internal frame
        bpn.setVisible(true);                                   //por defecto las vistas nacen invisibles, hay que visibilizarlas
        jDesktopPaneESCRITORIO.add(bpn);   //agragamos a nuestro escritorio la ventana
        jDesktopPaneESCRITORIO.moveToFront(bpn);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductosActionPerformed
        // TODO add your handling code here:
        jDesktopPaneESCRITORIO.removeAll();
        jDesktopPaneESCRITORIO.repaint();
        GestorDeProductos gdp = new GestorDeProductos();
        gdp.setVisible(true);
        jDesktopPaneESCRITORIO.add(gdp);   //agragamos a nuestro escritorio la ventana
        jDesktopPaneESCRITORIO.moveToFront(gdp);

    }//GEN-LAST:event_jMenuItemProductosActionPerformed

    private void jMenuItemPorRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPorRubroActionPerformed
        // TODO add your handling code here:
        jDesktopPaneESCRITORIO.removeAll();
        jDesktopPaneESCRITORIO.repaint();
        ConsultasPorRubro cpr = new ConsultasPorRubro();
        cpr.setVisible(true);
        jDesktopPaneESCRITORIO.add(cpr);   //agragamos a nuestro escritorio la ventana
        jDesktopPaneESCRITORIO.moveToFront(cpr);

    }//GEN-LAST:event_jMenuItemPorRubroActionPerformed

    private void jMenuItemPorPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPorPrecioActionPerformed
        // TODO add your handling code here:
        jDesktopPaneESCRITORIO.removeAll();
        jDesktopPaneESCRITORIO.repaint();
        ListadoPorPrecio lpp = new ListadoPorPrecio();
        lpp.setVisible(true);
        jDesktopPaneESCRITORIO.add(lpp);   //agragamos a nuestro escritorio la ventana
        jDesktopPaneESCRITORIO.moveToFront(lpp);
    }//GEN-LAST:event_jMenuItemPorPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JDesktopPane jDesktopPaneESCRITORIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemPorPrecio;
    private javax.swing.JMenuItem jMenuItemPorRubro;
    private javax.swing.JMenuItem jMenuItemProductos;
    // End of variables declaration//GEN-END:variables
private void cargarProductos() {
        listaProductos.add(new Producto(10, "Azúcar", 180.75, 5, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(111, "Yerba ", 180.75, 5, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(81, "Azúcar", 600.75, 100, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(82, "Aceite", 630.55, 150, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(93, "Arroz", 300.35, 200, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(94, "Leche", 400.15, 30, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(95, "Jabón", 230.15, 300, Categoria.LIMPIEZA));
        listaProductos.add(new Producto(86, "Lavandina", 230.15, 30, Categoria.LIMPIEZA));
        listaProductos.add(new Producto(87, "Detergente", 230.15, 30, Categoria.LIMPIEZA));
        listaProductos.add(new Producto(98, "Desodorante", 530.15, 30, Categoria.PERFUMERIA));
        listaProductos.add(new Producto(99, "Perfume", 1530.15, 30, Categoria.PERFUMERIA));
        listaProductos.add(new Producto(91, "Esmalte de uñas", 530.15, 30, Categoria.PERFUMERIA));
        listaProductos.add(new Producto(1, "Pan", 80, 50, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(2, "Pan blanco", 30, 100, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(3, "Jabón en barra", 40, 15, Categoria.LIMPIEZA));
        listaProductos.add(new Producto(4, "Shampoo", 150, 25, Categoria.PERFUMERIA));
        listaProductos.add(new Producto(5, "Manzanas", 120, 40, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(6, "Detergente líquido", 60, 20, Categoria.LIMPIEZA));
        listaProductos.add(new Producto(7, "Perfume cítrico", 800, 10, Categoria.PERFUMERIA));
        listaProductos.add(new Producto(8, "Cereal", 200, 30, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(9, "Papel higiénico", 50, 40, Categoria.LIMPIEZA));
    }
}
