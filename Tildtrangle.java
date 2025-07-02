public class Tildtrangle {
    public static void main(String[] args) {
        int n = 9;
        int j=0;
        for (int i = n-1; i >=0; i--) {
            for(int space=0;space<=j;space++){
                System.out.print(" ");
            }
            for(int star=i;star>=0;star--){
                System.out.print("*"+"  ");
            }
            System.out.println();
            j++;
        }
    }
    
}
