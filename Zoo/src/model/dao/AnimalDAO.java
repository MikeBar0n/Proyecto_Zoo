
package model.dao;

import model.Animal;

import java.io.*;
import java.util.*;

/**
 *
 * @author Daniel
 */

public class AnimalDAO {
    
    private static final String RUTA = "animales.txt";
    
    public static void guardarAnimales(Collection<Animal> animales) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA));
        for (Animal a : animales) {
            bw.write(a.toFileString());
            bw.newLine();
        }
        bw.close();
    }
    
    public static HashMap<String, Animal> cargarAnimales() throws IOException {
        HashMap<String, Animal> mapa = new HashMap<>();
        File archivo = new File(RUTA);
        if (!archivo.exists()) return mapa;

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            Animal a = Animal.fromFileString(linea);
            mapa.put(a.getId(), a);
        }
        br.close();
        return mapa;
    }
    
}
