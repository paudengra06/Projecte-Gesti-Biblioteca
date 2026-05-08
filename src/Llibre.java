public class Llibre {
    private String titol;
    private String autor;
    private String categoria; // Nova millora
    private boolean prestat;
    private int numPrestecs; // Per a estadístiques

    public Llibre(String titol, String autor, String categoria) {
        this.titol = titol;
        this.autor = autor; 
        this.categoria = categoria;
        this.prestat = false;
        this.numPrestecs = 0;
    }

    public String getTitol() { return titol; }
    public String getCategoria() { return categoria; }
    public int getNumPrestecs() { return numPrestecs; }

    public void prestar() { 
        this.prestat = true; 
        this.numPrestecs++; // Incrementar historial global del llibre
    }
    public void retornar() { this.prestat = false; }
    public boolean esPrestat() { return prestat; }

    @Override
    public String toString() {
        return titol + " (" + categoria + ") de " + autor + (prestat ? " (En préstec)" : " (Disponible)");
    }
}