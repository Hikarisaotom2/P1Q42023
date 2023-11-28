/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase27_11_2023_clases;

/**
 *
 * @author Clau
 */
public class Clase27_11_2023_clases {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Tipo_Dato nombre_Variable = valorInicial;
        String cadena = "";
        Boolean bandera = true;
        int [] lista = new Int[5];
        Scanner entrada = new Scanner(System.in);
        */
        Persona miObjetoPersona = new Persona("claudia",90,"F","Cafe");
        System.out.println("mi persona: "+miObjetoPersona);
        
        /*1) Accediendo a la variable*/
        miObjetoPersona.nombre = "Clau";
        miObjetoPersona.edad = 92;
        int valor = 5;
        System.out.println("el valor es "+valor);
        System.out.println("el valor de la edad es "+ miObjetoPersona.edad);
        System.out.println("mi persona actualizada: "+miObjetoPersona);
        
        /*2) Mutadores de acceso / setters/getters*/
        miObjetoPersona.setNombre("Patricia");
         miObjetoPersona.setEdad(85);
       int edad = miObjetoPersona.getEdad();
         System.out.println("el valor de la edad es "+ edad);
         System.out.println("mi persona actualizada: "+miObjetoPersona);
    }

}
