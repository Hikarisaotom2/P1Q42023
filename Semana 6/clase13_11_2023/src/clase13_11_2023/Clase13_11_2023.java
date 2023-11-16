package clase13_11_2023;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase13_11_2023 {

    public static void main(String[] args) {
        String[] valores = crearArregloStrings();
        imprimirArregloStrings(valores);
        convertir(valores);
        int tamano = leerNumeroValidado();
        System.out.println("Se crea el arreglo....");
        int[] arreglo = crearArreglo(tamano);
        System.out.println("Agregando valores al arreglo....");
        arreglo = llenarArreglo(arreglo);
        System.out.println("Imprimiendo el arreglo....");
        imprimirArreglo(arreglo);
        System.out.println("Actualizando el arreglo....");
        int tamanoArreglo = arreglo.length;
        int pos = leerPosArreglo(tamanoArreglo);
        int valorAModificar = leerNumeroValidado();
        arreglo = ActualizarPos(pos, valorAModificar, arreglo);
        System.out.println("Imprimiendo el arreglo actualizado....");
        imprimirArreglo(arreglo);

    }

    public static void convertir(String[] valores) {
        for (int i = 0; i < valores.length; i++) {
            // Valores contiene strings 
            //NO HAY MANERA DIRECTA DE CONVERTIR DE STRING A ASCII
            //solo podemos convertir de enteros y caracteres a ascii
            // convertir de string => numero(int)
            int numero = Integer.parseInt(valores[i]);
            // convertir de numero(int) => ascii/char
            char caracter = (char) numero;
            //Lllegar al codigo ascii
            System.out.println(numero + " => " + caracter);
        }
    }

    public static void imprimirArregloStrings(String[] valores) {
        System.out.println("el tamano era " + valores.length);
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }

    public static String[] crearArregloStrings() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una lista de numeros separadas por , ");
        String cadena = entrada.next();
        String[] valores = cadena.split(",");
        return valores;
    }

    //0.... tamano-1
    public static int leerPosArreglo(int tamanoArreglo) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una pos del arreglo:");
        int tamano = entrada.nextInt();
        //0.... ult (tamanoArreglo-1)
        while (tamano < 0 || tamano >= tamanoArreglo) {
            System.out.println("Ingrese una pos del arreglo:");
            tamano = entrada.nextInt();
        }
        return tamano;
    }

    public static int leerNumeroValidado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número ");
        int tamano = entrada.nextInt();
        while (tamano <= 0) {
            System.out.println("Ingrese un número valido ");
            tamano = entrada.nextInt();
        }
        return tamano;
    }

    public static int[] crearArreglo(int tamano) {
        int[] arreglo = new int[tamano];
        return arreglo;
    }

    public static int[] llenarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = leerNumeroValidado();
        }
        return arreglo;
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + i + "] " + arreglo[i]);
        }
    }

    public static int[] ActualizarPos(int pos, int valorActualizar, int[] arreglo) {
        arreglo[pos] = valorActualizar;
        return arreglo;
    }

}
