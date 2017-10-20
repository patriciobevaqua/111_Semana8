/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesyFunciones;

/**
 *
 * @author Docente
 */
public class Libro {

    public String titulo;
    public String autor;
    public int anio;

//    public  Libro() {  //CONSTRUCTOR devuelve void pero no se coloca tipo
//    titulo="Sin Titulo";
//    autor="No Especificado";
//    anio=5000;
//    
//    }
    public Libro() {
    }

    
    public Libro(String titulo, String autor, int anio, int cantidadEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        //this.cantidadEjemplares = cantidadEjemplares;
    }
/*
     * This
         Hay ocasiones en las que resulta útil referirse al objeto desde el 
         * que se está ejecutando un método. En esas ocasiones se puede usar la referencia
         * especial de objeto "this", pero cuidado, siempre dentro de un método no estático.

     */
    
}
