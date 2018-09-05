/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

/**
 *
 * @author Estudiante
 */
public class Pruebalibros {
    public static void main(String[] args) {
        //relacion de depencia
        Conjuntolibro biblioteca=new Conjuntolibro();
        //depndencias
        AUTOR autor= new AUTOR("elver","galarga");
        Libros libro=new Libros("cien",300,2);
        boolean resultado=biblioteca.anadirlibro(libro);
        if (resultado==true){System.out.println("satisfactorio");}
        else{System.out.println("rechasado");}
        
        
    }
    
}
