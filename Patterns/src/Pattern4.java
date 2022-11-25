import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		
		int nsp = n-1;
		int nst = 1;
		
		//rows
		int row =1;
		while(row<=n) {
			
			//work1
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
			//work2
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			//preparation
			System.out.println();
			nst++;
			nsp--;
			row++;
		}

	}

}
