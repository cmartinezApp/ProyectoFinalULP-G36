package Vistas;

import Popups.*;
import AccesoADatos.*;
import Entidades.*;
import com.sun.glass.events.KeyEvent;

/**
 *
 * @author Susana
 */
public class VentanaAlojamiento extends javax.swing.JInternalFrame {

    /**
     * Creates new form Alojamiento
     */
    public VentanaAlojamiento() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null); //Elimina encabezado de ventana
        cargarComboTipoAlojamiento();
        cargarComboTipoServ();
        bloquearCampos();
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
        jTable1 = new javax.swing.JTable();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLId = new javax.swing.JLabel();
        jTId = new javax.swing.JTextField();
        jBotonClean = new javax.swing.JButton();
        jTipoAloj = new javax.swing.JLabel();
        jLImporte = new javax.swing.JLabel();
        jTImporteDiario = new javax.swing.JTextField();
        jBotonModificar = new javax.swing.JButton();
        jBotonEliminar = new javax.swing.JButton();
        jComboTipoAloj = new javax.swing.JComboBox<>();
        jComboTipoServ = new javax.swing.JComboBox<>();
        jLNombreCiudad = new javax.swing.JLabel();
        jTNombreCiudad = new javax.swing.JTextField();
        closeCiudad = new javax.swing.JButton();
        panelLateral1Ciudad = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelLateral2Ciudad = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLTipoServ1 = new javax.swing.JLabel();
        jBotonBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBotonNuevo = new javax.swing.JButton();
        jBotonGuardar = new javax.swing.JButton();
        jBotonActivar = new javax.swing.JButton();
        jLidCiudad = new javax.swing.JLabel();

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

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setTitle("Alojamiento");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLId.setText("Id Alojamiento");
        jDesktopPane1.add(jLId);
        jLId.setBounds(310, 240, 99, 17);

        jTId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTIdKeyTyped(evt);
            }
        });
        jDesktopPane1.add(jTId);
        jTId.setBounds(440, 240, 72, 23);

        jBotonClean.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBotonClean.setText("Limpiar");
        jBotonClean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonCleanActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBotonClean);
        jBotonClean.setBounds(670, 230, 100, 33);

        jTipoAloj.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTipoAloj.setText("Tipo Alojamiento");
        jDesktopPane1.add(jTipoAloj);
        jTipoAloj.setBounds(310, 310, 116, 17);

        jLImporte.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLImporte.setText("Importe Diario:   $");
        jDesktopPane1.add(jLImporte);
        jLImporte.setBounds(310, 390, 130, 17);

        jTImporteDiario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTImporteDiario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jDesktopPane1.add(jTImporteDiario);
        jTImporteDiario.setBounds(440, 390, 132, 23);

        jBotonModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBotonModificar.setText("Modificar");
        jBotonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonModificarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBotonModificar);
        jBotonModificar.setBounds(520, 510, 110, 33);

        jBotonEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBotonEliminar.setText("Eliminar");
        jBotonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonEliminarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBotonEliminar);
        jBotonEliminar.setBounds(630, 510, 110, 33);

        jComboTipoAloj.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jDesktopPane1.add(jComboTipoAloj);
        jComboTipoAloj.setBounds(440, 310, 147, 20);

        jComboTipoServ.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jDesktopPane1.add(jComboTipoServ);
        jComboTipoServ.setBounds(440, 350, 176, 20);

        jLNombreCiudad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLNombreCiudad.setText("Nombre Ciudad: ");
        jDesktopPane1.add(jLNombreCiudad);
        jLNombreCiudad.setBounds(310, 280, 116, 17);

        jTNombreCiudad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jDesktopPane1.add(jTNombreCiudad);
        jTNombreCiudad.setBounds(440, 280, 132, 23);

        closeCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/flechaAtras.png"))); // NOI18N
        closeCiudad.setText("Atrás");
        closeCiudad.setAlignmentY(0.0F);
        closeCiudad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        closeCiudad.setBorderPainted(false);
        closeCiudad.setContentAreaFilled(false);
        closeCiudad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeCiudadActionPerformed(evt);
            }
        });
        jDesktopPane1.add(closeCiudad);
        closeCiudad.setBounds(670, 20, 90, 38);

        panelLateral1Ciudad.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo2.png"))); // NOI18N

        javax.swing.GroupLayout panelLateral1CiudadLayout = new javax.swing.GroupLayout(panelLateral1Ciudad);
        panelLateral1Ciudad.setLayout(panelLateral1CiudadLayout);
        panelLateral1CiudadLayout.setHorizontalGroup(
            panelLateral1CiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
        );
        panelLateral1CiudadLayout.setVerticalGroup(
            panelLateral1CiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
        );

        jDesktopPane1.add(panelLateral1Ciudad);
        panelLateral1Ciudad.setBounds(0, 0, 229, 171);

        panelLateral2Ciudad.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout panelLateral2CiudadLayout = new javax.swing.GroupLayout(panelLateral2Ciudad);
        panelLateral2Ciudad.setLayout(panelLateral2CiudadLayout);
        panelLateral2CiudadLayout.setHorizontalGroup(
            panelLateral2CiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );
        panelLateral2CiudadLayout.setVerticalGroup(
            panelLateral2CiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jDesktopPane1.add(panelLateral2Ciudad);
        panelLateral2Ciudad.setBounds(0, 171, 229, 450);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupa.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(510, 230, 62, 40);

        jLTipoServ1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLTipoServ1.setText("Tipo Servicio");
        jDesktopPane1.add(jLTipoServ1);
        jLTipoServ1.setBounds(310, 350, 92, 17);

        jBotonBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBotonBuscar.setText("Buscar");
        jBotonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBuscarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBotonBuscar);
        jBotonBuscar.setBounds(670, 190, 100, 33);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupa.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(570, 270, 62, 40);

        jLabel1.setFont(new java.awt.Font("Broadway", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALOJAMIENTOS");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(370, 50, 230, 50);

        jBotonNuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBotonNuevo.setText("Nuevo");
        jBotonNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonNuevoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBotonNuevo);
        jBotonNuevo.setBounds(300, 510, 110, 33);

        jBotonGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBotonGuardar.setText("Guardar");
        jBotonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonGuardarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBotonGuardar);
        jBotonGuardar.setBounds(410, 510, 100, 33);

        jBotonActivar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBotonActivar.setText("Activar");
        jBotonActivar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotonActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonActivarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBotonActivar);
        jBotonActivar.setBounds(680, 320, 90, 31);

        jLidCiudad.setBackground(new java.awt.Color(255, 255, 255));
        jLidCiudad.setForeground(new java.awt.Color(255, 255, 255));
        jLidCiudad.setEnabled(false);
        jDesktopPane1.add(jLidCiudad);
        jLidCiudad.setBounds(0, 0, 0, 0);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 800, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonModificarActionPerformed
        Disponible_Data buscar = new Disponible_Data();
        Alojamiento al = new Alojamiento();
        al.setIdAlojamiento(Integer.parseInt(jTId.getText()));
        Ciudad_Data buscarC = new Ciudad_Data();
        Ciudad city = new Ciudad();
        System.out.println(jLidCiudad.getText());
        city = buscarC.buscarCiudad(Integer.parseInt(jLidCiudad.getText()));
        al.setCiudadDest(city);
        al.setTipoAlojamiento(jComboTipoAloj.getSelectedItem().toString());
        al.setTipoServicio(jComboTipoServ.getSelectedItem().toString());
        al.setImporteDiario(Double.parseDouble(jTImporteDiario.getText()));
        al.setEstado(true);
        buscar.modificarAlojamiento(al);
        limpiarCampos();
        bloquearCampos();
    }//GEN-LAST:event_jBotonModificarActionPerformed

    private void jBotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonEliminarActionPerformed
        Disponible_Data buscar = new Disponible_Data();
        buscar.eliminarAlojamiento(Integer.parseInt(jTId.getText()));
        limpiarCampos();
        bloquearCampos();
    }//GEN-LAST:event_jBotonEliminarActionPerformed

    private void closeCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeCiudadActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeCiudadActionPerformed

    private void jBotonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonCleanActionPerformed
        limpiarCampos();
        bloquearCampos();
    }//GEN-LAST:event_jBotonCleanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDesktopPane1.repaint();
        popupAlojamiento popupAlojamiento = new popupAlojamiento();
        popupAlojamiento.setVisible(true);
        jDesktopPane1.add(popupAlojamiento);
        jDesktopPane1.moveToFront(popupAlojamiento);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBuscarActionPerformed
        Disponible_Data buscar = new Disponible_Data();
        Alojamiento al = buscar.buscarAlojamiento(Integer.parseInt(jTId.getText()));
        jTNombreCiudad.setText(al.getCiudadDest().getNombre());
        jComboTipoAloj.getModel().setSelectedItem(al.getTipoAlojamiento());
        jComboTipoServ.getModel().setSelectedItem(al.getTipoServicio());
        jTImporteDiario.setText(al.getImporteDiario() + "");
        habilitarCampos();
    }//GEN-LAST:event_jBotonBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDesktopPane1.repaint();
        popupAlojamientoCiudad popupAlojamientoCiudad = new popupAlojamientoCiudad();
        popupAlojamientoCiudad.setVisible(true);
        jDesktopPane1.add(popupAlojamientoCiudad);
        jDesktopPane1.moveToFront(popupAlojamientoCiudad);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonGuardarActionPerformed
        Disponible_Data guardar = new Disponible_Data();
        Ciudad_Data c = new Ciudad_Data();
        Ciudad city = c.buscarCiudad(Integer.parseInt(jLidCiudad.getText()));
        Alojamiento al = new Alojamiento(jComboTipoAloj.getItemAt(jComboTipoAloj.getSelectedIndex()).toString(), jComboTipoServ.getItemAt(jComboTipoServ.getSelectedIndex()).toString(), Double.parseDouble(jTImporteDiario.getText()), city, true);
        guardar.guardarAlojamiento(al);
        limpiarCampos();
        bloquearCampos();
    }//GEN-LAST:event_jBotonGuardarActionPerformed

    private void jBotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonNuevoActionPerformed
        limpiarCampos();
        habilitarCampos();
    }//GEN-LAST:event_jBotonNuevoActionPerformed

    private void jBotonActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonActivarActionPerformed
        limpiarCampos();
        bloquearCampos();
        jDesktopPane1.repaint();
        popupActivarAloja popupActivarAloja = new popupActivarAloja();
        popupActivarAloja.setVisible(true);
        jDesktopPane1.add(popupActivarAloja);
        jDesktopPane1.moveToFront(popupActivarAloja);
    }//GEN-LAST:event_jBotonActivarActionPerformed

    private void jTIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIdKeyTyped
        char caracter = evt.getKeyChar();
        if ((caracter < '0' || caracter > '9') && (caracter != KeyEvent.VK_BACKSPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTIdKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeCiudad;
    private javax.swing.JButton jBotonActivar;
    private javax.swing.JButton jBotonBuscar;
    private javax.swing.JButton jBotonClean;
    private javax.swing.JButton jBotonEliminar;
    private javax.swing.JButton jBotonGuardar;
    private javax.swing.JButton jBotonModificar;
    private javax.swing.JButton jBotonNuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<TipoAloj> jComboTipoAloj;
    private javax.swing.JComboBox<TipoServ> jComboTipoServ;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLImporte;
    private javax.swing.JLabel jLNombreCiudad;
    private javax.swing.JLabel jLTipoServ1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLidCiudad;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jTId;
    private javax.swing.JTextField jTImporteDiario;
    public static javax.swing.JTextField jTNombreCiudad;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jTipoAloj;
    private javax.swing.JPanel panelLateral1Ciudad;
    private javax.swing.JPanel panelLateral2Ciudad;
    // End of variables declaration//GEN-END:variables

    private void cargarComboTipoAlojamiento() {
        jComboTipoAloj.addItem(TipoAloj.ELIJA);
        jComboTipoAloj.addItem(TipoAloj.HOTEL);
        jComboTipoAloj.addItem(TipoAloj.HOSTEL);
        jComboTipoAloj.addItem(TipoAloj.HOSTERIA);
        jComboTipoAloj.addItem(TipoAloj.DEPARTAMENTO);
        jComboTipoAloj.addItem(TipoAloj.CABAÑA);
        jComboTipoAloj.addItem(TipoAloj.BUNGALOWS);

    }

    private void cargarComboTipoServ() {
        jComboTipoServ.addItem(TipoServ.ELIJA);
        jComboTipoServ.addItem(TipoServ.DESAYUNO);
        jComboTipoServ.addItem(TipoServ.DESAYUNO_ALMUERZO);
        jComboTipoServ.addItem(TipoServ.DESAYUNO_CENA);
        jComboTipoServ.addItem(TipoServ.MERIENDA_ALMUERZO);
        jComboTipoServ.addItem(TipoServ.MERIENDA_CENA);
        jComboTipoServ.addItem(TipoServ.PENSION_COMPLETA);

    }

    public void limpiarCampos() {
        jTId.setText("");
        jTNombreCiudad.setText("");
        jComboTipoAloj.setSelectedIndex(0);
        jComboTipoServ.setSelectedIndex(0);
        jTImporteDiario.setText("");
        jTId.setEnabled(true);
    }

    public void habilitarCampos() {
        jTId.setEnabled(false);
        jButton2.setEnabled(true);
        jTNombreCiudad.setEnabled(true);
        jTImporteDiario.setEnabled(true);
        jComboTipoAloj.setEnabled(true);
        jComboTipoServ.setEnabled(true);
        jBotonGuardar.setEnabled(true);
    }

    public void bloquearCampos() {
        jButton2.setEnabled(false);
        jTNombreCiudad.setEnabled(false);
        jTImporteDiario.setEnabled(false);
        jComboTipoAloj.setEnabled(false);
        jComboTipoServ.setEnabled(false);
        jBotonGuardar.setEnabled(false);
    }

}
