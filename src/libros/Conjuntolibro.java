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
public class Conjuntolibro {
     private Libros[] libro;

    public Conjuntolibro() {
        this.libro =new Libros[10];
    }
     
    public boolean anadirlibro(Libros libro){
        for (int a=0; a<10;a++){
            if (this.libro[a]==null){
                this.libro[a]=libro;
                return true;
                
            }}
            return false;
     }
    
    public boolean elminarlibro(String titulo){
        for (int i = 0; i < this.libro.length; i++) {
         if (this.libro[i].getTitulo().equals(titulo)){
             //this.libro[i]=null:
             return true;
         }
            
        }
        return false;
    }
        
        public Libros buscarMejorCalificacion(){
            
            
          return null;  
        }
            
    }
    
    
    
    
    
    
    
    
    