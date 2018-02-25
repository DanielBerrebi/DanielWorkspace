//23.1.18
import java.util.Random;
import java.util.Scanner;

public class Exercise5 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		Random random= new Random();
		int num1,num2,num3;
/*		num1=random.nextInt(1000);//Exercise 5.1
		num2=random.nextInt(1000);
		if (num1>num2)System.out.println(num1);
		else System.out.println(num2);
*/   
/*	num1=random.nextInt(101);
		if(num1>50)System.out.println("Big ! " + num1 );//Exercise 5.2
		else if(num1<50)System.out.println("Small ! "+num1);
		else System.out.println("Bingo ! "+num1);
*/   
/*
		num1=random.nextInt(101);
		if(num1>50)System.out.println("Big ! " + num1 );//Exercise 5.3
		else System.out.println("Small ! "+num1);
		if(num1%2==0)System.out.println("Even");
		else System.out.println("Odd");
*/
/*
		double salary=5000+random.nextInt(1001);//Exercise 5.4
		if(salary*1.1<6001) salary=salary*1.1;
		System.out.println(salary);
*/
/*
		num1=random.nextInt(1001);//Exercise 5.5
		num2=random.nextInt(1001);
		num3=random.nextInt(1001);
		if (num1>num2)
		{
			if(num1>num3)System.out.println(num1);
			else System.out.println(num3);
		}
		else if(num2>num3)System.out.println(num2);
		else System.out.println(num3);
*/
/*
		System.out.println("Enter your salary");//Exercise 5.6
		double salary=scan.nextInt();
		double tax=0;
		if(salary>100000)
		{
			tax=salary*0.4;
			salary=salary-tax;
		}
		else if(salary>50000)
		{
			tax=salary*0.3;
			salary=salary-tax;
		}
		else if(salary>23000)
		{
			tax=salary*0.2;
			salary=salary-tax;
		}
		else
		{
			tax=salary*0.1;
			salary=salary-tax;
		}
		System.out.println("The salary after tax is "+salary);
*/
		int year=random.nextInt(2018);//Exercise 5.6
		if(year%4==0)
		{
			if((year%100==0) && (year%400!=0))
			{
				System.out.println("Not leap year "+ year);
			}
			else System.out.println("Leap year "+ year);
		}
		else System.out.println("Not leap year "+ year);
		scan.close();
	}
	
}
