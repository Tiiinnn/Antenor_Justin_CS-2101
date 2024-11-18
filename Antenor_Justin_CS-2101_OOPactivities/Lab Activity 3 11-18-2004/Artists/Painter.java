public class Painter extends Artist {
    private String medium;

    public Painter(String name, int age, String medium) {
        super(name, age, "Painting");
        this.medium = medium;
    }

    public String getMedium() {
        return medium;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Medium: " + medium);
    }
}
