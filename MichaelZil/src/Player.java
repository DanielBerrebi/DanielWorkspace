package evenOddGame;

public class Player {
	private String name;
	private int score;
	
	public void setName(String newName){
		name = newName;
	}
	
	public int getScore(){
		return score;
	}
	
	public void setScore(int newScore){
		score = newScore;
	}
	
	public String details(){
		return name + " Scored " + score;
	}
}
