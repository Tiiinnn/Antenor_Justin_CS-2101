public class Painter extends Artist {
    private Medium medium;

    public Painter(String name, int age, Medium medium) {
        super(name, age, "Painting");
        this.medium = medium;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Medium: " + medium);
    }
}
