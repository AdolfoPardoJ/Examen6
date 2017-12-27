/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Image;
import java.awt.Toolkit;


public class Agregar extends javax.swing.JFrame {

   public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo_cine.png"));


        return retValue;
    }
  

  

    /**
     * @return the btnAgregar
     */
    public javax.swing.JButton getBtnAgregar() {
        return btnAgregar;
    }

    /**
     * @param btnAgregar the btnAgregar to set
     */
    public void setBtnAgregar(javax.swing.JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
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
     * @return the buttonGroup2
     */
    public javax.swing.ButtonGroup getButtonGroup2() {
        return buttonGroup2;
    }

    /**
     * @param buttonGroup2 the buttonGroup2 to set
     */
    public void setButtonGroup2(javax.swing.ButtonGroup buttonGroup2) {
        this.buttonGroup2 = buttonGroup2;
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

    public javax.swing.JMenu getjEliminar() {
        return jEliminar;
    }

    /**
     * @param jEliminar the jEliminar to set
     */
    public void setjEliminar(javax.swing.JMenu jEliminar) {
        this.jEliminar = jEliminar;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return getjCodigo();
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.setjCodigo(jLabel1);
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return getjNombre();
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.setjNombre(jLabel2);
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return getjTipo();
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.setjTipo(jLabel4);
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return getjCola();
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.setjCola(jLabel5);
    }

    /**
     * @return the jLabel6
     */
 
    

    /**
     * @return the jListar
     */
    public javax.swing.JMenu getjListar() {
        return jListar;
    }

    /**
     * @param jListar the jListar to set
     */
    public void setjListar(javax.swing.JMenu jListar) {
        this.jListar = jListar;
    }

    /**
     * @return the jMenuBar1
     */
    public javax.swing.JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    /**
     * @param jMenuBar1 the jMenuBar1 to set
     */
    public void setjMenuBar1(javax.swing.JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
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
     * @return the txtCodigo
     */
    public javax.swing.JTextField getTxtCodigo() {
        return txtCodigo;
    }

    /**
     * @param txtCodigo the txtCodigo to set
     */
    public void setTxtCodigo(javax.swing.JTextField txtCodigo) {
        this.txtCodigo = txtCodigo;
    }

    /**
     * @return the txtNombre
     */
    public javax.swing.JTextField getTxtNombre() {
        return getTxtRut();
    }

    /**
     * @param txtNombre the txtNombre to set
     */
    public void setTxtNombre(javax.swing.JTextField txtNombre) {
        this.setTxtRut(txtNombre);
    }


    /**
     * @return the txtTipo
     */
  

    /**
     * @param txtTipo the txtTipo to set
     */
    

    /**
     * Creates new form Menu
     */
    public Agregar() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        jNombre = new javax.swing.JLabel();
        jTipo = new javax.swing.JLabel();
        jCola = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jStock1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jCola1 = new javax.swing.JLabel();
        jCola2 = new javax.swing.JLabel();
        jCola3 = new javax.swing.JLabel();
        jCola4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jDepto = new javax.swing.JComboBox<>();
        jEstado = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jAgregar = new javax.swing.JMenu();
        jListar = new javax.swing.JMenu();
        jEliminar = new javax.swing.JMenu();
        jModificar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jCodigo.setText("Código");

        jNombre.setText("Rut");

        jTipo.setText("Apellido");

        jCola.setText("Celular");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jStock1.setText("Nombre");

        btnLimpiar.setText("Limpiar");

        jCola1.setText("Email");

        jCola2.setText("Sueldo Bruto");

        jCola3.setText("Nombre Dpto");

        jCola4.setText("Estado Civil");

        jDepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Informática", "Redes", "Administración", "Finanzas", "Bienestar" }));

        jEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "C", "S", "V" }));

        jAgregar.setText("Agregar");
        jAgregar.setEnabled(false);
        jMenuBar1.add(jAgregar);

        jListar.setText("Listar");
        jMenuBar1.add(jListar);

        jEliminar.setText("Eliminar");
        jMenuBar1.add(jEliminar);

        jModificar.setText("Modificar");
        jMenuBar1.add(jModificar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCola, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCola1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCola2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCola4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCola3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jDepto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSueldo)
                            .addComponent(txtEmail)
                            .addComponent(txtCelular)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre)
                            .addComponent(txtRut)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCodigo, jCola, jCola1, jCola2, jCola3, jCola4, jNombre, jStock1, jTipo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jStock1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTipo)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCola)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCola1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCola2)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCola4)
                    .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCola3)
                    .addComponent(jDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnLimpiar))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JMenu jAgregar;
    private javax.swing.JLabel jCodigo;
    private javax.swing.JLabel jCola;
    private javax.swing.JLabel jCola1;
    private javax.swing.JLabel jCola2;
    private javax.swing.JLabel jCola3;
    private javax.swing.JLabel jCola4;
    private javax.swing.JComboBox<String> jDepto;
    private javax.swing.JMenu jEliminar;
    private javax.swing.JComboBox<String> jEstado;
    private javax.swing.JMenu jListar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jModificar;
    private javax.swing.JLabel jNombre;
    private javax.swing.JLabel jStock1;
    private javax.swing.JLabel jTipo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jCola
     */
    public javax.swing.JLabel getjCola() {
        return jCola;
    }

    /**
     * @param jCola the jCola to set
     */
    public void setjCola(javax.swing.JLabel jCola) {
        this.jCola = jCola;
    }

    /**
     * @return the jTipo
     */
    public javax.swing.JLabel getjTipo() {
        return jTipo;
    }

    /**
     * @param jTipo the jTipo to set
     */
    public void setjTipo(javax.swing.JLabel jTipo) {
        this.jTipo = jTipo;
    }

    /**
     * @return the jCodigo
     */
    public javax.swing.JLabel getjCodigo() {
        return jCodigo;
    }

    /**
     * @param jCodigo the jCodigo to set
     */
    public void setjCodigo(javax.swing.JLabel jCodigo) {
        this.jCodigo = jCodigo;
    }

    /**
     * @return the jNombre
     */
    public javax.swing.JLabel getjNombre() {
        return jNombre;
    }

    /**
     * @param jNombre the jNombre to set
     */
    public void setjNombre(javax.swing.JLabel jNombre) {
        this.jNombre = jNombre;
    }


    


    /**
     * @return the txtPrecio
     */
    public javax.swing.JTextField getTxtPrecio() {
        return getTxtNombre();
    }

    /**
     * @param txtPrecio the txtPrecio to set
     */
    public void setTxtPrecio(javax.swing.JTextField txtPrecio) {
        this.setTxtNombre(txtPrecio);
    }

    /**
     * @return the btnLimpiar
     */
    public javax.swing.JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    /**
     * @param btnLimpiar the btnLimpiar to set
     */
    public void setBtnLimpiar(javax.swing.JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

    /**
     * @return the jCola1
     */
    public javax.swing.JLabel getjCola1() {
        return jCola1;
    }

    /**
     * @param jCola1 the jCola1 to set
     */
    public void setjCola1(javax.swing.JLabel jCola1) {
        this.jCola1 = jCola1;
    }

    /**
     * @return the jCola2
     */
    public javax.swing.JLabel getjCola2() {
        return jCola2;
    }

    /**
     * @param jCola2 the jCola2 to set
     */
    public void setjCola2(javax.swing.JLabel jCola2) {
        this.jCola2 = jCola2;
    }

    /**
     * @return the jCola3
     */
    public javax.swing.JLabel getjCola3() {
        return jCola3;
    }

    /**
     * @param jCola3 the jCola3 to set
     */
    public void setjCola3(javax.swing.JLabel jCola3) {
        this.jCola3 = jCola3;
    }

    /**
     * @return the jCola4
     */
    public javax.swing.JLabel getjCola4() {
        return jCola4;
    }

    /**
     * @param jCola4 the jCola4 to set
     */
    public void setjCola4(javax.swing.JLabel jCola4) {
        this.jCola4 = jCola4;
    }

    /**
     * @return the jDepto
     */
    public javax.swing.JComboBox<String> getjDepto() {
        return jDepto;
    }

    /**
     * @param jDepto the jDepto to set
     */
    public void setjDepto(javax.swing.JComboBox<String> jDepto) {
        this.jDepto = jDepto;
    }

    /**
     * @return the jEstado
     */
    public javax.swing.JComboBox<String> getjEstado() {
        return jEstado;
    }

    /**
     * @param jEstado the jEstado to set
     */
    public void setjEstado(javax.swing.JComboBox<String> jEstado) {
        this.jEstado = jEstado;
    }

    /**
     * @return the jStock1
     */
    public javax.swing.JLabel getjStock1() {
        return jStock1;
    }

    /**
     * @param jStock1 the jStock1 to set
     */
    public void setjStock1(javax.swing.JLabel jStock1) {
        this.jStock1 = jStock1;
    }

    /**
     * @return the txtApellido
     */
    public javax.swing.JTextField getTxtApellido() {
        return txtApellido;
    }

    /**
     * @param txtApellido the txtApellido to set
     */
    public void setTxtApellido(javax.swing.JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    /**
     * @return the txtCelular
     */
    public javax.swing.JTextField getTxtCelular() {
        return txtCelular;
    }

    /**
     * @param txtCelular the txtCelular to set
     */
    public void setTxtCelular(javax.swing.JTextField txtCelular) {
        this.txtCelular = txtCelular;
    }

    /**
     * @return the txtEmail
     */
    public javax.swing.JTextField getTxtEmail() {
        return txtEmail;
    }

    /**
     * @param txtEmail the txtEmail to set
     */
    public void setTxtEmail(javax.swing.JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    /**
     * @return the txtRut
     */
    public javax.swing.JTextField getTxtRut() {
        return txtRut;
    }

    /**
     * @param txtRut the txtRut to set
     */
    public void setTxtRut(javax.swing.JTextField txtRut) {
        this.txtRut = txtRut;
    }

    /**
     * @return the txtSueldo
     */
    public javax.swing.JTextField getTxtSueldo() {
        return txtSueldo;
    }

    /**
     * @param txtSueldo the txtSueldo to set
     */
    public void setTxtSueldo(javax.swing.JTextField txtSueldo) {
        this.txtSueldo = txtSueldo;
    }
}
