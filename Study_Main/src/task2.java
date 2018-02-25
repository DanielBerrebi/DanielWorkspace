import java.util.Scanner;

public class task2 {


public static int EvenDigitCounter(int num)
{
	int counter=0;
	
	while(num>0)
	{
		int right=num%10;
		if(right%2==0)counter++;
		num=num/10;
		
	}

	return counter;


}
public static void Sweep(int arr[], int entrance)
{
	for (int i = 1; i < entrance; i++) 
		arr[i-1]=arr[i];

}

	
public static void main(String[] args) {

Scanner In= new Scanner(System.in);




	
	System.out.println("Please enter series of numbers:");
	
	int num=0;
	int N=3;
	int[] numbers = new int[N];
	
	
	
	
	
	/*while(num!=-1)
	{
		 num=In.nextInt();
		
		
		for (int i = numbers.length-1; i >=0; i--) {
			if(numbers[i]<num){
				Sweep(numbers, i);
				numbers[i]=num;
				break;
			
			}
		}	
	}*/
	

	System.out.println("this are your higest numbers:");
	for (int i = 0; i < numbers.length; i++)System.out.print(" " + numbers[i]);

	

	
	
	
	
}



}
