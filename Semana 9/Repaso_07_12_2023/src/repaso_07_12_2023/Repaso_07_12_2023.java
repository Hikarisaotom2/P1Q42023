package repaso_07_12_2023;

import java.util.ArrayList;

public class Repaso_07_12_2023 {

    public static void main(String[] args) {
        /*Recorrer un arraylist recursivamente*/
//        ArrayList<String> lista = new ArrayList<String>();
//        for (int i = 0; i < lista.size(); i++) {
//                    int x = 0;
//        System.out.println(lista.get(i));
//        x++;
//        }
            ArrayList<String> lista = new ArrayList<String>();
            lista.add("Hola");
            lista.add("Adios");
            lista.add("Buenos dias");
//            for (int i = 0; i < lista.size(); i++) {
//        }
            System.out.println("IMPRESIÓN NORMAL");
            imprimir(lista,0,"");
            


        System.out.println("IMPRESIÓN 2");
            imprimir2(lista,lista.size()-1,"");
            //            for (int i = lista.size()-1; i >0; i--) { 
//        }
    }
    
    public static void imprimir (ArrayList<String> lista,int cont, String acum){
        if(cont==lista.size()){
            System.out.println("EL ACUMULADOR FUE: "+ acum);
            return;
        }else{
           System.out.println(cont+") "+lista.get(cont));
           acum+=lista.get(cont)+" ";
          imprimir(lista,cont+1,acum);
        }   
    }
    
      public static void imprimir2 (ArrayList<String> lista,int cont, String acum){
        if(cont<0){
              System.out.println("EL ACUMULADOR FUE: "+ acum);
            return;
        }else{
          System.out.println(cont+") "+lista.get(cont));
          acum+=lista.get(cont)+" ";
          imprimir2(lista,cont-1,acum);
        }   
    }
}
