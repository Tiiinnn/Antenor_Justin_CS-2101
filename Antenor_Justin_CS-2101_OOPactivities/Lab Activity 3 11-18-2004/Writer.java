public class Writer extends Artist {
    private WritingStyle style;

    public Writer(String name, int age, WritingStyle style) {
        super(name, age, "Writing");
        this.style = style;
    }

    public WritingStyle getStyle() {
        return style;
    }

    public void setStyle(WritingStyle style) {
        this.style = style;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Writing Style: " + style);
    }
}
