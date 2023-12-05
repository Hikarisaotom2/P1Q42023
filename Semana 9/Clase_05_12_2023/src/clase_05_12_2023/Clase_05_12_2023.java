
package clase_05_12_2023;

/**
 * @author Clau
 */
public class Clase_05_12_2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Exponenciación entera XXXX.
        Recorrer los elementos de una lista.
        Bonus: Búsqueda binaria 

        */
    }
    public static int expo(int numero, int exp){
//        int acum = 0;
//        for (int i = 1; i <= exp; i++) {
//            acum *= numero;
//        }

//        for (int i = exp; i >=1; i--) {
//            
//        }
     if(exp ==0){
         return 1;
     }else{
         return numero* expo(numero,exp-1);
     }
        
    }
    public static int factorial( int numero){
      if(numero==1||numero==0){
            return 1 ;
        }else{
            return numero*factorial(numero-1);
       }
    }

}
