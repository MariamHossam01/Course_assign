import java.util.Scanner;

public class Problem3 {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int q =myObj.nextInt();

	for (int k=0;q>k;k++)
	{	
		int a =myObj.nextInt();
		int b =myObj.nextInt();
		int n =myObj.nextInt();
		int x=a;
		for (int i=0;n>i;i++)
			{
				x=x+(int) Math.pow(2, i)*b;
				System.out.print(x+" ");
			}
		System.out.println("");
	}
	}
}
