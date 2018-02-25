import java.util.Scanner;

//24.1.18
public class NumbersOfNumbers {

	public static void main(String[] args) {
//		int num;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number please");
//		num = scan.nextInt();
//		int[] digits = new int[10];
//		int dig;
//		while (num > 0) {
//			dig = (int) num % 10;
//			digits[dig] += 1;
//			num /= 10;
//		}
//		for (int i = 0; i < digits.length; i++)System.out.println("The numbers of the digit " + i + " is " + digits[i]);
		String st="He is not a real doctor.";
		st=st.toLowerCase();
		char letter;
		int [] letters=new int [25];	
		for (int j = 0; j < st.length(); j++) {

			letter=st.charAt(j);
			if(letter>96 && letter<123)letters[letter-97]++;
		}
		for (int i = 0; i < letters.length; i++) {
			System.out.println("The letter "+(char)(i+97)+ " appers "+letters[i]+" times");
		}
	}
}
