//22.1.18
public class SumDigits 
{
	public static void main(String [] args)
	{
		int num= 658844685;
		int sum=0;
		int temp=num;
		int rightDigit;
		int low=0;
		while(num>0)
		{
			if(num%2==0)//Check if the right digit is even
			{
				rightDigit=num%10;
				sum=sum+rightDigit;//Adding the right digit to the sum				
			}
			num=num/10;//Deleting the right digit from the original number
		}
		System.out.println("the summary of your even digits is "+ sum );
		
		
		
		
		
		
		
		
		System.out.print("The digits from lowest to highest is ");
		num=temp;
		while(low<10)//Checking if the variable low is between 0 to 9
		{
			while(num>0)//Comparing all the digits to the variable low and print it if its equal
			{
				rightDigit=num%10;
				if(rightDigit==low)
				{
					System.out.print(low);
				}
				num=num/10;
			}
			num=temp;//Restore the original number so we can use it again 
			low=low+1;
		}
	}
}
