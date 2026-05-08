import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Inicialització del sistema
        Biblioteca biblioteca = new Biblioteca();
        GestorBiblioteca gestor = new GestorBiblioteca();

        // 2. Creació de llibres amb categories
        Llibre llibre1 = new Llibre("1984", "George Orwell", "Novel·la");
        Llibre llibre2 = new Llibre("El petit príncep", "Antoine de Saint-Exupéry", "Historia");
        Llibre llibre3 = new Llibre("Breu història del temps", "Stephen Hawking", "Ciència");
        
        biblioteca.afegirLlibre(llibre1);
        biblioteca.afegirLlibre(llibre2);
        biblioteca.afegirLlibre(llibre3);

        // 3. Creació i registre d'usuaris
        Usuari usuari1 = new Usuari("Carla");
        Usuari usuari2 = new Usuari("Joan");
        biblioteca.registrarUsuari(usuari1);
        biblioteca.registrarUsuari(usuari2);

        // 4. Simulació de préstecs
        System.out.println("--- Gestió de Préstecs ---");
        gestor.prestarLlibre(usuari1, llibre1); 
        gestor.prestarLlibre(usuari2, llibre1); // Intent de préstec (ja prestat)
        gestor.prestarLlibre(usuari1, llibre3); // Carla agafa Ciència

        // 5. Millora: Consultar historial d'un lector 
        System.out.println("\n--- Historial de la " + usuari1.getNom() + " ---");
        for (Llibre l : usuari1.getHistorial()) {
            System.out.println("- " + l.getTitol() + " [" + l.getCategoria() + "]");
        }

        // 6. Millora: Filtrar per categoria 
        System.out.println("\n--- Llibres de la categoria 'Ciència' ---");
        List<Llibre> ciencia = biblioteca.filtrarPerCategoria("Ciència");
        for (Llibre l : ciencia) {
            System.out.println("- " + l.getTitol());
        }

        // 7. Millora: Informes estadístics 
        System.out.println("\n--- informes Estadístics ---");
        
        Llibre topLlibre = biblioteca.llibreMesPrestat();
        if (topLlibre != null) {
            System.out.println("Llibre més prestat: " + topLlibre.getTitol() + 
                               " (" + topLlibre.getNumPrestecs() + " vegades)");
        }

        Usuari topUsuari = biblioteca.lectorMesActiu();
        if (topUsuari != null) {
            System.out.println("Lector més actiu: " + topUsuari.getNom() + 
                               " (" + topUsuari.getTotalPrestecs() + " préstecs)");
        }
    }
}