public class Dancer extends Artist {
    private DanceStyle style;

    public Dancer(String name, int age, DanceStyle style) {
        super(name, age, "Dance");
        this.style = style;
    }

    public DanceStyle getStyle() {
        return style;
    }

    public void setStyle(DanceStyle style) {
        this.style = style;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Dance Style: " + style);
    }
}
