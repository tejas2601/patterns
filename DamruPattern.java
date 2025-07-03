import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    int space=1,star=n;
		for(int i=0;i<n;i++){
		    
		    
		     for(int j=0;j<space;j++){
		        System.out.print(" "+" ");
		    }
		    
		    for(int j=0;j<star;j++){
		        System.out.print("*"+" ");
		    }
		   
		    
		    if(i<n/2){
		        
		        
		         star-=2;
		        space++;
		    }else{
		       star+=2;
		        space--;
		    }
		    System.out.println();
		}
	}
}
