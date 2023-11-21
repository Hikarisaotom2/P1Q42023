/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication59;

/**
 *
 * @author Clau
 */
public class JavaApplication59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int tamFilas= 5;
        int tamColumnas = 6;
        String [] [] matrizNoCuadrada =  new String [tamFilas][tamColumnas];
        
        for (int i = 0; i <matrizNoCuadrada .length ; i++) { //Filas 
            for (int j = 0; j <matrizNoCuadrada[0].length; j++) { //Columnas
                System.out.print(matrizNoCuadrada[i][j]);
            }
            System.out.println("");
        }
        //Matriz de columnas variables
        int tamano2 = 6;
         String [] [] matrizEspecial =  new String [tamano2][];
         for (int i = 0; i < matrizEspecial.length; i++) {
             matrizEspecial[i]= new String[i];
             for (int j = 0; j < matrizEspecial[i].length; j++) {
                 System.out.print(matrizEspecial[i][j]);
             }
             System.out.println("");
}
         
    }
}
