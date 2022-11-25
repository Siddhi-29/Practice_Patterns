
public class Pyramidstar {
     public static void main(String args[]) {
    	
    	 int i,j,row=6;
    	 
    	 for(i=1;i<=row;i++) {
    		 
    		 for(j=1;j<=row-i;j++) {
    			 
    			 System.out.print(" ");
    		 
    		 }
    			 for(j=6;j>row-i;j--) { 
    				 
    				 System.out.print("* ");
    			 
    			 }
    			 
    			 System.out.println();
    		 
    	 }
     }
}
