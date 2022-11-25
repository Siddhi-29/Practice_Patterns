import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int nst=(n/2);
		int nsp=1;
		
		//rows
		int rows=1;
		while(rows<=n) {
			//work1
			for( int cst=1;cst<=nst; cst++) {
				System.out.print("*");
			}
			//work2
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			//work3
			for( int cst=1;cst<=nst; cst++) {
				System.out.print("*");
			}
			
			//preparation
			System.out.println();
			
			if(rows<=n/2) {
				nsp += 2;
				nst -= 1;
			}
			else {
				nsp -= 2;
				nst += 1;
			}
			rows++;
		}
	}

}
