/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo;

import Vista.Agregar;
import Vista.Eliminar;
import Vista.Listar;
import Vista.Menu;
import Vista.Modificar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Controlador extends JFrame implements ActionListener, MenuListener {

    Menu menu;
    Agregar agregar;
    Eliminar eliminar;
    Modificar modificar;
    Listar listar;
    Modelo m;

    public Controlador(Menu menu, Agregar agregar, Eliminar eliminar, Modificar modificar, Listar listar, Modelo m) {
        this.menu = menu;
        this.agregar = agregar;
        this.eliminar = eliminar;
        this.modificar = modificar;
        this.listar = listar;
        this.m = m;

        menu.getjAgregar().addMenuListener(this);
        menu.getjListar().addMenuListener(this);
        menu.getjEliminar().addMenuListener(this);
        menu.getjModificar().addMenuListener(this);

        agregar.getjAgregar().addMenuListener(this);
        agregar.getjListar().addMenuListener(this);
        agregar.getjEliminar().addMenuListener(this);
        agregar.getjModificar().addMenuListener(this);
        agregar.getBtnLimpiar().addActionListener(this);

        agregar.getBtnAgregar().addActionListener(this);

        eliminar.getjAgregar().addMenuListener(this);
        eliminar.getjListar().addMenuListener(this);
        eliminar.getjEliminar().addMenuListener(this);
        eliminar.getjModificar().addMenuListener(this);
        eliminar.getBtnbuscar().addActionListener(this);
        eliminar.getBtnEliminar2().addActionListener(this);

        modificar.getjAgregar().addMenuListener(this);
        modificar.getjListar().addMenuListener(this);
        modificar.getjEliminar().addMenuListener(this);
        modificar.getjModificar().addMenuListener(this);
        modificar.getBtnBuscar().addActionListener(this);
        modificar.getBtnModificar().addActionListener(this);
        modificar.getBtnLimpiar().addActionListener(this);

        listar.getjAgregar().addMenuListener(this);
        listar.getjListar().addMenuListener(this);
        listar.getjEliminar().addMenuListener(this);
        listar.getjModificar().addMenuListener(this);
        listar.getjDepto().addActionListener(this);
        listar.getjEjecutarConsulta().addActionListener(this);
        listar.getjConsulta1().addActionListener(this);
        listar.getjConsulta2().addActionListener(this);
        listar.getjConsulta3().addActionListener(this);
        listar.getjConsulta4().addActionListener(this);

        listar.getPopEliminar().addActionListener(this);
    }

    public void ingresar() {
        menu.setTitle("Menú | Administración personal");
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        menu.setResizable(false);

        agregar.setTitle("Agregar Empleado | Administración personal");
        agregar.setLocationRelativeTo(null);
        agregar.setVisible(false);
        agregar.setResizable(false);

        eliminar.setTitle("Eliminar Empleado | Administración personal");
        eliminar.setLocationRelativeTo(null);
        eliminar.setVisible(false);
        eliminar.setResizable(false);

        modificar.setTitle("Modificar Empleado | Administración personal");
        modificar.setLocationRelativeTo(null);
        modificar.setVisible(false);
        modificar.setResizable(false);

        listar.setTitle("Listar Empleado | Administración personal");
        listar.setLocationRelativeTo(null);
        listar.setVisible(false);
        listar.setResizable(false);
        actualizarMostrar();

    }

    public void buscarEmpleado() {

        eliminar.getTblBuscar().setModel(m.buscarEmpleado(Integer.parseInt(eliminar.getTxtCodigo().getText())));

    }

    public void eliminarEmpleado() throws ClassNotFoundException, SQLException {

        m.Eliminar(Integer.parseInt(eliminar.getTxtCodigo().getText()));
        buscarEmpleado();
    }

    public void buscar() throws ClassNotFoundException, SQLException {
        boolean buscar = m.Buscar(Integer.parseInt(modificar.getTxtCodigo().getText()), modificar.getTxtRut(), modificar.getTxtNombre(), modificar.getTxtApellido(), modificar.getTxtCelular(), modificar.getTxtEmail(), modificar.getTxtSueldo(), modificar.getjEstado(), modificar.getjDepto());

    }

    public void actualizarMostrar() {
        if (listar.getjDepto().getSelectedItem().toString().equals("Mostrar Todos")) {
            try {
                listar.getTblMostrar().setModel(m.Mostrar());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            try {
                listar.getTblMostrar().setModel(m.MostrarDepto(listar.getjDepto().getSelectedItem().toString()));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void actionPerformed(ActionEvent e) {
        if (listar.getjConsulta1() == e.getSource()) {
            listar.getjComentarios().setText("Botón que limpia todas las casillas y deja el cursor en la primera casilla para el ingreso de un código");
        }
        if (listar.getjConsulta2() == e.getSource()) {
            listar.getjComentarios().setText("Listar los registros de los empleados en que su departamento es Redes");
        }
        if (listar.getjConsulta3() == e.getSource()) {
            listar.getjComentarios().setText("Eliminar empleados con sueldo bruto igual a $120.000");
        }
        if (listar.getjConsulta4() == e.getSource()) {
            listar.getjComentarios().setText("Modificar todos los sueldos aumentandolos en un 10%");
        }

        if (listar.getjEjecutarConsulta() == e.getSource()) {
            if (listar.getjConsulta1().isSelected()) {
consulta1();
            }
            if (listar.getjConsulta2().isSelected()) {
                listar.getjDepto().setSelectedItem("Redes");
                actualizarMostrar();
            }
            if (listar.getjConsulta3().isSelected()) {
                agregar.setVisible(true);
                listar.setVisible(false);
            }
            if (listar.getjConsulta4().isSelected()) {
                
            }

        }

        if (listar.getjDepto() == e.getSource()) {
            actualizarMostrar();
        }

        if (agregar.getBtnLimpiar() == e.getSource()) {
            limpiarAgregar();
        }

        if (modificar.getBtnLimpiar() == e.getSource()) {
            limpiarModificar();
        }

        if (listar.getPopEliminar() == e.getSource()) {
            try {
                m.Eliminar(Integer.parseInt(listar.getTblMostrar().getModel().getValueAt(listar.getTblMostrar().getSelectedRow(), 0).toString()));
                actualizarMostrar();
            } catch (ClassNotFoundException ex) {

                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);

            } catch (SQLException ex) {

                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);

            }

        }

        if (modificar.getBtnModificar() == e.getSource()) {
            if (validacionesModificar()) {
                try {
                    m.Modificar(Integer.parseInt(modificar.getTxtCodigo().getText()), modificar.getTxtRut().getText(), modificar.getTxtNombre().getText(), modificar.getTxtApellido().getText(), Integer.parseInt(modificar.getTxtCelular().getText()), modificar.getTxtEmail().getText(), Integer.parseInt(modificar.getTxtSueldo().getText()), modificar.getjEstado().getSelectedItem().toString(), modificar.getjDepto().getSelectedItem().toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (modificar.getBtnBuscar() == e.getSource()) {
            if (true) {
                try {

                    buscar();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if (eliminar.getBtnEliminar2() == e.getSource()) {

            try {
                eliminarEmpleado();
                limpiarModificar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (eliminar.getBtnbuscar() == e.getSource()) {

            buscarEmpleado();

        }

        if (agregar.getBtnAgregar() == e.getSource()) {
            if (validaciones() == true) {
                try {
                    m.Insertar(Integer.parseInt(agregar.getTxtCodigo().getText()), agregar.getTxtRut().getText(), agregar.getTxtNombre().getText(), agregar.getTxtApellido().getText(), Integer.parseInt(agregar.getTxtCelular().getText()), agregar.getTxtEmail().getText(), Integer.parseInt(agregar.getTxtSueldo().getText()), agregar.getjEstado().getSelectedItem().toString(), agregar.getjDepto().getSelectedItem().toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    @Override
    public void menuSelected(MenuEvent e) {
        if (menu.getjAgregar() == e.getSource() || agregar.getjAgregar() == e.getSource() || listar.getjAgregar() == e.getSource() || eliminar.getjAgregar() == e.getSource() || modificar.getjAgregar() == e.getSource()) {
            agregar.setVisible(true);
            menu.setVisible(false);
            listar.setVisible(false);
            eliminar.setVisible(false);
            modificar.setVisible(false);
        }

        if (menu.getjEliminar() == e.getSource() || agregar.getjEliminar() == e.getSource() || listar.getjEliminar() == e.getSource() || eliminar.getjEliminar() == e.getSource() || modificar.getjEliminar() == e.getSource()) {
            eliminar.setVisible(true);
            menu.setVisible(false);
            agregar.setVisible(false);
            listar.setVisible(false);

            modificar.setVisible(false);
        }

        if (menu.getjListar() == e.getSource() || agregar.getjListar() == e.getSource() || listar.getjListar() == e.getSource() || eliminar.getjListar() == e.getSource() || modificar.getjListar() == e.getSource()) {
            actualizarMostrar();
            listar.setVisible(true);
            menu.setVisible(false);
            agregar.setVisible(false);

            eliminar.setVisible(false);
            modificar.setVisible(false);

        }

        if (menu.getjModificar() == e.getSource() || agregar.getjModificar() == e.getSource() || listar.getjModificar() == e.getSource() || eliminar.getjModificar() == e.getSource() || modificar.getjModificar() == e.getSource()) {
            modificar.setVisible(true);
            menu.setVisible(false);
            agregar.setVisible(false);
            listar.setVisible(false);
            eliminar.setVisible(false);

        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }

    public boolean validaciones() {
        boolean validador = true;
        if (Integer.parseInt(agregar.getTxtCodigo().getText()) > 100 || Integer.parseInt(agregar.getTxtCodigo().getText()) < 0) {
            JOptionPane.showMessageDialog(this, "El código debe ser mayor o igual a cero y menor 0 igual a 100");
            validador = false;
        } else if (agregar.getTxtRut().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El rut del empleado no debe estar en blanco");
            validador = false;
        } else if (agregar.getTxtNombre().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre del empleado no debe estar en blanco");
            validador = false;
        } else if (agregar.getTxtApellido().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El apellido del empleado no debe estar en blanco");
            validador = false;
        } else if (agregar.getTxtCelular().getText().length() < 9) {
            JOptionPane.showMessageDialog(this, "El celular del empleado debe contener 9 dígitos");
            validador = false;
        }else if (agregar.getTxtEmail().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El email no debe ir en blanco");
            validador = false;
        }
        else if (agregar.getTxtSueldo().getText().equals("")||Integer.parseInt(agregar.getTxtSueldo().getText()) < 120000) {
            JOptionPane.showMessageDialog(this, "El sueldo bruto debe ser mayor o gial a $120.000");
            validador = false;
        } else if (agregar.getjEstado().getSelectedItem().toString().equals(" ")) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un estado civil");
            validador = false;
        } else if (agregar.getjDepto().getSelectedItem().toString().equals(" ")) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un departamento");
            validador = false;
        } else {
            validador = true;
        }

        return validador;

    }

    public boolean validacionesModificar() {
        boolean validador = true;
        if (Integer.parseInt(modificar.getTxtCodigo().getText()) > 100 || Integer.parseInt(modificar.getTxtCodigo().getText()) < 0) {
            JOptionPane.showMessageDialog(this, "El código debe ser mayor o igual a cero y menor 0 igual a 100");
            validador = false;
        } else if (modificar.getTxtRut().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El rut del empleado no debe estar en blanco");
            validador = false;
        } else if (modificar.getTxtNombre().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre del empleado no debe estar en blanco");
            validador = false;
        } else if (modificar.getTxtApellido().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El apellido del empleado no debe estar en blanco");
            validador = false;
        } else if (modificar.getTxtCelular().getText().length() < 9) {
            JOptionPane.showMessageDialog(this, "El celular del empleado debe contener 9 dígitos");
            validador = false;
        }else if (modificar.getTxtEmail().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El email no debe ir en blanco");
            validador = false;
        }
        else if (modificar.getTxtSueldo().getText().equals("")||Integer.parseInt(modificar.getTxtSueldo().getText()) < 120000) {
            JOptionPane.showMessageDialog(this, "El sueldo bruto debe ser mayor o gial a $120.000");
            validador = false;
        } else if (modificar.getjEstado().getSelectedItem().toString().equals(" ")) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un estado civil");
            validador = false;
        } else if (modificar.getjDepto().getSelectedItem().toString().equals(" ")) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un departamento");
            validador = false;
        } else {
            validador = true;
        }

        return validador;


    }

    public void limpiarModificar() {
        System.out.println("Se limpia todo excepto el código");
        modificar.getTxtRut().setText("");
        modificar.getTxtNombre().setText("");
        modificar.getTxtApellido().setText("");
        modificar.getTxtCelular().setText("");
        modificar.getTxtEmail().setText("");
        modificar.getTxtSueldo().setText("");
        modificar.getjEstado().setSelectedItem(" ");
        modificar.getjDepto().setSelectedItem(" ");

    }

    public void limpiarAgregar() {
        agregar.getTxtCodigo().setText("");
        agregar.getTxtRut().setText("");
        agregar.getTxtNombre().setText("");
        agregar.getTxtApellido().setText("");
        agregar.getTxtCelular().setText("");
        agregar.getTxtEmail().setText("");
        agregar.getTxtSueldo().setText("");
        agregar.getjEstado().setSelectedItem(" ");
        agregar.getjDepto().setSelectedItem(" ");
        agregar.getTxtCodigo().requestFocus();

    }
    
    
    
    
    public void consulta1(){
     agregar.setVisible(true);
     listar.setVisible(false);
     agregar.getTxtCodigo().setText("100");
     agregar.getTxtRut().setText("11111111-1");
     agregar.getTxtNombre().setText("Nombre");
     agregar.getTxtApellido().setText("Apellido");
     agregar.getTxtCelular().setText("123456789");
     agregar.getTxtEmail().setText("prueba@duoc.cl");
     agregar.getTxtSueldo().setText("120000");
     agregar.getjEstado().setSelectedItem("C");
     agregar.getjDepto().setSelectedItem("Informática");
     JOptionPane.showMessageDialog(this, "Por favor prueba el botón limpiar para borrar los datos del ejemplo, luego debe quedar el cursor sobre la primera casilla");
    }
    
    
    

}
