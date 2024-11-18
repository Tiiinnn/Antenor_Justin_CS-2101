public class Main {
    public static void main(String[] args) {
        // Instance of Artist
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        artist.displayInfo();

        System.out.println();

        // Instance of Singer
        Singer singer = new Singer("Nayeon Im", 29, Genre.POP);
        singer.displayInfo();

        System.out.println();

        // Instance of Painter
        Painter painter = new Painter("Leonardo da Vinci", 67, Medium.OIL);
        painter.displayInfo();

        System.out.println();

        // Instance of Writer
        Writer writer = new Writer("William Shakespeare", 52, WritingStyle.DRAMA);
        writer.displayInfo();

        System.out.println();

        // Instance of Dancer
        Dancer dancer = new Dancer("Misty Copeland", 41, DanceStyle.BALLET);
        dancer.displayInfo();
    }
}
