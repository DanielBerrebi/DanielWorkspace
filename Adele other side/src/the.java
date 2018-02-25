

class student{
	
	private String Studentname;
	private String StudentID;
	private int Studentgrade;
	
	
	
	public void setName(String name)
	{
		Studentname=name;
		
	}
	
	public void setID(String ID){
		
		StudentID=ID;		
	}
	
	public void setGrade(int grade){

		Studentgrade=grade;
	
	
	
	}

	public String getName(){
		
		return Studentname;
		
	}

	public String getID(){
		
		return StudentID;
		
		}

	public int getGrade(){
	
		return Studentgrade;
		
		
}

	

}





public class the {

	public void InsertStudent(student[] catagory){
		
		
		for (int i = 0; i < catagory.length; i++) {
			
			 catagory[i]= new student();
			
			 
		
		}
	
	
	
	
	}

	
	
	
	
	



}
