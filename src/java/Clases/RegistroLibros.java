
package Clases;

public class RegistroLibros {
      LibrosModell[] tablaLibros;
    int indiceArray;
    
    public RegistroLibros(){
        this.tablaLibros = new LibrosModell [100];
        this.indiceArray=0;
    }
    
     public void guardarLibros(  LibrosModell libros){
        this.tablaLibros[this.indiceArray]=libros;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public   LibrosModell[] getLibros(){
        return this.tablaLibros;
    }
    
}