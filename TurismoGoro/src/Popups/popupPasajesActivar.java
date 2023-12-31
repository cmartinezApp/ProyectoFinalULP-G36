/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Popups;

import Entidades.*;
import AccesoADatos.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class popupPasajesActivar extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla = new DefaultTableModel();

    /**
     * Creates new form popupCiudad
     */
    public popupPasajesActivar() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null); //Elimina encabezado de ventana
        crearTable();
        llenarTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pasajesTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        setMaximumSize(new java.awt.Dimension(570, 420));
        setMinimumSize(new java.awt.Dimension(570, 420));
        setPreferredSize(new java.awt.Dimension(570, 420));
        getContentPane().setLayout(null);

        selectButton.setText("Activar");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });
        getContentPane().add(selectButton);
        selectButton.setBounds(320, 340, 140, 32);

        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        getContentPane().add(salirButton);
        salirButton.setBounds(90, 340, 70, 32);

        pasajesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        pasajesTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(pasajesTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 20, 453, 290);

        setBounds(115, 90, 570, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirButtonActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        Pasaje_Data pasajeOn = new Pasaje_Data();
//        Pasaje pasaje = new Pasaje();
        int id = Integer.valueOf(modeloTabla.getValueAt(pasajesTable.getSelectedRow(), 0).toString());
//        pasaje = pasajeOn.buscarPasaje(id);
        pasajeOn.activarPasaje(id);
        ClearTable();
        llenarTable();
    }//GEN-LAST:event_selectButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pasajesTable;
    private javax.swing.JButton salirButton;
    private javax.swing.JButton selectButton;
    // End of variables declaration//GEN-END:variables

    private void crearTable() {
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Ciudad Origen");
        modeloTabla.addColumn("Ciudad Destino");
        modeloTabla.addColumn("Transporte");
        pasajesTable.setModel(modeloTabla);
    }

    private void llenarTable() {
        Pasaje_Data listar = new Pasaje_Data();
        List<Pasaje> list = new ArrayList();
        list = listar.listarPasajesInactivos();
        for (Pasaje pas : list) {
            modeloTabla.addRow(new Object[]{pas.getIdPasajero(), pas.getNombreCiudadO().getNombre(), pas.getNombreCiudadD().getNombre(), pas.getTipoTransporte()});
        }
        ocultarColumnas(pasajesTable, new int[]{0});
    }

    public void ocultarColumnas(JTable tbl, int columna[]) {
        for (int i = 0; i < columna.length; i++) {
            tbl.getColumnModel().getColumn(columna[i]).setMaxWidth(0);
            tbl.getColumnModel().getColumn(columna[i]).setMinWidth(0);
            tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMaxWidth(0);
            tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMinWidth(0);
        }
    }

    private void ClearTable() {
        for (int i = 0; i < pasajesTable.getRowCount(); i++) {
            modeloTabla.removeRow(i);
            i -= 1;
        }
    }
}
