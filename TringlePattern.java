public class TringlePattern {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'a';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(ch + " ");ch++;
            }
            System.out.println();
            
        }
    
    }
}
