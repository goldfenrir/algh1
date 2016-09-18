/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coloniadehormigas;
import FuncionesArchivo.ProcesadorArchivos;
import java.io.IOException;
/**
 *
 * @author Luis
 */
public class ColoniaDeHormigas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ProcesadorArchivos.leerArchivo("aeropuertos.txt");
        ProcesadorArchivos.leerArchivo("planVuelo.txt");
    }
    
}
