/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_31.pkg10.pkg2023;

/**
 *
 * @author Clau
 */
public class Clase_31102023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra = "Hola";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }

        System.out.println("");
        // - - - - - - -
        int tamano = 6;
        /*
        - - - -
        - - - -
        - - - -
        - - - -
         */
        //Dibujar un cuadrado. 
        for (int i = 0; i < tamano; i++) { //Controla la linea
            for (int j = 0; j < tamano; j++) {//Control de las columnas
                System.out.print(" - ");
            }
            System.out.println("");
        }

        /*
         0 1 2 3
        0- - - -
        1-     -
        2-     -
        3- - - -
         */
        for (int i = 0; i < 5; i++) {//Controla las lineas
            for (int j = 0; j < 5; j++) {//Controla las columnas
                if (i == 0 || i == 4) {
                    System.out.print(" * ");
                } else if (j == 0 || j == 4) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
  System.out.println("\n SOBRE \n");
        //Sobre 
        int tamanoSobre= 51;//debe ser impar
        System.out.println("Redondeo automatico de java para division entera "+(tamanoSobre/2));
        int mitadDelNumeroImpar= 1+ tamanoSobre/2;
        System.out.println("Redonde de java +1 "+mitadDelNumeroImpar);
        for (int i = 0; i < tamanoSobre; i++) {//Controla las lineas
            for (int j = 0; j < tamanoSobre; j++) {//Controla las columnas
                if (i == 0 || i == tamanoSobre-1) {
                    System.out.print(" * ");
                } else if (j == 0 || j == tamanoSobre-1) {
                    System.out.print(" * ");
                }else if(i==j && i<mitadDelNumeroImpar){
                     System.out.print(" * ");
                 }else if(i+j ==tamanoSobre-1 && i<mitadDelNumeroImpar){    
                     System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }

}
