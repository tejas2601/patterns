public class TringlePattern1 {
    public static void main(String[] args) {
        int n = 4;
        int ch=1;;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(ch + " ");ch++;
            }
            System.out.println();
            
        }
    
    }
}
