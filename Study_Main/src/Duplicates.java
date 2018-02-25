import java.util.Scanner;
import java.util.Random;


public class Duplicates {
 
	public static void main(String [] args){
		
		Scanner in= new Scanner (System.in);
		int n=10, N=10;
		int[] check =new int[N];
		int[] Random= new int[n];
		
		
		Random rand= new Random();
		
		
		
		for (int i = 0; i < Random.length; i++) {
			
			Random[i]=rand.nextInt(10);
			System.out.print(Random[i]+" ");
		}
		
		System.out.println();
		
		for(int index=0;index<N; index++)
			for(int i=0; i<n ; i++)
				if(Random[i]==index)check[index]=1;
		
		int size=0;
		
		for(int i=0; i<N; i++)
			size=size+check[i];
		
		int[] unique = new int[size];
		int k=0;
		
		for(int i=0; i<N; ++i)
			{
				int x= Random[i];
			
				if (check[x]==1)
					{unique[k]=x;
					k++;
					check[x]=0;		
					}
				
				
						
					
			}
			
		for (int i = 0; i < unique.length; i++) {
			
				System.out.print(unique[i]+" ");
		
		}
			
		
		
		
		
	}

}
