/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase09_11_2023;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase09_11_2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*IMPORTANTE:
        1)Tamaño fijo:una vez determinado el tamaño, este no puede cambiar
        2) Contenido:Los arreglos solo pueden contener un mismo tipo de dato
        */
        
        // tipo_dato nombre_variable = valor_init;
       // int [] miLista = new int[/*tamano (debe ser un entero)*/];
//        int [] miLista = new int[5];
        int [] miLista ={4,8,9,5};
         miLista = new int[2];
//        int tamano= 5;
//        int [] miLista2 = new int[tamano];
//        int lectura = entrada.nextInt();
//        int [] miLista3 = new int[lectura];
//        int valor = num();
//        int [] miLista4 = new int[lectura];
//        int [] miLista5 = new int[num()];
        
//        System.out.println("El arreglo es "+miLista4);
//            miLista[0]=5;
//            miLista[2]=7;
        for (int i = 0; i < miLista.length; i++) {
            System.out.println("Arreglo "+i+" "+miLista[i]);
        }

    }
    
    public static int num(){
        return 6+3;
    }
    
}
