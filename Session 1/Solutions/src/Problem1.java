import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		// Limak and Bob weigh a and b respectively
		//Limak weight is tripled after every year, while Bob's weight is doubled after every year. 
		int a =myObj.nextInt();
		int b =myObj.nextInt();


		int i;
		for(i=0;b>=a;i++)
		{
			a=3*a;
			b=2*b;
		}
		System.out.print(i);
		myObj.close();
	}

}
