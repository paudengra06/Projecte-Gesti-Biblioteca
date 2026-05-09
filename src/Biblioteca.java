import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Llibre> llibres;
    private List<Usuari> usuaris; // Necessari per estadístiques d'usuaris

    public Biblioteca() {
        this.llibres = new ArrayList<>();
        this.usuaris = new ArrayList<>();
    }

    public void afegirLlibre(Llibre llibre) { 
        llibres.add(llibre); 
    }

    public void registrarUsuari(Usuari usuari) { 
        usuaris.add(usuari); 
    }
    
    // Metodo para la gestion de categorias 
    public List<Llibre> filtrarPerCategoria(String cat) {
        List<Llibre> resultats = new ArrayList<>();
       
        for (Llibre l : llibres) {

            if (l.getCategoria().equalsIgnoreCase(cat)) resultats.add(l);
        }
        return resultats;
    }

    // Metodo para saber el libro mas prestado
    public Llibre llibreMesPrestat() {
        if (llibres.isEmpty()) return null;
        Llibre top = llibres.get(0);
        for (Llibre l : llibres) {
            if (l.getNumPrestecs() > top.getNumPrestecs()) top = l;
        }
        return top;
    }

    // Metodo para saber el usuario mas activo
    public Usuari lectorMesActiu() {
        if (usuaris.isEmpty()) return null;
        Usuari top = usuaris.get(0);
        for (Usuari u : usuaris) {
            if (u.getTotalPrestecs() > top.getTotalPrestecs()) top = u;
        }
        return top;
    }

    public List<Llibre> getLlibres() { return llibres; }
}