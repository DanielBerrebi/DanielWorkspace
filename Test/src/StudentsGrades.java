//24.1.18
import java.util.Scanner;

public class StudentsGrades {
	public static void main(String [] args){
	double sum=0;
	double avg;
	double bonus;
	Scanner scan=new Scanner(System.in);	
	
	System.out.println("Enter the number of students");
	int students=scan.nextInt();
	double [] grades = new double [students];
	for(int i=0;i<grades.length;i++){
		System.out.println("Enter a grade");
		grades[i]=scan.nextInt();	
		while(grades[i]<0 || grades[i]>100)
		{
			System.out.println("The grade should be between 0 to 100 try agian");
			grades[i]=scan.nextInt();
		}
		sum=sum+grades[i];
	}
	avg=sum/grades.length;
	if(avg >= 60){
		System.out.println("pass" + avg);
	}
	else{
		System.out.println("Didn't pass enter a bonus pls in precent" + avg);
		bonus=scan.nextInt();
		bonus=bonus/100 + 1;//Converting the bonus from percent to fraction
		sum=0;
		for(int i=0;i<grades.length;i++){
			System.out.print(+grades[i]+",");
			grades[i]=grades[i]*bonus;
			if(grades[i]>100)grades[i]=100;//Checking if the grade is not above 100 after the bonus if it is change the grade to 100
			sum=sum+grades[i];
		}System.out.println("\n Grades after bonus are");
		for(int i=0;i<grades.length;i++){
			System.out.print(+grades[i]+",");
		}
		avg=sum/grades.length;
		if(avg>= 60)
		{
			System.out.println("\nPass with bonus " +avg);
		}
		else
		{
			System.out.println("Didn't pass with bonus" + avg);
		}
	}
	System.out.println("If you want to know the max grade Enter 1 if you want the lowest enter 0");
	int minOrMax=scan.nextInt();
	while(minOrMax!=1 && minOrMax!=0){
		System.out.println("Error,you should enter 1 to max or 0 to low pls ");
		minOrMax=scan.nextInt();
	}
	if(minOrMax==1){
		double max=grades[0];
		for(int i=1;i<grades.length;i++){
			if(max<grades[i])max=grades[i];
		}
		
		System.out.println("The highest grade is " + max);
		}else{
			double min=grades[0];
			for(int i=1;i<grades.length;i++){
			if(min>grades[i])min=grades[i];
			}
			System.out.println("The lowest grade is " + min);
		}		
	scan.close();
	}
}
