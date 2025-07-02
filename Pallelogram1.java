public class Pallelogram1 {
    public static void main(String[] args) {
        int n = 4;
        
        for (int i = n-1; i >=0; i--) {
            for(int space=0;space<n-i-1;space++){
                System.out.print(" "+" ");
            }
            for(int star=0;star<n;star++){
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    
}

    } 
// This code prints a parallelogram pattern with asterisks.
// The outer loop iterates through the number of rows (n).
// The first inner loop prints spaces to create the slant of the parallelogram. 
// The second inner loop prints asterisks, creating the body of the parallelogram.
// The output will be a parallelogram shape made of asterisks, with each
// row indented by one less space than the previous row, creating a slanted effect.
// For example, if n = 4, the output will look like this:
//      *  *  *  *
//     *  *  *  *
//    *  *  *  *
//   *  *  *  *