public class seven {
    public static void main(String[] args) {
        
        int limit = 10;
        int multiplier = 7;
        
        for (int i = 1; i <= limit; i++) {
            int multiple = i * multiplier;
            
            if (i % 2 == 0) {
                System.out.println("\t" + multiple);
            } else {
                System.out.println(multiple);
            }
        }
    }
}