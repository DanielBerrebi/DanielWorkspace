

class PoopyExcept extends Exception{
	
	private String myMsg;
	
	public String getMyMsg(){
		return myMsg;
	}
	
	public PoopyExcept(String msg){
		this.myMsg = msg;
	}
	
	
}



public class enums {

	
public static int Divine(int x, int y){
	
	return x/y;
	
	
	
}
	
	
public static void main(String[] args) {
		
		
	try{
		Divine(4, 0);
	}catch(ArithmeticException heloa){
		System.out.println(heloa.getMessage());
		heloa.printStackTrace();
	}
      



		







}



}
