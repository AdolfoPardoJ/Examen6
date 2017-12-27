/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Image;
import java.awt.Toolkit;


public class Listar extends javax.swing.JFrame {

    /**
     * @return the jcategoria
     */
    public javax.swing.JComboBox<String> getJcategoria() {
        return jcategoria;
    }

    /**
     * @param jcategoria the jcategoria to set
     */
    public void setJcategoria(javax.swing.JComboBox<String> jcategoria) {
        this.jcategoria = jcategoria;
    }

     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo_cine.png"));


        return retValue;
    }
  
 
    public void setjEliminar(javax.swing.JMenu jEliminar) {
        this.setjEliminar(jEliminar);
    }

    public void setjListar(javax.swing.JMenu jListar) {
        this.setjListar(jListar);
    }

    public Listar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        popEliminar = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblMostrar = new javax.swing.JTable();
        jcategoria = new javax.swing.JComboBox<>();
        jEjecutarConsulta = new javax.swing.JButton();
        jConsulta1 = new javax.swing.JRadioButton();
        jConsulta2 = new javax.swing.JRadioButton();
        jConsulta3 = new javax.swing.JRadioButton();
        jConsulta4 = new javax.swing.JRadioButton();
        jComentarios = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jAgregar = new javax.swing.JMenu();
        jListar = new javax.swing.JMenu();
        jEliminar = new javax.swing.JMenu();
        jModificar = new javax.swing.JMenu();

        popEliminar.setText("Eliminar");
        jPopupMenu1.add(popEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        TblMostrar.setFont(new java.awt.Font("Tahoma", 0, 9));
        TblMostrar.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 9));
        TblMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Rut", "Nombre","Apellido","Celular","Email","Sueldo Bruto","Estado Civil","Nombre Depto"
            }
        ));
        TblMostrar.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        TblMostrar.setComponentPopupMenu(jPopupMenu1);
        TblMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TblMostrar.setRowHeight(13);
        jScrollPane1.setViewportView(TblMostrar);

        jcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar Todos", "Informática", "Redes", "Administración", "Finanzas", "Bienestar" }));

        jEjecutarConsulta.setText("Ejecutar Consulta");

        buttonGroup1.add(jConsulta1);
        jConsulta1.setText("1");

        buttonGroup1.add(jConsulta2);
        jConsulta2.setText("2");

        buttonGroup1.add(jConsulta3);
        jConsulta3.setText("3");

        buttonGroup1.add(jConsulta4);
        jConsulta4.setText("4");

        jComentarios.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComentarios.setForeground(new java.awt.Color(51, 51, 51));

        jAgregar.setText("Agregar");
        jMenuBar2.add(jAgregar);

        jListar.setText("Listar");
        jListar.setEnabled(false);
        jMenuBar2.add(jListar);

        jEliminar.setText("Eliminar");
        jMenuBar2.add(jEliminar);

        jModificar.setText("Modificar");
        jMenuBar2.add(jModificar);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jEjecutarConsulta)
                        .addGap(18, 18, 18)
                        .addComponent(jConsulta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jConsulta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jConsulta3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jConsulta4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jEjecutarConsulta)
                        .addComponent(jConsulta1)
                        .addComponent(jConsulta2)
                        .addComponent(jConsulta3)
                        .addComponent(jConsulta4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
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
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblMostrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jAgregar;
    private javax.swing.JLabel jComentarios;
    private javax.swing.JRadioButton jConsulta1;
    private javax.swing.JRadioButton jConsulta2;
    private javax.swing.JRadioButton jConsulta3;
    private javax.swing.JRadioButton jConsulta4;
    private javax.swing.JButton jEjecutarConsulta;
    private javax.swing.JMenu jEliminar;
    private javax.swing.JMenu jListar;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jModificar;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcategoria;
    private javax.swing.JMenuItem popEliminar;
    // End of variables declaration//GEN-END:variables

    
    
    public javax.swing.JMenu getjEliminar() {
        return jEliminar;
    }

    /**
     * @return the jAgregar
     */
    public javax.swing.JMenu getjAgregar() {
        return jAgregar;
    }

    /**
     * @param jAgregar the jAgregar to set
     */
    public void setjAgregar(javax.swing.JMenu jAgregar) {
        this.jAgregar = jAgregar;
    }

    /**
     * @return the jListar
     */
    public javax.swing.JMenu getjListar() {
        return jListar;
    }

    /**
     * @return the jMenuBar2
     */
    public javax.swing.JMenuBar getjMenuBar2() {
        return jMenuBar2;
    }

    /**
     * @param jMenuBar2 the jMenuBar2 to set
     */
    public void setjMenuBar2(javax.swing.JMenuBar jMenuBar2) {
        this.jMenuBar2 = jMenuBar2;
    }

    /**
     * @return the jModificar
     */
    public javax.swing.JMenu getjModificar() {
        return jModificar;
    }

    /**
     * @param jModificar the jModificar to set
     */
    public void setjModificar(javax.swing.JMenu jModificar) {
        this.jModificar = jModificar;
    }

    /**
     * @return the TblMostrar
     */
    public javax.swing.JTable getTblMostrar() {
        return TblMostrar;
    }

    /**
     * @param TblMostrar the TblMostrar to set
     */
    public void setTblMostrar(javax.swing.JTable TblMostrar) {
        this.TblMostrar = TblMostrar;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the jPopupMenu1
     */
    public javax.swing.JPopupMenu getjPopupMenu1() {
        return jPopupMenu1;
    }

    /**
     * @param jPopupMenu1 the jPopupMenu1 to set
     */
    public void setjPopupMenu1(javax.swing.JPopupMenu jPopupMenu1) {
        this.jPopupMenu1 = jPopupMenu1;
    }

    /**
     * @return the popAgregar
     */
  

    /**
     * @param popAgregar the popAgregar to set
     */
   

    /**
     * @return the popEliminar
     */
   

    /**
     * @param popEliminar the popEliminar to set
     */
    public void setPopEliminar(javax.swing.JMenu popEliminar) {
        this.setPopEliminar(popEliminar);
    }

    /**
     * @return the popEliminar
     */
    public javax.swing.JMenuItem getPopEliminar() {
        return popEliminar;
    }

    /**
     * @param popEliminar the popEliminar to set
     */
    public void setPopEliminar(javax.swing.JMenuItem popEliminar) {
        this.popEliminar = popEliminar;
    }

    /**
     * @return the jConsulta1
     */
    public javax.swing.JRadioButton getjConsulta1() {
        return jConsulta1;
    }

    /**
     * @param jConsulta1 the jConsulta1 to set
     */
    public void setjConsulta1(javax.swing.JRadioButton jConsulta1) {
        this.jConsulta1 = jConsulta1;
    }

    /**
     * @return the jConsulta2
     */
    public javax.swing.JRadioButton getjConsulta2() {
        return jConsulta2;
    }

    /**
     * @param jConsulta2 the jConsulta2 to set
     */
    public void setjConsulta2(javax.swing.JRadioButton jConsulta2) {
        this.jConsulta2 = jConsulta2;
    }

    /**
     * @return the jEjecutarConsulta
     */
    public javax.swing.JButton getjEjecutarConsulta() {
        return jEjecutarConsulta;
    }

    /**
     * @param jEjecutarConsulta the jEjecutarConsulta to set
     */
    public void setjEjecutarConsulta(javax.swing.JButton jEjecutarConsulta) {
        this.jEjecutarConsulta = jEjecutarConsulta;
    }

    /**
     * @return the buttonGroup1
     */
    public javax.swing.ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    /**
     * @param buttonGroup1 the buttonGroup1 to set
     */
    public void setButtonGroup1(javax.swing.ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    /**
     * @return the jConsulta3
     */
    public javax.swing.JRadioButton getjConsulta3() {
        return jConsulta3;
    }

    /**
     * @param jConsulta3 the jConsulta3 to set
     */
    public void setjConsulta3(javax.swing.JRadioButton jConsulta3) {
        this.jConsulta3 = jConsulta3;
    }

    /**
     * @return the jConsulta4
     */
    public javax.swing.JRadioButton getjConsulta4() {
        return jConsulta4;
    }

    /**
     * @param jConsulta4 the jConsulta4 to set
     */
    public void setjConsulta4(javax.swing.JRadioButton jConsulta4) {
        this.jConsulta4 = jConsulta4;
    }

    

  

   


    /**
     * @return the jComentarios
     */
    public javax.swing.JLabel getjComentarios() {
        return jComentarios;
    }

    /**
     * @param jComentarios the jComentarios to set
     */
    public void setjComentarios(javax.swing.JLabel jComentarios) {
        this.jComentarios = jComentarios;
    }

   


   

   
}
