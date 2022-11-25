import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int nsp = n-1;
		int nst = 1;
		int value;
		//rows
		int rows=1;
		while(rows<=n) {
			value=1;
			//work1
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			//work2
			int cst=1;
			while(cst<=nst){
				System.out.print(value);
				if(cst<=nst/2){
					value++;
				}
				else{
					value--;
				}
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
