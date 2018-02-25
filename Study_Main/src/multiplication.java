import java.util.Scanner;

public class multiplication {
	
	public static void lineprinter(int low , int high , int add)
	{
		for(int i=low;i<=high; i=i+add)System.out.print(i+"\t");
			
			
			
			
		
		
		
		
	}
	
	public static void Multiprinter(int N)
	{
		for (int i = 0; i <N; i++) {
			
			lineprinter(i+1,(i+1)*N,i+1);
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number for multi table");
		int N=in.nextInt();
	
	Multiprinter(N);
	
	}

}
