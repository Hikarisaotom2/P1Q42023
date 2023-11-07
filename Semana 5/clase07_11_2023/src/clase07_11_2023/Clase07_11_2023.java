package clase07_11_2023;

/**
 * @author Clau
 */
public class Clase07_11_2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamados 
        //Argumentos
        PascalCase("Hola", 5);
        String miCadena = "hola mundo";
        PascalCase(miCadena, 9);
        // String cadenaScanner = entrada.nextLine();
        //PascalCase(cadenaScanner,7);
        EjercicioPalabras("Camiseta");
        EjercicioPalabras("Camisetas");
    }

    //parametros
    public static void PascalCase(String cadena, int numero) {
        for (int i = 0; i < numero; i++) {
            System.out.println(cadena);
        }
    }

    public static String EjercicioPalabras(String cadena) {
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

}
