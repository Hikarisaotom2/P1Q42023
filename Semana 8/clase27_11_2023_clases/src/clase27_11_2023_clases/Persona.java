
package clase27_11_2023_clases;

/**
 *
 * @author Clau
 */
public class Persona {
   
    private String nombre;
    private int edad;
    private String Sexo;
    private String colorOjos;

    /*Constructor*/
    public Persona(String nombre, int edad, String Sexo, String colorOjos){
        this.nombre = nombre;
        this.edad = edad;
        this.Sexo = Sexo;
        this.colorOjos = colorOjos;
      
    }
    /*Mutadores de acceso || Setters/getters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    
    /*Metodos*/
    public String hablar() {
        return "";
    }
    public void comer(){
        
    }

    @Override
    public String toString() {
        return "Nombre: "+ this.nombre +" - "+this.edad;
    }
  
}
