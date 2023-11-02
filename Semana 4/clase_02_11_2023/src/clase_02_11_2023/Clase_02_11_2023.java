package clase_02_11_2023;

/**
 *
 * @author Clau
 */
public class Clase_02_11_2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamados/invocaciones
        //nombreMetodo(....);
        
        //Argumentos
        ImprimirMensaje("Claudia");
        String valor = "Pedro";
        ImprimirMensaje(valor);
        ImprimirMensaje("Lineth");
        
        ImprimirMensaje("Hola mundo");
    }//Main
    
    
    //parametros
    public static void ImprimirMensaje(String mensaje){
        System.out.println("Hola , "+mensaje);
    }//Fin del metodo imprimir

}//Clase
