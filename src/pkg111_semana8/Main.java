/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg111_semana8;

import ClasesyFunciones.Funciones;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Date fechaActual= new Date();
        //impresion con cadena e fecha
        System.out.println(fechaActual);
        
        Date fechaAnioMesDia=new Date(117,9,20);  // 2017-1900=117  | mes va de 0 a 11
        System.out.println(fechaAnioMesDia);
        
        
        
        int opcion;  // variable donde se guardará la opción del menu elegida por el usuario
        boolean salirMenu = false; // es la variable que se afecta para salir del menu y del programa con la opcion 6
        while (salirMenu != true) { //para entrar y salir del menu y del programa
            opcion = Funciones.leerEntero( // Utilizo la función entero para leer el numero y mostrar el menu impreso
                    "Opciones:\n"
                    + "1. Registro de libros\n"
                    + "2. Registro de ejemplar\n"
                    + "3. Registro de Persona\n"
                    + "4. Registro de préstamo de un ejemplar\n"
                    + "5. Devolución de un ejemplar\n"
                    + "6. Consultar Ejemplares prestados a una persona ingresada como opción\n"
                    + "7. Consultar Libros y cantidad de ejemplares disponibles\n"
                    + "8. Listar prestamos\n"
                    + "9. Salir\n");

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "en proceso");
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "en proceso");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "en proceso");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "en proceso");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "en proceso");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "en proceso");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "en proceso");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "en proceso");
                    break;
                case 9:
                    salirMenu = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Debe ingresar un numero del 1 al 9");
                    break;

            }
        }

    }

}
