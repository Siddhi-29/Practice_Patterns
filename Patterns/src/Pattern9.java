import java.util.Scanner;
public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int nst=1;
		int nsp=2*n-3;
		
		//rows
		int rows=1;
		while(rows<=n) {
			//work1
			for( int cst=1; cst<=nst; cst++) {
				System.out.print("*");
			}
			//work2
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			//work3
			int cst=1;
			if(rows==n) {
				cst=2;
			}
			for( ; cst<=nst; cst++) {
				System.out.print("*");
			}
			System.out.println();
			nst++;
			nsp -= 2;
			rows++;
		}
	}

}
