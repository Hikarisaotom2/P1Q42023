package clase_16_11_2023;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase_16_11_2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Arreglo normal
        String[] arregloNombres = new String[5];
        // Arreglo 2 dim o matriz            filas columnas 
        System.out.println("Ingrese un valor");
        int tamano = entrada.nextInt();
        //Creando matriz
        String[][] matrizNombres = new String[3][2];

        //Agregando valores a la matriz
        arregloNombres[0] = "Claudia";

        // 1) accediendo al arreglo.
        String[] columnas = matrizNombres[0];
        columnas[0] = "Claudia";
        //2) accediendo utilizando pos fila - columna 
        matrizNombres[0][0] = "Claudia";
        matrizNombres[2][1] = "Patricia";
    }

}
