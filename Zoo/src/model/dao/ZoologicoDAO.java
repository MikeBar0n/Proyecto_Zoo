package model.dao;

import model.Zoologico;

import java.io.*;
import java.util.*;

/**
 *
 * @author Daniel
 */
public class ZoologicoDAO {
    
    private static final String RUTA = "zoologicos.txt";
    
    public static void guardarZoologicos(Collection<Zoologico> lista) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA));
        for (Zoologico zoo : lista) {
            bw.write(zoo.toFileString());
            bw.newLine();
        }
        bw.close();
    }
    
    public static HashMap<String, Zoologico> cargarZoologicos() throws IOException {
        HashMap<String, Zoologico> mapa = new HashMap<>();
        File archivo = new File(RUTA);
        if (!archivo.exists()) return mapa;

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            Zoologico zoo = Zoologico.fromFileString(linea);
            mapa.put(zoo.getNombre(), zoo);
        }
        br.close();
        return mapa;
    }
    
}
