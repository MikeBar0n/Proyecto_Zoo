
package model.dao;

import model.Especie;

import java.io.*;
import java.util.*;

/**
 *
 * @author Daniel
 */
public class EspecieDAO {
    
    private static final String RUTA = "especies.txt";
    
    public static void guardarEspecies(Set<Especie> especies) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA));
        for (Especie e : especies) {
            bw.write(e.toFileString());
            bw.newLine();
        }
        bw.close();
    }
    
    public static TreeSet<Especie> cargarEspecies() throws IOException {
        TreeSet<Especie> especies = new TreeSet<>();
        File archivo = new File(RUTA);
        if (!archivo.exists()) return especies;

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            especies.add(Especie.fromFileString(linea));
        }
        br.close();
        return especies;
    }
}
