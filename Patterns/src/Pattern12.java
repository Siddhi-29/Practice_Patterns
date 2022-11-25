import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int nsp = n-1;
		int nst = 1;
		int value=1;
		//rows
		int rows=1;
		while(rows<=n) {
			//work1
			int csp=1;
			while(csp<=nsp) {
				System.out.print("\t");
				csp++;
			}
			//work2
			int cst=1;
			while(cst<=nst){
				System.out.print(value+"\t");
				value++;
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
