package entities;

public abstract class ElementoMultimediale {

    // ATTRIBUTI
    private String titolo;

    // COSTRUTTORE
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    // GETTER

    public String getTitolo() {
        return titolo;
    }

    // SETTER

    public String setTitolo(String nuovoTitolo) {
        this.titolo = nuovoTitolo;
        return this.titolo;
    }

}
