//23.1.18
import java.util.Random;
import java.util.Scanner;

public class Exericise6 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		Random random= new Random();
		int num1,num2;
/*		num1=random.nextInt(101);//Exercise 6.1
		int counter=1;
		while(counter<num1)
		{
			System.out.println(counter);
			counter++;
		}	
*/	
/*
		num1=random.nextInt(101);//Exercise 6.2
		num2=random.nextInt(101);
		if(num1>num2)
		{
			while(num1>num2)
			{
				System.out.println(num2);
				num2++;
			}
		}
		else if(num2>num1)
		{
			while(num2>num1)
			{
				System.out.println(num1);
				num1++;
			}
		}
		else
		{
			System.out.println("The numbers are equal");
		}
*/
/*
		num1=random.nextInt(101);//Exercise 6.3
		int counter=0;
		while(counter<num1)
		{
		System.out.println(counter);
		counter=counter + 2;
		}
*/
/*

		int max=random.nextInt(101);//Exercise 6.4
		int den=random.nextInt(11);
		int counter=0;
		while(counter<=max)
		{
			if(counter%den==0)
			{
				System.out.println("The den is "+ den + " the max is "+ max + " the num that div is "+ counter);
			}
			counter++;
		}
*/
/*
		num1=random.nextInt(10001);//Exercise 6.5
		int temp=num1;
		int counter=0;
		int rev=0;
		int sum=0;
		int left=0;
		while (temp>0)
		{
			left=temp%10;
			sum=sum+left;
			rev=rev*10+left;
			counter++;
			temp=temp/10;
		}
		System.out.println("The orignal number is "+ num1 +"\n The number of digits " + counter+ "\n The left digit is " + left + "\n The sum of the digits is "+ sum + "\n The reverse number is "+ rev);
*/
/*
		num1=random.nextInt(100001);//Exercise 6.6
		int temp=num1;
		int rev=0;
		int left=0;
		while (temp>0)
		{
			rev=rev*10+temp%10;
			temp=temp/10;
		}
		if(rev==num1)
		{
			System.out.println("Palindrome number - "+num1);
		}
		else
		{
			System.out.println("Not a palindrome number - "+num1);
		}
*/
/*
		num1=random.nextInt(21);//Exercise 6.7
		int sum=1;
		int counter=1;
		while(counter<num1)
		{
			sum=sum*counter;
			System.out.print(counter + " X ");
			counter++;
		}
		sum=sum*counter;
		System.out.print(counter+ " = " + sum );
*/
/*
		int index=random.nextInt(51);//Exercise 6.8
		int temp;
		num1=0;
		num2=1;
		int counter=2;
		while(counter<=index)
		{
			temp=num2;
			num2=num2+num1;
			num1=temp;
			counter++;
		}
		if(counter==1)
		{
			System.out.println(index+" index is "+num2 );
		}
		else if(counter==0)
		{
			System.out.println(index+" index is "+ num1);
		}
		else
		{
			System.out.println(index+" index is "+num2);
		}
*/
/*
		int index=random.nextInt(51);//Exercise 6.9
		int temp;
		num1=1;
		num2=1;
		int counter=2;
		if(index==1)
		{
			System.out.print(num1 +","+num2 );
		}
		else if(index==0)
		{
			System.out.print(num1);
		}
		else
		{
			System.out.print(num1);
		}
		while(counter<=index)
		{
			System.out.print(","+num2);
			temp=num2;
			num2=num2+num1;
			num1=temp;
			counter++;
		}
		System.out.print("\n The index is"+index);
*/
/*
		int index=random.nextInt(101);//Exercise 6.10
		int counter=0;
		while(counter<=index)
		{
			if(counter%7==0 && counter != 0)
			{
				System.out.println("Boom");
			}
			else
			{
				System.out.println(counter);
			}
		counter++;
		}
*/
/*		
		//Exercise 3 page 43
		System.out.println("Pls enter the number of checks");
		int checks=scan.nextInt();
		System.out.println("Pls enter charge");
		int charge=scan.nextInt();
		double total;
		double tax=0;
		total=charge;
		if(charge>500)
		{
			tax=0.01*500;
			charge=charge-500;
			tax=tax+charge*0.015;
			total=total+tax;
		}
		else
		{
			tax=0.01*charge;
			total=total+tax;
		}
		System.out.println("The number of check is "+checks + "\n The tax for the check is "+(0.1*checks)+"\n The tax of the price is " + tax + "\n Total payment of "+(tax+(0.1*checks)));
*/
/*		
        //Exercise 4 page 43
		int years,kids,hours;
		double salary;
		System.out.println("Pls enter your salary");
		salary=scan.nextInt();
		System.out.println("Pls enter the amount of years in the company");
		years=scan.nextInt();
		System.out.println("Pls enter the amount of your kids");
		kids=scan.nextInt();
		System.out.println("Pls enter the amount of your working hours");
		hours=scan.nextInt();
		if(years>10){
			salary=salary*1.1;
		}
		if(kids>6){
			salary=salary+((kids-6)*700)+(3*400);
		}
		else if(kids>3){
			kids=kids-3;
			salary=salary+kids*400;
		}
		if(hours>176){
			salary=salary+((hours-176)*120)+(16*120);
		}
		else if(hours>160){
			hours=hours-160;
			salary=salary+hours*80;
		}
		System.out.println("Your updated salary is "+salary);
*/
		scan.close();
	}
}
