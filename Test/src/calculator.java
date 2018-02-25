//22.1.18
import java.util.Scanner;

public class calculator 
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		double sum,x,y,sign,onOff;
		System.out.println("For use the calculator type 1\nFor exit type 2");
		onOff=scan.nextInt();
/*		if((onOff!=2) || (onOff !=1))
		{
			System.out.println("Pls enter 1 or 2");
			System.out.println("For use the calculator type 1\nFor exit type 2");
			onOff=scan.nextInt();
		}*/
		while(onOff!=2)
		{
			System.out.println("For sum type 1\nFor subtraction type 2\nFor multiplaction type 3\n For division type 4");
			sign=scan.nextInt();
			System.out.println("Enter the first number");
			x=scan.nextInt();
			System.out.println("Enter the second number");
			y=scan.nextInt();
			if(sign == 1 )
			{
				sum=x+y;
				System.out.println("You result is " + sum);
			}
			else if(sign==2)
			{
				sum=x-y;	
				System.out.println("You result is " + sum);
			}
			else if(sign==3)
			{
				sum=x*y;	
				System.out.println("You result is " + sum);
			}
			else
			{
				if(y!=0)
				{
					sum=x/y;
					System.out.println("You result is " + sum);
				}
				else
				{
					System.out.println("You can't division in 0");
				}
			}
			
		System.out.println("For use the calculator type 1\nFor exit type 2");
		onOff=scan.nextInt();
		}
		scan.close();
	}
}
