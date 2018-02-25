import java.util.Random;

public class array {


	public static void arraysort(int arr[]){
	
	
		int Size=arr.length;
	
	
		while(Size>1){
			for (int i = 0; i < (Size-1); i++) {
				if(arr[i]>arr[i+1]){
		
					int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
		
		
				}
			}
	
				Size--;	
			}
		}


	public static void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
		

	public static void ArrayInsertRandomizer(int arr[],int upper, int lower)
	{
		Random rand=new Random();
		;
		
		for (int i = 0; i < arr.length; i++) {
			
			int x=rand.nextInt(upper)+lower;
			arr[i]=x;
		}
	}


	public static int[] Arrcombiner (int A[], int B[]){
		
		int[] arr= new int[A.length+B.length];
		
		
		for (int i = 0; i < A.length; i++) {
			
		arr[i]=A[i];
		}
		
		for (int i = 0; i < B.length; i++) {
			
		arr[A.length+i]=B[i];
		}
		
		
		arraysort(arr);
		
		return arr;
		
		
	
	}
	
	
	
	
	
	
public static void main(String[] args) {
	
int[] A =new int[6];
int[] B=new int[5];

ArrayInsertRandomizer(A,20,5);
ArrayInsertRandomizer(B,13,4);
printArray(A);
printArray(B);
int[] C=Arrcombiner(A,B);
printArray(C);
}
	
	
	
	
	
	
	
	
}
