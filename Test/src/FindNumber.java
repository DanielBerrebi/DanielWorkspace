//24.1.18
import java.util.Scanner;

public class FindNumber 
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the min border");
		int min=scan.nextInt();
		min=min-1;
		System.out.println("Enter the max border");
		int max=scan.nextInt();
		max=max+1;
		int middle;
		int guesses=1;
		middle=(min+max)/2;
		System.out.println("Is "+middle+" your number?\nIf your number is higher enter 1\nIf your number is lower enter 2 \nIf its your number enter 3");
		int check=scan.nextInt();
		while(check!=3)
		{
			if(check==1)min=middle;
			else max=middle;
			if(middle==((min+max)/2)){
				System.out.println("Liar");
				break;
			}
			middle=(min+max)/2;
			guesses++;
			System.out.println("Is "+middle+" your number?\nIf your number is higher enter 1\nIf your number is lower enter 2 \nIf its your number enter 3");
			check=scan.nextInt();
			
		}
		System.out.println("Good game we guess your number in " + guesses + " guesses");
		scan.close();
	}
}