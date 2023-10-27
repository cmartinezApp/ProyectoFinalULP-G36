package Vistas;

import AccesoADatos.Conexion;
import Entidades.Ciudad;

/**
 *
 * @author Susana
 */
public class Menu_1 extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu_1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        closeApp = new javax.swing.JButton();
        panelLateral1App = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelLateral2App = new javax.swing.JPanel();
        alojamientoButton = new javax.swing.JButton();
        ciudadesButton = new javax.swing.JButton();
        presupuestosButton = new javax.swing.JButton();
        paqueteButton = new javax.swing.JButton();
        pasajesButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Turismo Goró");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);

        escritorio.setMaximumSize(new java.awt.Dimension(800, 600));
        escritorio.setMinimumSize(new java.awt.Dimension(800, 600));

        closeApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cruz.png"))); // NOI18N
        closeApp.setText("Close");
        closeApp.setAlignmentY(0.0F);
        closeApp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        closeApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAppActionPerformed(evt);
            }
        });
        escritorio.add(closeApp);
        closeApp.setBounds(670, 20, 90, 38);

        panelLateral1App.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo2.png"))); // NOI18N

        javax.swing.GroupLayout panelLateral1AppLayout = new javax.swing.GroupLayout(panelLateral1App);
        panelLateral1App.setLayout(panelLateral1AppLayout);
        panelLateral1AppLayout.setHorizontalGroup(
            panelLateral1AppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
        );
        panelLateral1AppLayout.setVerticalGroup(
            panelLateral1AppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
        );

        escritorio.add(panelLateral1App);
        panelLateral1App.setBounds(0, 0, 229, 171);

        panelLateral2App.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout panelLateral2AppLayout = new javax.swing.GroupLayout(panelLateral2App);
        panelLateral2App.setLayout(panelLateral2AppLayout);
        panelLateral2AppLayout.setHorizontalGroup(
            panelLateral2AppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );
        panelLateral2AppLayout.setVerticalGroup(
            panelLateral2AppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        escritorio.add(panelLateral2App);
        panelLateral2App.setBounds(0, 50, 229, 550);

        alojamientoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/alojamiento.png"))); // NOI18N
        alojamientoButton.setDisabledIcon(null);
        alojamientoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alojamientoButtonMouseClicked(evt);
            }
        });
        escritorio.add(alojamientoButton);
        alojamientoButton.setBounds(490, 250, 94, 80);

        ciudadesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mapa.png"))); // NOI18N
        ciudadesButton.setDisabledIcon(null);
        ciudadesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ciudadesButtonMouseClicked(evt);
            }
        });
        ciudadesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadesButtonActionPerformed(evt);
            }
        });
        escritorio.add(ciudadesButton);
        ciudadesButton.setBounds(340, 250, 94, 80);

        presupuestosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/presupuesto.png"))); // NOI18N
        presupuestosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                presupuestosButtonMouseClicked(evt);
            }
        });
        escritorio.add(presupuestosButton);
        presupuestosButton.setBounds(410, 400, 94, 80);

        paqueteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paquete.png"))); // NOI18N
        paqueteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paqueteButtonMouseClicked(evt);
            }
        });
        escritorio.add(paqueteButton);
        paqueteButton.setBounds(560, 400, 94, 80);

        pasajesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pasajes.png"))); // NOI18N
        pasajesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pasajesButtonMouseClicked(evt);
            }
        });
        escritorio.add(pasajesButton);
        pasajesButton.setBounds(630, 250, 94, 80);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ciudades");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        escritorio.add(jLabel1);
        jLabel1.setBounds(340, 340, 90, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alojamiento");
        escritorio.add(jLabel2);
        jLabel2.setBounds(500, 340, 80, 16);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pasajes");
        escritorio.add(jLabel3);
        jLabel3.setBounds(630, 340, 90, 16);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Presupuestos");
        escritorio.add(jLabel4);
        jLabel4.setBounds(410, 490, 90, 16);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Paquetes");
        escritorio.add(jLabel5);
        jLabel5.setBounds(570, 490, 80, 16);

        jLabel6.setFont(new java.awt.Font("Broadway", 3, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MENU");
        escritorio.add(jLabel6);
        jLabel6.setBounds(400, 50, 160, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAppActionPerformed
        //Al hacer click en el boton Salir se finaliza la aplicación
        try{
            Conexion.cerrarConexion();//Cierra todas las conexiones a la base de datos
            System.exit(WIDTH);//Cierra aplicación
        }catch(NullPointerException ex){
            System.exit(WIDTH);//vuelva a cerrar si da error por NullPointerException
        }
    }//GEN-LAST:event_closeAppActionPerformed

    private void ciudadesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ciudadesButtonMouseClicked
        escritorio.repaint();
        VentanaCiudad ventanaCiudad = new VentanaCiudad();
        ventanaCiudad.setVisible(true);
        escritorio.add(ventanaCiudad);
        escritorio.moveToFront(ventanaCiudad);
    }//GEN-LAST:event_ciudadesButtonMouseClicked

    private void alojamientoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alojamientoButtonMouseClicked
        escritorio.repaint();
        VentanaAlojamiento ventanaAlojamiento = new VentanaAlojamiento();
        ventanaAlojamiento.setVisible(true);
        escritorio.add(ventanaAlojamiento);
        escritorio.moveToFront(ventanaAlojamiento);
    }//GEN-LAST:event_alojamientoButtonMouseClicked

    private void pasajesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasajesButtonMouseClicked
        escritorio.repaint();
        VentanaPasaje ventanaPasaje = new VentanaPasaje();
        ventanaPasaje.setVisible(true);
        escritorio.add(ventanaPasaje);
        escritorio.moveToFront(ventanaPasaje);
    }//GEN-LAST:event_pasajesButtonMouseClicked

    private void presupuestosButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presupuestosButtonMouseClicked
        escritorio.repaint();
        VentanaPresupuesto ventanaPresupuesto = new VentanaPresupuesto();
        ventanaPresupuesto.setVisible(true);
        escritorio.add(ventanaPresupuesto);
        escritorio.moveToFront(ventanaPresupuesto);
    }//GEN-LAST:event_presupuestosButtonMouseClicked

    private void paqueteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paqueteButtonMouseClicked
        escritorio.repaint();
        VentanaPaquete ventanaPaquete = new VentanaPaquete();
        ventanaPaquete.setVisible(true);
        escritorio.add(ventanaPaquete);
        escritorio.moveToFront(ventanaPaquete);
    }//GEN-LAST:event_paqueteButtonMouseClicked

    private void ciudadesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alojamientoButton;
    private javax.swing.JButton ciudadesButton;
    private javax.swing.JButton closeApp;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPanel panelLateral1App;
    private javax.swing.JPanel panelLateral2App;
    private javax.swing.JButton paqueteButton;
    private javax.swing.JButton pasajesButton;
    private javax.swing.JButton presupuestosButton;
    // End of variables declaration//GEN-END:variables
}