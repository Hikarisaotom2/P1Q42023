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
        int fac= factorial(60000);
        System.out.println("El resultado es "+fac);
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
        2) Modificar datos de la persona LISTO 
        3)Listar personas LISTO
        4) Eliminar una persona de la lista LISTO 
       5)Buscar un Elemento LISTO */
        //Persona [] personas = new Persona[10];
        ArrayList <Persona> personas = new ArrayList<Persona>();
        //1)Agregar una persona a la lista del sistema.
        //1.1 crear personas que será agregada a la lista 
        Persona nuevaPersonaCreada = crearPersona();
        //1.2 Agregar persona a la lista 
        Persona nuevaPersonaCreada2 = crearPersona();
        personas=agregarPersonaLista(nuevaPersonaCreada,personas);
        personas=agregarPersonaLista(nuevaPersonaCreada2,personas);
        // 2 Modificar los datos de la persona. 
        // 2.1)modificar toda la informacion.... 
        personas=actualizarElemento(personas,0);
        // 2.2) Modificar solo cierto atributo ...
        // Para los estudiantes.
        //3) imprimir la lista
        imprimirLista(personas);
        //4) eliminar 
        personas= eliminarPersona(personas,0);
        //5) Buscar 
        boolean seEncontro = buscarElemento(personas,"claudia");
        if(seEncontro){
            System.out.println("El elemento si se encontro ");
        }else{
            System.out.println("No se encontro el elemento :( ");
        }   
    }
    public static ArrayList <Persona> eliminarPersona(ArrayList <Persona> lista,int pos){
        lista.remove(pos);
        return lista;
    }
    public static boolean buscarElemento(ArrayList <Persona> lista,String nombre){
        for (int i = 0; i < lista.size(); i++) {
            String nombrePersona= lista.get(i).getNombre();
            if(nombrePersona.equalsIgnoreCase(nombre)){
                return true;
            }
        }
        return false;
    }
    public static ArrayList <Persona> actualizarElemento(ArrayList <Persona> lista, int pos){
          Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nuevo nombre de la persona: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la nueva edad de la persona: ");
        int edad = entrada.nextInt();
        System.out.println("Ingrese el nuevo sexo de la persona: ");
        String sexo = entrada.next();
        System.out.println("Ingrese el nuevo color de los ojos de la persona: ");
        String colorOjos = entrada.next();
        
        lista.get(pos).setColorOjos(colorOjos);
        lista.get(pos).setEdad(edad);
        lista.get(pos).setNombre(nombre);
        lista.get(pos).setSexo(sexo);
        
        return lista;
    }
    public static void imprimirLista(ArrayList <Persona> lista){
        //for each 
        for (Persona persona : lista) {
            System.out.println(persona);
        }
//        int tamanoLista = lista.size();
//        for (int i = 0; i < tamanoLista; i++) {
//            Persona elementoEnI= lista.get(i);
//            System.out.println(i+") "+elementoEnI);
//        }
        
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
//Para Java el objeto  nuevaPersona es un objeto distinto a otraNuevaPersona aunque tengan la misma informacion.
//        Persona otraNuevaPersona = new Persona(nombre,edad,sexo,colorOjos);
//        System.out.println("INDTIFICADOR PARA NUEVA PERSONA "+ nuevaPersona.hashCode());
//        System.out.println("IDENTIFICADOR PARA otraNuevaPersona"+ otraNuevaPersona.hashCode());
        
        return nuevaPersona;
    }
    
    public static int factorial( int numero){
   if(numero==1||numero==0){
       return 1 ;
   }else{
       return numero*factorial(numero-1);
   }
}


}
