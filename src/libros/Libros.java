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
public class Libros {

    private String titulo;
    private int numerdepaginas;
    private float calificacion;
    //asociacion
    
   private AUTOR autor;

    public Libros(String titulo, int numerdepaginas, float calificacion, AUTOR autor) {
        this.titulo = titulo;
        this.numerdepaginas = numerdepaginas;
        this.calificacion = calificacion;
        this.autor = autor;
    }

    Libros(String cien, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumerdepaginas() {
        return numerdepaginas;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public AUTOR getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumerdepaginas(int numerdepaginas) {
        this.numerdepaginas = numerdepaginas;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public void setAutor(AUTOR autor) {
        this.autor = autor;
    }
   
   
    
    
}
