
public class pattern2 {
	public static void main(String[] args) {
		pattern(5);
	}
	static void pattern(int n )
	{
		for (int i=n;i>0;i--)
		{
			for(int j=i;j>0;j--) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
