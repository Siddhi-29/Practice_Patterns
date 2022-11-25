import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst=1;
		
		//rows
		int nr = (2*n)-1;
		int rows = 1;
		while(rows<=nr){
			
			//work
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			
			//preparation
			System.out.println();
			rows++;
			if(rows<=nr/2) {
				nst++;
			}
			else {
				nst--;
			}
		}
	}
}
