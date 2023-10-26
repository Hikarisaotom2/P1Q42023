package clase16_02_2023;

import java.util.Scanner;
/**
 *
 * @author Clau
 */
public class Clase16_02_2023 {

    public static void main(String[] args) {
        /**
         * ******************************LECTURA DE
         * DATOS*******************************
         */
        Scanner entrada = new Scanner(System.in);
        int edad = 18;
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        System.out.println("La edad es: " + edad);

        /**
         * ******************************DECISIONES*******************************
         */
        //1) if, solamente evalua el caso verdadero 
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        }//fin del if 

        //1) if else, evalua el caso verdadero/falso
        if (edad >= 18) { //True  valores entre: 18...positivo infinito
            if (edad <= 150) { //Este if esta anidado
                System.out.println("Usted es mayor de edad");
            } else {
                System.out.println("Edad invalida");
            }
        } else { //False  valores entre: neg infinito ...17  
            if (edad >= 0) {
                System.out.println("Usted es menor de edad");
            } else {
                System.out.println("Edad invalida");
            }// fin else 
        }//fin else 

        //3) else if, permite definir mas de un caso, solo ejecutará un caso (el primero que de verdadero)
        int nota;
        System.out.println("Ingrese una nota");
        nota = entrada.nextInt();
        if (nota >= 0 && nota <= 59) {// True con valores entre 0 y 59
            System.out.println("REP");
        } else if (nota >= 60 && nota <= 69) {// True con valores entre 60 y 69
            System.out.println("APB");
        } else if (nota >= 70 && nota <= 79) {// True con valores entre 70 y 79
            System.out.println("BUENO");
        } else if (nota >= 80 && nota <= 89) {// True con valores entre 80 y 89
            System.out.println("MUY BIEN");
        } else if (nota >= 90 && nota <= 100) {// True con valores entre 90 y 100
            System.out.println("EXC");
        } else { // False , entramos aqui por defecto cuando ninguno de los casos anteriores fue verdadero
            System.out.println("Valor invalido");
        }

        /**
         * ******************************CICLOS/LOOPS/BUCLES*******************************
         */
        //1) While: Valida antes de ejecutar, puede no ejecutarse dependiendo de la condición inicial.
        int continuar = 1;
        int acumulador = 0;
        int contador = 0;
        while (continuar == 1) {
            System.out.println("1) calcular la edad");
            System.out.println("2) calcular  notas ");
            System.out.println("Ingrese que opción desea ejecutar: ");
            int opcion = entrada.nextInt();
            contador++; //Aumenta en 1 la variable, es equivalente a contador+=1; y a contador=contador+1;
            if (opcion == 1) {
                int edad2 = 0;//esta variable solo existe dentro de las llaves de este if.
                System.out.println("Ingrese la edad....");
            } else if (opcion == 2) {
                acumulador += 10; // esta instrucción es equivalente a  acumulador = acumulador+10;
                int notas2 = 0; //esta variable solo existe dentro de las llaves de este el else if
                System.out.println("Ingrese la nota");
            } else {
                System.out.println("Opcion no valida");
            }
            System.out.println("Desea continuar? 1 = si, 0= no ");
            continuar = entrada.nextInt();
            if (continuar == 1) {
                System.out.println("Continuando....");
            } else {
                System.out.println("Que le vaya bien ");
            }
        }//fin del while 

        //2) Do while, se ejecuta al menos una vez. 
        do {
            System.out.println("Menu");
            System.out.println("opcion 1....");
            System.out.println("Opcion 2....");
            System.out.println("Desea continuar");
        } while (continuar == 1);

        //Validaciones 
        int divisor = 0;
        while (divisor == 0) {
            System.out.println("Ingrese un divisor");
            divisor = entrada.nextInt();
        }
        //Despue de esta linea sabemos que el valor esta validado gracias al while.
        System.out.println("Ejecutando instruccion seguramente ");
        System.out.println("la division es " + 5 / divisor);

        // BREAK/ CONTINUE
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una opcion");
            System.out.println("1) detener el ciclo con break");
            System.out.println("2) reiniciar el ciclo con continue");
            System.out.println("3) detener el ciclo cambiando la bandera");
            System.out.println("4) continuar normalmente");
            int op = entrada.nextInt();
            if (op == 1) {
                break;
            } else if (op == 2) {
                continue;
            } else if (op == 3) {
                bandera = false;
            } else {
                System.out.println("Continuando normalmente");
            }
            System.out.println("Esta linea esta fuera del if");
        }
        
    }// fin del main 
}// fin de la clase
