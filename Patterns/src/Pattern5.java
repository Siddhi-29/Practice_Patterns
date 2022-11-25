import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int nsp = 0;
		int nst = n;
		
		//row
		int row = 1;
		while(row<=n) {
			 //work1
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
			//work2
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			
			//preparation
			System.out.println();
			row++;
			nst--;
			nsp++;
			
			
		}
	}

}
