import java.util.ArrayList;
import java.util.List;

public class Usuari {
    private String nom;
    private List<Llibre> llibresActuals;
    private List<Llibre> historialPrestecs; //Historial de todos los libros
    private int totalPrestecs; // Este sera el contador PAU

    public Usuari(String nom) {
        this.nom = nom;
        this.llibresActuals = new ArrayList<>();
        this.historialPrestecs = new ArrayList<>();
        this.totalPrestecs = 0;
    }

    public String getNom() { 
        return nom; 
    }
    public int getTotalPrestecs() { 
        return totalPrestecs; 
    }
    public List<Llibre> getHistorial() { 
        return historialPrestecs; 
    }

    public void afegirLlibre(Llibre llibre) { 
        llibresActuals.add(llibre); 
        historialPrestecs.add(llibre); // S'afegeix a l'historial
        totalPrestecs++;
    }

    public void retornarLlibre(Llibre llibre) { 
        llibresActuals.remove(llibre); 
    }
<<<<<<< HEAD

}
=======
public class Usuari {
private String nom;
private List<Llibre> llibresPrestats;
public Usuari(String nom) {
this.nom = nom;
this.llibresPrestats = new ArrayList<>();
}
public String getNom() { return nom; }
public List<Llibre> getLlibresPrestats() { return llibresPrestats; }
public void afegirLlibre(Llibre llibre) { llibresPrestats.add(llibre); }
public void retornarLlibre(Llibre llibre) { llibresPrestats.remove(llibre); }
}
>>>>>>> 9891c9e8eaa93465f02cc47084c4deca3812ac8e
