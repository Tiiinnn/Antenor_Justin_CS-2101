public class Dancer extends Artist {
    private String danceStyle;

    public Dancer(String name, int age, String danceStyle) {
        super(name, age, "Dance");
        this.danceStyle = danceStyle;
    }

    public String getDanceStyle() {
        return danceStyle;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Dance Style: " + danceStyle);
    }
}
