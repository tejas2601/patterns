public class EqualLaternal {
    public static void main(String[] args) {
        int n = 11;
        
       
        for (int i = 0; i < n; i++) {
            
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }

            
            for (int star = 0; star < 2 * i + 1; star++) {
                System.out.print("*");
                if (star < 2 * i) System.out.print(" "); 
            }

            System.out.println();
        }
    }
}
