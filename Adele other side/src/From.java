import java.util.Random;
import java.util.Scanner;

class players  {

	private String name;
	private int points;

	public void Setname() {

		Scanner in = new Scanner(System.in);
		name = in.nextLine();

	}

	public void Setpoints(int newpoints) {

		points = newpoints;

	}

	public int getpoint() {

		return points;

	}

	public String getname() {
		return name;

	}
	
	
}
	
	
class game {
	

	
	
	public  void Declaration(players name[]){
		
		for (int i = 0; i < name.length; i++) {
			name[i]= new players();
		}
		
		
		
	}
	
	public  void SetNames(players names[]) {

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter the name of player " + (i + 1));
			names[i].Setname();
		}

	}

	public  void Game(players player[]) {

		Random rand = new Random();

		int turns=5;
		int lower=rand.nextInt(10*player.length);
		int upper=rand.nextInt(10*player.length)+lower;
		
		while (turns > 0) {
			int val = rand.nextInt(upper - lower) + lower;
			for (int i = 0; i < player.length; i++) {

				if (val % player.length == i)
					player[i].Setpoints(player[i].getpoint() + 1);
					
			}

			
			turns--;

		}

		winner(player);

	}

	public  void GameTourment (players player[]){
		
		int winner=-1;
		int counter=1;
		
		while(winner==-1){
		
		System.out.println("[[[[[Match " + counter + " Begins]]]]]");
		Match(player);
		counter++;
		winner=Decider(player);
		
		}
	
		System.out.println("<<<<<<<AND THE WINNNER IIISSSSS!!!!!:::>>>>>>>>>>>>");
		System.out.println("player " + (winner+1) + " "+ player[winner].getname() + " Congratulations!!!");
		
		
	}
	
	public  void Match(players player[])
	{
		Random rand=new Random();
		int turns=2,upper=14,lower=5;
		int p1=0, p2=0;
		
		while(p1==p2){
			
			p1=rand.nextInt(99)%player.length;
			
			p2=rand.nextInt(99)%player.length;
			
			}
		
		
		while (turns > 0) {
			int val = rand.nextInt(upper - lower) + lower;
			if (val % 2 ==0 )
				player[p1].Setpoints(player[p1].getpoint() + 1);
			else 
				player[p2].Setpoints(player[p2].getpoint() + 1);
			turns--;
		}
		
		if(player[p1].getpoint()> player[p2].getpoint())
			System.out.println("player " + (p1+1) +" "+ player[p1].getname() + " wins\n" );
		else 
			System.out.println("player " + (p2+1) +" "+ player[p2].getname() + " wins\n" );
	
	}	
	
	public  int Decider(players name[]){
		
		for (int i = 0; i < name.length; i++) {
			
			if(name[i].getpoint()==3)return i;
		
		}
		
		return -1;
		
	}
	
	public  void winner(players player[]) {

		int max = 0, numofplayer = 0;

		for (int i = 0; i < player.length; i++) {
			int temp = player[i].getpoint();

			if (max < temp) {
				max = temp;
				numofplayer = i;

			}
		}
			System.out.println(
					"\nthe winner is player " + (numofplayer+1) + " " + player[numofplayer].getname() + " congratulations");


	}
	
	public void GameStart(){
		
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("Please enter the numbers of players in the game:");
		int size=in.nextInt(); 
		
		players[] gamers = new players[size];
		
		
		Declaration(gamers);
		SetNames(gamers);
		System.out.println("Lets The game begin:");
		GameTourment(gamers);
		
		
		
		
	}





}







public class From {

	
	public static void main(String[] args) {

		game Game=new game();
		
		Game.GameStart();
		
		
	}

}

	
	

