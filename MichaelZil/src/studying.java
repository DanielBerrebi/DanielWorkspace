import java.util.Scanner;

public class studying {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("how many numbers do you want ot enter?");
		int index = input.nextInt();
		int[] ar = new int[index];
		for(int i = 0; i < ar.length; i++){
			System.out.println("Enter the " + (i+1) + " number from the " + index);
			ar[i] = input.nextInt();
		}
		findSpecialNum(ar);
		input.close();
	}
	
	// amud 48 mesima 3: find a place in the array which is the sum of all other places.
	public static void findSpecialNum(int[] ar){
		int sum;
		for(int i = 0; i < ar.length; i++){
			sum = 0;
			for(int j =0; j< ar.length; j++){
				if (j != i) 
					sum += ar[j];
			}
			if(sum == ar[i]) 
				System.out.println("The number in the ar[" + i + "] is a equal to the sum of all other numbers in the array!");
		}
	}
}