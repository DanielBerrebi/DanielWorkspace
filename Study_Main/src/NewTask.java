import java.lang.Math;
import java.util.Scanner;



public class NewTask {

	
	public static boolean MultiDeter(int x, int y){
		
		
		if(y%x==0)return true;
		return false;
		
	}
	
	public static void sprinkleLine(int x)
	{
		while(x>0)
		{	System.out.print("*");
			x--;
			
			
		}
		
		
	}
	
	public static void sprinkleSquare(int x)
	{   int Lines=x;
		
	while(Lines>0)
	{	
		int Row=x;
		
		while(Row>0)
		{	System.out.print("*");
			Row--;		
		}
		System.out.println();
		Lines--;
	}
		
	}
	
	public static void Month(int x)
	{    
		 x=x%12;
		 if(x==0)x=12;
		 
		if(x==1)System.out.println("January");
		if(x==2)System.out.println("Febeuary");
		if(x==3)System.out.println("March");
		if(x==4)System.out.println("April");
		if(x==5)System.out.println("May");
		if(x==6)System.out.println("June");
		if(x==7)System.out.println("July");
		if(x==8)System.out.println("Agust");
		if(x==9)System.out.println("September");
		if(x==10)System.out.println("October");
		if(x==11)System.out.println("November");
		if(x==12)System.out.println("December");
		
	
	}
	
	public static boolean isPrimenumber(int x)
	{
		int temp=(int)Math.sqrt(x);
		
		
		for (int i=2; i<=temp; i++)
			if(MultiDeter(i,x))return false;
			
		return true;
		
	}
	
	public static void PrintPrimeNumber(int max){
		
		if(max==0){
			System.out.println("none");
			return;
		}
		System.out.print("1");
		
		
		for(int i=2; i<=max; i++)
		 {if(isPrimenumber(i))System.out.print("," +i);
		  if(i%(max/Math.sqrt(max))==0)System.out.println();
		 }
	}
	
	public static void sprinkleMessup(int x)
	{
		int lines=x;
		
		
		while(lines>0)
		{
			sprinkleLine(x);
			System.out.println();
			lines--;	
			
		}
		
		
	}
	
	public static void Primenumbercollection (int x){
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("please enter your num:");
		 x= in.nextInt();
		
		
		System.out.println("those are all the Prime numbers between 0 and "+(x));
		PrintPrimeNumber(x);

		in.close();
		
		
		
	}

	public static void Numberline(int I, int F)
	{
		for(int i=I; i<=F; i++ )
		{
			System.out.println(i);
			
			}
		
		
		
	
	
	
	
	}
	
	public static void Multitable(int n)
	{
		
		 for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				System.out.print(((i+1)*(j+1)) + "\t");
			System.out.println();
		
			
		}
		
		

	
	
	
	
	}
	
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		int x= in.nextInt();
		
	Multitable(x);
		
	in.close();
}


}
