
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
// 		"a 2 2 a"
// 		"1 b b 4"
// 		"1 c c 4"
// 		"d 2 3 d"
char ch='a';
  for(int i=0;i<4;i++){
      for(int j=0;j<4;j++){
           if(i==j||i+j==4-1){
               System.out.print(ch+" ");
           }else{
               System.out.print(j+1+" ");
           }  
       }
       System.out.println();
       ch++;
   }
		
	}
}