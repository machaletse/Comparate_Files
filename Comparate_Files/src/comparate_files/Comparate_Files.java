/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparate_files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isamach
 */
public class Comparate_Files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
             BufferedReader br1 = null;
            BufferedReader br2 = null;
            String filename = "volantes_tramite.txt";
            String filename2 = "volantes_firmados.txt";
            String sCurrentLine;
            List<String> list1 = new ArrayList<String>();
            List<String> list2 = new ArrayList<String>();
            
                        int cont =0; // Contador de numeros
              // Primera forma de declarar una variable de tipo BufferedReader
//            br1 = new BufferedReader(new FileReader("volantes_tramite.txt"));
//            br2 = new BufferedReader(new FileReader("volantes_firmados.txt"));

                        
          // Primera forma de declarar una variable de tipo BufferedReader      
            br1 = new BufferedReader(new FileReader(filename));
            br2 = new BufferedReader(new FileReader(filename2));
            
            //Lo que tenga el file 1 va ser igual a sCurrentLine
            while ((sCurrentLine = br1.readLine()) != null) {
                list1.add(sCurrentLine);
            }
            
           // Lo que tenga el file 2 va ser igual a sCurrentLine
            while ((sCurrentLine = br2.readLine()) != null) {
                list2.add(sCurrentLine);
            }
            
            //Se declara un ArrayList tipo Strinng  que va ser igual a la list1
            List<String> tmpList = new ArrayList<String>(list1);
            tmpList.removeAll(list2);//Con el metodo removeAll se va a eliminar todo lo que contenga list2 en la list1
            System.out.println("content from volantes_tramite.txtt which is not there in volantes_firmados.txt");
            
            for(int i=0;i<tmpList.size();i++){
                cont++;
                System.out.println(tmpList.get(i)); //content from test.txt which is not there in test2.txt
                 //content from test.txt which is not there in test2.txt
            }
            System.out.println("Total de numeros faltantes: "+cont);
            System.out.println("content from test2.txt which is not there in test.txt");

//            tmpList = list2;
//            tmpList.removeAll(list1);
//            for(int i=0;i<tmpList.size();i++){
//                
//                System.out.println(tmpList.get(i)); //content from test2.txt which is not there in test.txt
           
//            }

    }
    
}
