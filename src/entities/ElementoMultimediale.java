package entities;

public abstract class ElementoMultimediale {

    // ATTRIBUTI
    private String titolo;
    private String tipo;

    // COSTRUTTORE
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    // GETTER

    public String getTitolo() {
        return titolo;
    }
}
