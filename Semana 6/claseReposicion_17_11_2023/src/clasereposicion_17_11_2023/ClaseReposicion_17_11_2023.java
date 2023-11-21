package clasereposicion_17_11_2023;

/**
 *
 * @author Clau
 */
public class ClaseReposicion_17_11_2023 {
    public static void main(String[] args) {
        
        //Matriz cuadrada 
        int tamano = 5;
        String [] [] matrizCuadrada =  new String [tamano][tamano];
        for (int i = 0; i <matrizCuadrada .length ; i++) { //Filas 
            for (int j = 0; j < matrizCuadrada .length; j++) { //Columnas
                System.out.print(matrizCuadrada[i][j]);
            }
            System.out.println("");
        }
                
        //Matriz no cuadrada
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
        
        /*
        3 distintas formas de leer filas y columnas desde la consola
        sout
        int fila = entrada.nextInt();
        sout
        int columna  = entrada.nextInt();
        
        sout ingrese las cordenadas separadas por , ejemplo: 5,3 
        string coordenadasLectura = entrada.next();
        int [] coordenadas = coordenadasLectura.split(,);
        
        sout ingrese la fila y la columna 3A 6B
        string coordenada = entrada.next();
        char final = coordenada.charAt(tamano-1);
        String fila = coordenada.substring(tamano-1);
        switch 
        case 'A'
         columna = 0
        */
        //Creando la matriz. 
        String [] prueba =new String [2];
        System.out.println("Pos del arreglo");
//        System.out.println(prueba[3]);
        System.out.println("Pos de la matriz");
        String [] [] estudiantes = new String [2][2];
        // pos validas filas : 0 -3
        // pos validas columnas: 0 -3
        //Agregando valores a la matriz
        for (int i = 0; i < 4; i++) { // Filas 
            for (int j = 0; j < 4; j++) { //Columnas
                estudiantes[i][j] = "*";
                /*
                int x;
                x=0;
                sout(x);
                */
            }
        }
        // Imprimiendo la matriz
         for (int i = 0; i < 4; i++) { // Filas 
            for (int j = 0; j < 4; j++) { //Columnas
                System.out.print(" "+estudiantes[i][j]+" ");
            }
             System.out.println("");
        }
 
    }
    
}
