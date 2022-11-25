import java.util.Scanner;
public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int nsp = n-1;
		int nst = 1;
		//rows
		int rows=1;
		while(rows<=n) {
			//work1
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			//work2
			int cst=1;
			while(cst<=nst){
				System.out.print("1");
				cst++;
			}
			
			//preparation
			System.out.println();
			rows++;
			nsp--;
			nst += 2;
			
		}
	}

}
