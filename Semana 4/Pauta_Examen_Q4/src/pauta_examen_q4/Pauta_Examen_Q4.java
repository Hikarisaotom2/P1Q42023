/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pauta_examen_q4;

/**
 *
 * @author Clau
 */
public class Pauta_Examen_Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0;
        String historial="";
        if(opcion==1){
            historial+="Entro a la opcion 1, ejercicio de las palabras";
            /*codigo....*/
        }else if(opcion==2){
            historial+="Entro a la opcion 2, respuestas a preguntas";
            /*codigo....*/
        }else if(opcion==3){
            historial+="Entro a la opcion 3, historial del programa";
            /*codigo....*/
            System.out.println("El historial es "+historial );
        }
        /*
        
        1) Ejercicios String:
    Usted deberá leer  una cadena (que puede contener espacios) desde la consola y que tenga un tamaño mayor o igual a 8 caracteres, 
    a. Si la cadena es de tamaño Impar: , usted deberá dividir la cadena en dos partes e imprimir una nueva cadena formada con la mitad final de la palabra  y la mitad inicial de la palabra. 
    Ejemplo:
    cadena ingresada: camisetas
    primera mitad de la cadena: cami 
    segunda mitad de la cadena: setas
    Cadena resultante: setascami

    b. Si la cadena es de tamaño par :  deberá divir la cadena en dos partes e intercalara las letras de cada mitad se paradas por un - .
    Ejemplo: camiseta
    primera mitad de la cadena: cami 
    segunda mitad de la cadena: seta
    Cadena resultante: c-s-a-e-m-t-i-a
        */
        
//        String cadena="camiseta";
//        int mitad = cadena.length()/2;
//        String  primeraMitad = cadena.substring(0,mitad);
//        String mitadFinal = cadena.substring(mitad,cadena.length());
//        System.out.println("primera "+primeraMitad+" segunda "+mitadFinal);
//        /*
//        camiseta tamano:8 , inicial:0, final: tamano-1 = 7
//        cami: tamno 4 , inicial 0, final: 3
//        seta:  tamano 4,  inicial 0 final 3
//        */
//        if(cadena.length()%2==0){//cadena tamano par
//            String nuevaCadena="";
//            for (int i = 0; i < primeraMitad.length(); i++) {
//                nuevaCadena += primeraMitad.charAt(i)+"-";
//                nuevaCadena += mitadFinal.charAt(i)+"-";
//            }
//           System.out.println("Cadena resultante "+nuevaCadena);
//        }else{// cadena tamano impar
//             String nuevaCadena= mitadFinal+primeraMitad;
//            System.out.println("Cadena resultante "+nuevaCadena);
//        }


        /*
        a. Si la cadena es de tamaño Impar:  usted deberá leer una nueva cadena y juntar ambas cadenas además de imprimir el tamaño de la nueva cadena. 
        Ejemplo:
        cadena ingresada: tre
        nueva cadena ingresada: te
        Cadena resultante: treste
        tamaño de la nueva cadena: 5

        b. Si la cadena es de tamaño par :  deberá divir la cadena en dos partes, para la primera mitad de la cadena separara cada caracter por un - y para la segunda mitad de la cadena las separara por /.
        Ejemplo: camiseta
        primera mitad de la cadena: cami 
        segunda mitad de la cadena: seta
        Cadena resultante: c-a-m-i-s/e/t/a
        
*/
        String cadena="camiseta";
        if(cadena.length()%2==0){//par 
            int mitad = cadena.length()/2;
            String nuevaCadena="";
            for (int i = 0; i < cadena.length(); i++) {
                if(i<=mitad){
                    nuevaCadena+=cadena.charAt(i)+"-";
                }else{
                     nuevaCadena+=cadena.charAt(i)+"/";
                }
            }
            System.out.println("Cadena resultante "+nuevaCadena);
             
           /*
            String  primeraMitad = cadena.substring(0,mitad);
              String mitadFinal = cadena.substring(mitad,cadena.length());
            String res="";
            Otra alternativa        
            for (int i = 0; i < primeraMitad.length(); i++) {
                    res+= primeraMitad.charAt(i)+"-";
            }
            for (int i = 0; i < mitadFinal.length(); i++) {
                res+= mitadFinal.charAt(i)+"/";
            }
             System.out.println("El resultado es "+ res);*/
             
        }else{//impar
            String segundaCadena="te";
            String nuevaCadena = cadena+segundaCadena;
            System.out.println("Cadena resultante "+nuevaCadena);
            int tamanoFinal = nuevaCadena.length();
            System.out.println("Tamano de la nueva cadena "+tamanoFinal);
            
        }
        
    }
    
}
