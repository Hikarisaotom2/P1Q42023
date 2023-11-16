/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase15_11_2023;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase15_11_2023 {

    //Variables globales
    static int cont = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Adm lista estudiantes (CRUD)
        1) crear lista de estudiantes (max 30)
        2)Agregar estudiantes .
        3) listar estudiantes.
        4) actualizar
        5) eliminar un estudiante*/
        //1 crear lista de estudiantes.
        System.out.println("1) creando lista");
        String[] listaAlumnos = crearLista();
        listarAlumnos(listaAlumnos);
        
        //2)Agregar estudiantes .
        System.out.println("2) Agregabdo alumno");
        listaAlumnos = agregarAlumno("123456- Claudia Cortés", listaAlumnos);
        listaAlumnos = agregarAlumno("6789-Patricia Pavon", listaAlumnos);
        listaAlumnos = agregarAlumno("85050-Juan Perez", listaAlumnos);
        listarAlumnos(listaAlumnos);        
        //3) listar estudiantes.
        System.out.println("3) listar");
        listarAlumnos(listaAlumnos);
        // 4) actualizar
        System.out.println("4) actualizar lista");
        int tamano = listaAlumnos.length;
        int pos = leerPosArreglo(tamano);
        listaAlumnos = actualizarEstudiante(pos, "VALOR MODIFICADO", listaAlumnos);
        listarAlumnos(listaAlumnos);
        //5) eliminar un estudiante
        System.out.println("5) eliminar alumno ");
        int posEliminar = leerPosArreglo(tamano);
        listaAlumnos = eliminarEstudiante(posEliminar, listaAlumnos);
        listarAlumnos(listaAlumnos);
   

    }

    public static String[] agregarAlumno(String valor, String[] lista) {
        if (cont < 30) {
            lista[cont] = valor;
            cont++;
        } else {
            System.out.println("Ya no se pueden agregar alumnos");
        }
        return lista;
    }

    public static int leerPosArreglo(int tamano) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una pos : ");
        int pos = entrada.nextInt();
        while (pos < 0 || pos >= tamano) {
            System.out.println("Ingrese una pos : ");
            entrada.nextInt();
        }
        return pos;
    }

    public static String[] crearLista() {
        String[] lista = new String[30];
        return lista;
    }

    public static String[] actualizarEstudiante(int pos, String valor, String[] lista) {
        lista[pos] = valor;
        return lista;
    }

    public static void listarAlumnos(String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(i + ") " + lista[i]);
        }
    }

    public static String[] eliminarEstudiante(int pos, String[] lista) {
        lista[pos] = "";
        return lista;
    }
}
