package clase07_11_2023;

import java.util.Scanner;

/**
 * @author Clau
 */
public class Clase07_11_2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String mensaje = entrada.nextLine();

        PascalCase(mensaje, 1);
        String miCadena = "hola mundo";
        PascalCase(miCadena, 1);
        String resp = EjercicioPalabras("hola");
        String resp2 = EjercicioPalabras("tre");
        System.out.println("La respuesta es " + resp);
        System.out.println("La respuesta es " + resp2);
        ejemplo(mensaje);
        int numero = leerNumeroValidado();
        int numero2 = leerNumeroValidado();
        
        int suma=Calculadora(numero,numero2,"+");
        int resta=Calculadora(numero,numero2,"-");
        int multi=Calculadora(numero,numero2,"*");
        int div=Calculadora(numero,numero2,"/");
        
        System.out.println("Suma "+suma);
        System.out.println("Resta "+resta);
        System.out.println("multi "+multi);
        System.out.println("Divi "+div);
        
        
       
    }
    
    public static int leerNumeroValidado(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = entrada.nextInt();
        while (numero<=0) {
            System.out.println("Ingrese un número mayor a 0 ");
            numero = entrada.nextInt();
        }
        return numero;
    }

    public static void ejemplo(String mensaje) {
        System.out.println(mensaje);
    }
    //parametros
    public static void PascalCase(String cadena, int numero) {
        for (int i = 0; i < numero; i++) {
            System.out.println(cadena);
        }
    }

    public static String EjercicioPalabras(String cadena) {
        System.out.println("Entro al metodo");
        if (cadena.length() % 2 == 0) {//par 
            int mitad = cadena.length() / 2;
            String nuevaCadena = "";
            for (int i = 0; i < cadena.length(); i++) {
                if (i <= mitad) {
                    nuevaCadena += cadena.charAt(i) + "-";
                } else {
                    nuevaCadena += cadena.charAt(i) + "/";
                }
            }
            //Despues del for, ya tengo el resultado que quiero nuevaCadena
            return nuevaCadena;

        } else {//impar
            String segundaCadena = "te";
            String nuevaCadena = cadena + segundaCadena;
//            int tamanoFinal = nuevaCadena.length();
            return nuevaCadena;
        }
    }

    public static int Calculadora(int numero1, int numero2, String operacion) {
        int resultado = 0;
        switch (operacion) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operacion no valida");
        }
        return resultado;
    }
}
