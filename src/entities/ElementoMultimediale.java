package entities;

public abstract class ElementoMultimediale {

    // ATTRIBUTI
    private String title;

    // COSTRUTTORE
    public ElementoMultimediale(String title) {
        this.title = title;
    }

    // GETTER

    public String getTitle() {
        return title;
    }
}
