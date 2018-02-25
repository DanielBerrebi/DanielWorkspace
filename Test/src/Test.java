//21.1.18
import java.util.Scanner;
public class Test 
{
	public static void main(String [] args)
	{
		double sum=0;
		double avg;
		double bonus;
		Scanner scan=new Scanner(System.in);	
		
		System.out.println("Enter the first grade");
		double grade1=scan.nextInt();		
		while(grade1<0 || grade1>100)//Checking if the grade is between 0 to 100 and if not requesting the grade until he enter an ok grade
		{
			System.out.println("The grade should be between 0 to 100");
			grade1=scan.nextInt();
		}
		
		System.out.println("Enter the second grade");
		double grade2=scan.nextInt();	
		while(grade2<0 || grade2>100)
		{
			System.out.println("The grade should be between 0 to 100");
			grade2=scan.nextInt();
		}
		
		System.out.println("Enter the third grade");
		double grade3=scan.nextInt();	
		while(grade3<0 || grade3>100)
		{
			System.out.println("The grade should be between 0 to 100");
			grade3=scan.nextInt();
		}

		System.out.println("Enter the fourth grade");
		double grade4=scan.nextInt();	
		while(grade4<0 || grade4>100)
		{
			System.out.println("The grade should be between 0 to 100");
			grade4=scan.nextInt();
		}
		
		sum=grade1 + grade2 +grade3+grade4;
		avg=sum/4;
		if(avg >= 60)
		{
			System.out.println("pass" + avg);
		}
		else
		{
			System.out.println("Didn't pass enter a bonus pls ");
			bonus=scan.nextInt();
			bonus=bonus/100 + 1;//Converting the bonus from percent to fraction
			grade1=grade1*bonus;
			if(grade1>100)grade1=100;//Checking if the grade is not above 100 after the bonus if it is change the grade to 100
			
			grade2=grade2*bonus;		
			if(grade2>100)grade2=100;
			
			grade3=grade3*bonus;
			if(grade3>100)grade3=100;
			
			grade4=grade4*bonus;		
			if(grade4>100)grade4=100;
			
			sum=grade1+grade2+grade3+grade4;
			avg=sum/4;
			
			if(avg>= 60)
			{
				System.out.println("pass with bonus" +avg);
			}
			else
			{
				System.out.println("didn't pass with bonus" + avg);
			}
		}
		System.out.println("If you want to know the max grade Enter 1 if you want the lowest enter 0");
		int minOrMax=scan.nextInt();
		while(minOrMax!=1 && minOrMax!=0)
		{
			System.out.println("Error,you should enter 1 to max or 0 to low pls ");
			minOrMax=scan.nextInt();
		}
		if(minOrMax==1)
		{
			double maxGrade=grade1;
			if (grade2>maxGrade)
			{
				maxGrade=grade2;
			}
			if(grade3>maxGrade)
			{
				maxGrade=grade3;
			}
			if(grade4>maxGrade)
			{
				maxGrade=grade4;
			}
			System.out.println("The highest grade is " + maxGrade);
		}
		else
		{
			double minGrade=grade1;
			
			if (grade2<minGrade)
			{
				minGrade=grade2;
			}
			
			if(grade3<minGrade)
			{
				minGrade=grade3;
			}
			
			if(grade4<minGrade)
			{
				minGrade=grade4;
			}
			
			System.out.println("The lowest grade is " + minGrade);
		}
		scan.close();

	}
}
