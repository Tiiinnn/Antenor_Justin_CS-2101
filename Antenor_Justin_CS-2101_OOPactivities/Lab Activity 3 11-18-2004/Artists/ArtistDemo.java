public class ArtistDemo {
    public static void main(String[] args) {
        // Instance of Artist
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        artist.displayInfo();
        System.out.println();

        // Instance of Singer
        Singer singer = new Singer("Nayeon Im", 29, "POP");
        singer.displayInfo();
        System.out.println();

        // Instance of Dancer
        Dancer dancer = new Dancer("Misty Copeland", 41, "BALLET");
        dancer.displayInfo();
        System.out.println();

        // Instance of Painter
        Painter painter = new Painter("Leonardo da Vinci", 67, "OIL");
        painter.displayInfo();
        System.out.println();

        // Instance of Writer
        Writer writer = new Writer("William Shakespeare", 52, "DRAMA");
        writer.displayInfo();
    }
}
