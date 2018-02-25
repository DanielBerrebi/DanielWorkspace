import java.util.Random;
import java.util.Stack;

public class stack {


	public static int findMax(int x, int y){
		
		if(x>y)return x;
		else return y;
		
	}
	
	public static void Stackmax(Stack can){
		
		Stack <Integer>  temporary = new Stack<Integer>();
		int bullet=0, i=0;
		int max=0;
		
		while(!can.empty()){
			
		 bullet=(int) can.pop();
		 max=findMax(bullet, max);
		 temporary.push(bullet);
		 
		}
		
		while(!temporary.empty())
		{
			bullet=temporary.pop();
			can.push(bullet);
			
		}
		
		System.out.println("your max number is " +max);
	
	
	
	
	}
	
	
	public static void main(String[] args) {
	
	Stack <Integer> can = new Stack<Integer>();
	
	Random rand=new Random();
	
	int x= (int) rand.nextInt(30);
	
	
	
	
	Stackmax(can);
	
	
	}











}
