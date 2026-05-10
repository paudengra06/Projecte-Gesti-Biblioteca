public class GestorBiblioteca {
   
   //Metodo para ver si el libro que quiere el usuario es disponible
    public void prestarLlibre(Usuari usuari, Llibre llibre) {
        if (!llibre.esPrestat()) {

            llibre.prestar(); // Incrementa numPrestecs del llibre
            usuari.afegirLlibre(llibre); // Incrementa historial de l'usuari
            System.out.println("Préstec realitzat: " + llibre.getTitol() + " a " + usuari.getNom());
        } else {
            
            System.out.println("El llibre ja està prestat.");
        }
    }
}
