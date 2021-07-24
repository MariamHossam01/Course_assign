import java.util.Scanner;
public class Problem4 {

public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		
		String name =myObj.nextLine();
		int x= name.length();
     	Decode(x,name);

		
		myObj.close();
	}
	
	public static void Decode(int l, String name)
	{ 
		
		char[] charLetters = name.toCharArray();
		char[] resultName = new char[name.length()];
		
		int x=0;

		for(int i=l; i >0; i--) 
	         { int z=i/2;
	            if(i%2==0)
	            {
	            	resultName[z-1]= charLetters[x] ;
	            }
	            else	
	            {
	            	resultName[z+x]=charLetters[x] ;	
	            }
	            x++;
	         }
		
		//System.out.print(Arrays.toString(charLetters)+" "+Arrays.toString(resultName)+"   ");
		  for (int i = 0; i < l; i++) {
	            System.out.print(resultName[i] );
	        }
	}
}
