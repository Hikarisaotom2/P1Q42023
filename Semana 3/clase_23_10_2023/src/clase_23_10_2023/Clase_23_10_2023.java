/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_23_10_2023;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase_23_10_2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una oración: ");
        String texto="";
        texto = entrada.nextLine();
        System.out.println("La oración fue "+texto);
        
        int tamanoCadena = texto.length();
        System.out.println("El tamano es "+tamanoCadena);
        //1ER: 0
        // ULTIMA: tamano-1
      char caracter= texto.charAt(0);
      int ultimaPos= texto.length()-1;
         char caracterFinal= texto.charAt(ultimaPos);
        System.out.println("La letra en la pos 0 es "+caracter);
        System.out.println("La letra en la pos "+ultimaPos
                +" es "+caracterFinal);
        String texto2 = "Hola";
        if (texto.equalsIgnoreCase(texto2)) {
            System.out.println("Lo textos son distintos ");
        }
        String prueba= "prueba";
        prueba= prueba+" "+texto+" "+texto2;
        System.out.println("El texto concatenado es: "+prueba);
        
        String todoMayus= texto.toUpperCase();
        String todoMinus = texto.toLowerCase();
        System.out.println("El texto en mayus "+todoMayus);
        System.out.println("El texto en minus "+todoMinus);
        
        //hola
        char carac = 'r';
        String carac2 = "r";
        int posicionLetra= texto.indexOf(carac2);
        System.out.println("La pos de "+carac2+" es "+posicionLetra);
        
        
        //Me llamo claudia y tengo 2 gatos
        //Substring 
        String cadenaCompleta = "Me llamo claudia y tengo 2 gatos";
        //0 .........28
        // 9  //15 
        // [0-8] 0,1,2,3,4,5,6,7,8
        //]0-8[  1,2,3,4,5,6,7
        //[iniciL, final[ inicial.....final-1
        String subCadena=cadenaCompleta.substring(9,cadenaCompleta.length());
        System.out.println("La sub cadena es "+subCadena);
        
        //Replace 
        String textoOriginal= "Claudiaaaaaa hola adios coma gato ";
        String caracViejo= " ";
        String textoCambio= textoOriginal.replaceAll(caracViejo, "");
        System.out.println("lA NUEVA CADENA ES "+textoCambio);
        
        
    }
    
}
