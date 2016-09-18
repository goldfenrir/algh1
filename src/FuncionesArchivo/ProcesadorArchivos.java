/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesArchivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Luis
 */
public class ProcesadorArchivos {

    public static void leerArchivo(String nombreArchivo) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));

        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            String[] arr = everything.split("\t|-|\n");
//            for(int i=0;i<arr.length;i++)
//                arr[i].split("");
//                System.out.println(arr);
            for (String ss : arr) {
                System.out.println(ss);
            }
//            System.out.println(everything);
//            System.out.println("======================");
//mail.qtcteam.com/zimbra/
        } finally {
            br.close();
        }
    }

}
