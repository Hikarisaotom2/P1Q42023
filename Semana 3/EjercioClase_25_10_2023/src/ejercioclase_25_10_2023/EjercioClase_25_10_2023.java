package ejercioclase_25_10_2023;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class EjercioClase_25_10_2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //char a int
        char caracter = 'p';
        int codigoAsccii = caracter;
        System.out.println("");
        char nuevoCaracter = 90;
        System.out.println("El caracter es " + caracter + " su codigo ascii es " + codigoAsccii);
        System.out.println("El nuevo caracter es  " + nuevoCaracter);

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un caracter ");
        char lecturaCaracter = entrada.next().charAt(0);//lectura de un char
        switch (lecturaCaracter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
               System.out.println("Es una vocal");
            break;   
            default:
                System.out.println("No es una vocal");
        }

        System.out.println("Ingrese una cadena con el formato #L#L#L…: ");
        String texto = entrada.next();
        int cont = 0;
        int ultimaPos = texto.length() - 1;
        String resultado = "";
        while (cont <= ultimaPos) {
            char carac = texto.charAt(cont);
            char letraARepetir = texto.charAt(cont + 1);
            // Convertir de un string a un numero; 
            //Casteo                    //Convertir de strings a numeros
            int cantidadVecesRepetir = Integer.parseInt(carac + "");
            int contRepetir = 0;
            while (contRepetir < cantidadVecesRepetir) {
                resultado += letraARepetir;//concatenación
                contRepetir++;
            }
            cont += 2;
        }
        System.out.println("El resultado es: " + resultado);

        //strings a int 
        //Integer.ParseInt();
        // x tipo de dato a String 
        //valor+"";
    }

}
