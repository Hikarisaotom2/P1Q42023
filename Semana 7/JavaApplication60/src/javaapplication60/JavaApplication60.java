package javaapplication60;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class JavaApplication60 {

    public static void main(String[] args) {
        /*Laberinto
        1) Crear un tablero de 3x3 LISTO
        2) Ver el tablero  LISTO 
        3)El juego terminal cuando llegamos al final del laberinto.
        4) Deben aparecer obstaculos (*) 
        5) Nos podemos mover dentro del tablero
         */
        while (true) {
            String[][] tablero = crearTablero();
            imprimirTablero(tablero);
            int[] arreglo = {0, 0};
            tablero = moverse(tablero, arreglo);
            imprimirTablero(tablero);
        }

    }

    public static String[][] crearTablero() {
        String[][] tablero = new String[3][3];
        for (int i = 0; i < tablero.length; i++) { //Filas
            for (int j = 0; j < tablero[i].length; j++) { //Columnas
                tablero[i][j] = " ";
            }
        }
        return tablero;
    }

    public static void imprimirTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) { //Filas
            for (int j = 0; j < tablero[i].length; j++) { //Columnas
                System.out.print("[" + tablero[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("\n");
    }

    public static String[][] moverse(String[][] tablero, int[] posiciones) {
        int fila = posiciones[0];
        int columna = posiciones[1];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].equals("X")) {
                    tablero[i][j] = " ";
                }
            }
        }
        tablero[fila][columna] = "X";
        return tablero;
    }

    public static int[] leerPosMatriz(int tamano) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las posiciones de la matriz, ejemplo (fila, columna): 0,0");
        String valores = entrada.next();
        String[] pos = valores.split(",");
        while (pos.length != 2) {
            System.out.println("Debe ingresar dos valores");
            System.out.println("Ingrese las posiciones de la matriz, ejemplo (fila, columna): 0,0");
            valores = entrada.next();
            pos = valores.split(",");
        }
        int [] posicionesFinales = new int [pos.length];
        for (int i = 0; i < pos.length; i++) {
            posicionesFinales[i] = Integer.parseInt(pos[i]);
        }
        // 0..... tamano-1
        //Otra forma de validar 
//        boolean esInvalido =false;
//        for (int i = 0; i < posicionesFinales.length; i++) {
//            if(posicionesFinales[i]<0 || posicionesFinales[i]>=tamano){
//                esInvalido= true;
//            }
//        }
        while(posicionesFinales[0]<0 || posicionesFinales[0]>=tamano ||
                posicionesFinales[1]<0 || posicionesFinales[1]>=tamano){
            
        }
    }
}
