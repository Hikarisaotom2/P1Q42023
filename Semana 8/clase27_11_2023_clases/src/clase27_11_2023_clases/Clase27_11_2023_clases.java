/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase27_11_2023_clases;

import java.util.ArrayList;
import java.util.Scanner;

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
//        Persona miObjetoPersona = new Persona("claudia", 90, "F", "Cafe");
//        System.out.println("mi persona: " + miObjetoPersona);

        /*1) Accediendo a la variable*/
//        miObjetoPersona.nombre = "Clau";
//        miObjetoPersona.edad = 92;
//        int valor = 5;
//        System.out.println("el valor es "+valor);
//        System.out.println("el valor de la edad es "+ miObjetoPersona.edad);
//        System.out.println("mi persona actualizada: "+miObjetoPersona);
        /*2) Mutadores de acceso / setters/getters*/
//        miObjetoPersona.setNombre("Patricia");
//        miObjetoPersona.setEdad(85);
//        int edad = miObjetoPersona.getEdad();
//        System.out.println("el valor de la edad es " + edad);
//        System.out.println("mi persona actualizada: " + miObjetoPersona);

        /*MINI RNP;
        CRUD
        CREATE
        READ
        UPDATE 
        DELETE
        1) Registrar una persona. LISTO 
        2) Modificar datos de la persona
        3) Estado de def
        4)Listar personas LISTO
        5) Eliminar una persona de la lista*/
        
        //Persona [] personas = new Persona[10];
        ArrayList <Persona> personas = new ArrayList<Persona>();
        
        //1)Agregar una persona a la lista del sistema.
        //1.1 crear personas que será agregada a la lista 
        Persona nuevaPersonaCreada = crearPersona();
        //1.2 Agregar persona a la lista 
        personas=agregarPersonaLista(nuevaPersonaCreada,personas);
        
        //4) imprimir la lista
        imprimirLista(personas);
        
    }
    public static void imprimirLista(ArrayList <Persona> lista){
        int tamanoLista = lista.size();
        for (int i = 0; i < tamanoLista; i++) {
            Persona elementoEnI= lista.get(i);
            System.out.println(i+") "+elementoEnI);
        }
        
    }
    public static ArrayList <Persona> agregarPersonaLista(Persona personaAgregar,ArrayList <Persona> listaAgregar ){
        listaAgregar.add(personaAgregar);
        return listaAgregar;
    }
    public static Persona crearPersona(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la edad de la persona: ");
        int edad = entrada.nextInt();
        System.out.println("Ingrese el sexo de la persona: ");
        String sexo = entrada.next();
        System.out.println("Ingrese el color de los ojos de la persona: ");
        String colorOjos = entrada.next();
        Persona nuevaPersona = new Persona(nombre,edad,sexo,colorOjos);
        return nuevaPersona;
    }

}
