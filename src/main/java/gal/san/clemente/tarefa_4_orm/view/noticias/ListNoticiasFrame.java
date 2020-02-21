package gal.san.clemente.tarefa_4_orm.view.noticias;

import gal.san.clemente.tarefa_4_orm.exception.ModelException;
import gal.san.clemente.tarefa_4_orm.model.dao.IDAOManagerRSS;
import gal.san.clemente.tarefa_4_orm.view.converter.NoticiaTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListNoticiasFrame extends javax.swing.JFrame {
    
    private IDAOManagerRSS manager;
    
    private NoticiaTableModel model;
    
    public ListNoticiasFrame(IDAOManagerRSS manager) throws ModelException {
        initComponents();
        this.manager = manager;
        this.model = new NoticiaTableModel(manager.getNoticiaDAO());
        obtenerDatos();
        this.tablaNoticias.setModel(model);
        //selección de filas
        this.tablaNoticias.getSelectionModel().addListSelectionListener(e -> {
            boolean seleccionValida = (tablaNoticias.getSelectedRow() != -1);
        });
    }
    
    final void obtenerDatos() throws ModelException {
        registrosNoticias.setText("Actualizando datos ...");
        model.updateModelNoticia();
        registrosNoticias.setText(model.getRowCount() + " registros de noticias");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuProdutos = new javax.swing.JToolBar();
        botonActualizarNoticias = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNoticias = new javax.swing.JTable();
        registrosNoticias = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión Productos");

        menuProdutos.setRollover(true);

        botonActualizarNoticias.setText("Actualizar noticias");
        botonActualizarNoticias.setFocusable(false);
        botonActualizarNoticias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonActualizarNoticias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonActualizarNoticias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarNoticiasActionPerformed(evt);
            }
        });
        menuProdutos.add(botonActualizarNoticias);

        getContentPane().add(menuProdutos, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        tablaNoticias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        tablaNoticias.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tablaNoticiasComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(tablaNoticias);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        registrosNoticias.setText("0 rexistros de noticias");
        registrosNoticias.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jPanel1.add(registrosNoticias, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarNoticiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarNoticiasActionPerformed
        try {
            this.obtenerDatos();
        } catch (ModelException ex) {
            Logger.getLogger(ListNoticiasFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonActualizarNoticiasActionPerformed

    private void tablaNoticiasComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tablaNoticiasComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaNoticiasComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarNoticias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar menuProdutos;
    private javax.swing.JLabel registrosNoticias;
    private javax.swing.JTable tablaNoticias;
    // End of variables declaration//GEN-END:variables
}
