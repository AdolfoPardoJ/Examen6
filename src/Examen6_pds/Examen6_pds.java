
package Examen6_pds;

import Controlador.Controlador;

import Modelo.Modelo;

import Vista.Agregar;
import Vista.Eliminar;
import Vista.Listar;
import Vista.Menu;
import Vista.Modificar;




public class Examen6_pds {

   
    public static void main(String[] args) {
   Menu menu= new Menu();
   Modelo modelo= new Modelo();
  Agregar agregar = new Agregar();
  Eliminar eliminar = new Eliminar();
  Listar listar = new Listar();
  Modificar modificar = new Modificar();
  
   Controlador controlador= new Controlador(menu,agregar,eliminar,modificar,listar,modelo);
   controlador.ingresar();
    }
    
}
