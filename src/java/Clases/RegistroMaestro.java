
package Clases;



    
   public class RegistroMaestro{
     MaestroModell[] tablaLibros;
    int indiceArray;
    
    public RegistroMaestro(){
        this.tablaLibros = new MaestroModell [100];
        this.indiceArray=0;
    }
    
     public void guardarLibros(  MaestroModell libros){
        this.tablaLibros[this.indiceArray]=libros;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public   MaestroModell[] getLibros(){
        return this.tablaLibros;
    }
    
} 
    
    
    

