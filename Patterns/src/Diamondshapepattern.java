import java.util.Scanner;
public class Diamondshapepattern {
   
	public static void main(String args[]) {
		int row=6,i,j,space;
		space=row-1;
         
		for(i=1;i<=row;i++) {
   		 
   		 for(j=1;j<=row-i;j++) {
   			 
   			 System.out.print(" ");
   		 
   		 }
   			 for(j=6;j>row-i;j--) { 
   				 
   				 System.out.print("* ");
   			 
   			 }
   			 
   			 System.out.println();
		}
		for(i=6;i>=1;i--) {
			for(j=1;j<=i;j++)
			{			
				
				System.out.print(" *");
			}
			System.out.println();
		
	  }	
   }
}



