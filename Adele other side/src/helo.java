import java.util.Scanner;

public class helo {

	
	
	public static void Sweep(int arr[], int End) //move all the numbers in array 1 cell forward and delete the cell in End;
	{
		for (int i = (arr.length-1); i >End; i--) 
		arr[i]=arr[i-1];
	}
	
	public static void ArrPrint(int arr[]) // print the array;
	{ 
		
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]+ " ");	
		
		
		
	}
	
	//public static boolean ()
	
	
	
	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		
		int[] Array= new int[3];
 		int num=0;
		
		
		
		
 		while(num!=-1)
 		{
 			num=in.nextInt();
 			
 			for (int i = 0; i < Array.length; i++) 
 				if(Array[i]<num)
 				{
 					Sweep(Array, i );
 					Array[i]=num;
 					break;
 				}
			
 		}
		
		
		System.out.println("your biggest numbers are");
		ArrPrint(Array);
		
		
		
		
	}
	
	
	
	
	
}
