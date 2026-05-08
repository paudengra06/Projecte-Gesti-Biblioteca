import java.util.ArrayList;
import java.util.List;

public class Usuari {
    private String nom;
    private List<Llibre> llibresActuals;
    private List<Llibre> historialPrestecs; // Nova millora: Historial
    private int totalPrestecs; // Per a estadístiques

    public Usuari(String nom) {
        this.nom = nom;
        this.llibresActuals = new ArrayList<>();
        this.historialPrestecs = new ArrayList<>();
        this.totalPrestecs = 0;
    }

    public String getNom() { return nom; }
    public int getTotalPrestecs() { return totalPrestecs; }
    public List<Llibre> getHistorial() { return historialPrestecs; }

    public void afegirLlibre(Llibre llibre) { 
        llibresActuals.add(llibre); 
        historialPrestecs.add(llibre); // S'afegeix a l'historial
        totalPrestecs++;
    }

    public void retornarLlibre(Llibre llibre) { 
        llibresActuals.remove(llibre); 
    }
}