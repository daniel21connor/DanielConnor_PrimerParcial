
package Clases;


public class MaestroModell {
   private String nombre;
  private String apellido;
  private String codigo;
  private String nombreDelLibro;
  private String  Clase;
   private String CodigoDelLibro;
   



public  MaestroModell (String codigo, String nombre, String nombreDelLibro, String apellido,  String clase, String codigoDelLibro){
        this.codigo=codigo;
        this.nombre=nombre;
        this.apellido =apellido;
        this.CodigoDelLibro =codigoDelLibro;
        this.nombreDelLibro=nombreDelLibro;
        this.Clase=clase;
        
        
        
   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreDelLibro() {
        return nombreDelLibro;
    }

    public void setNombreDelLibro(String nombreDelLibro) {
        this.nombreDelLibro = nombreDelLibro;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    public String getCodigoDelLibro() {
        return CodigoDelLibro;
    }

    public void setCodigoDelLibro(String CodigoDelLibro) {
        this.CodigoDelLibro = CodigoDelLibro;
    }



}
