
package Clases;


public class LibrosModell {
     private String nombre;
  private String tipoDePasta;
  private String codigo;
  private String editorial;
  private String añoDeFabricacion;



public LibrosModell (String codigo, String nombre, String tipoDePasta, String editorial,  String añoDeFabricacion){
        this.codigo=codigo;
        this.nombre=nombre;
        this.tipoDePasta=tipoDePasta;
        this.editorial=editorial;
        this.añoDeFabricacion=añoDeFabricacion;
        
   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDePasta() {
        return tipoDePasta;
    }

    public void setTipoDePasta(String tipoDePasta) {
        this.tipoDePasta = tipoDePasta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAñoDeFabricacion() {
        return añoDeFabricacion;
    }

    public void setAñoDeFabricacion(String añoDeFabricacion) {
        this.añoDeFabricacion = añoDeFabricacion;
    }


}