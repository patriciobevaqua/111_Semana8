/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesyFunciones;
import javax.swing.JOptionPane;

public class Funciones {

/**
 * recibe un mensaje y devuelve un numero entero
 * @param mensaje mensaje que va a mostrar para pedir dato
 * @return numero Entero
 */
    public static int leerEntero(String mensaje) {
        int numero = 0;
        boolean correcto = false;

        while (!correcto) {
            String aux = JOptionPane.showInputDialog(mensaje);
            boolean cadenaIncorrecta = false;
            boolean cadenaVacia = false;

            for (int i = 0; i < aux.length(); i++) {
                char c = aux.charAt(i);
                if (aux.isEmpty()) {
                    cadenaVacia = true;
                }
                if (!(c >= 48 && c <= 57)|| (c == '-' && i==0)) {
                    cadenaIncorrecta = true;
                }

            }
            if (!cadenaVacia) {
                if (!cadenaIncorrecta) {
                    numero = Integer.parseInt(aux);
                    correcto = true;

                }

            }

        }
        return numero;
    }
    public static int obtenerEnteroAleatorio(int minimo, int maximo) {
        int numero = (int) (Math.random() *maximo) + minimo;
        return numero;
    }
    /**
     * recibe un mensaje y devuelve un numero Double
     * @param mensaje mensaje que va a mostrar para pedir numero
     * @return numero Double
     */
    public static double leerDouble(String mensaje) {
        double numero = 0;
        boolean correcto = false;

        while (!correcto) {
            String aux = JOptionPane.showInputDialog(mensaje);
            boolean cadenaCorrecta = false;
            boolean cadenaVacia = false;
            int punto = 0;

            for (int i = 0; i < aux.length(); i++) {
                char c = aux.charAt(i);
                if (aux.isEmpty()) {
                    cadenaVacia = true;
                }
                
                
                if ((c>=47 && c<=58) || (c=='-' && i==0) || (c=='.')){
                    cadenaCorrecta=true;
                }
                
                if(c=='.'){
                    punto++;
                }
            }

            if ((!cadenaVacia && cadenaCorrecta) && (punto < 2)) {
                numero = Double.parseDouble(aux);
                correcto = true;
            }

        }
        return numero;
    }
    public static boolean esValido(String str) {
        boolean cadenaValida = true;

        for (int i = 0; str.length() < 10; i++) {
            char c = str.charAt(i);
            if (!((c >= 65 && c <= 90) || (c >= 97 && c <= 122))) {
                cadenaValida = false;
            }
        }

        return cadenaValida;
    }

    /**
     * 
     * @param str
     * @return  un array de los caracteres de la cadena 
     */
    public static char[] cadenaACaracteres( String str){
        
        int tamanio = str.length();
        
        char[] resultado = new char[tamanio];
        
        for (int i = 0; i < tamanio; i++) {
            resultado[i] = str.charAt(i);
            
        }
        
        return resultado;
    }
    
    
}
