public class Singer extends Artist {
    private String genre;

    // Constructor
    public Singer(String name, int age, String genre) {
        super(name, age, "Music");
        this.genre = genre;
    }

    // Getter
    public String getGenre() {
        return genre;
    }

    // Display method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}
