import java.util.Scanner;

public class xogame {


public static void MatrixCheck (int Matrix[][])
{

	
	System.out.println("Hello");

	for (int i = 0; i < Matrix.length; i++) {
		
		int sumline=0;
		int sumrow=0;
		int j=0;
		
		for (j = 0; j < Matrix[i].length; j++) {
				
			sumline+=  Matrix[i][j];
			sumrow+= Matrix[j][i];
		
		}
		
	
		if(sumline==3 || sumrow==3){
			System.out.println("Player 1 has won the game");
			return;
		}
		if(sumline==-3 || sumrow==-3){
			System.out.println("Player 2 has won the game");
			return;
		}
	
		
}
	int sumRightDiag=0;
	int sumLeftDiag=0;
	
	for (int k = 0; k < Matrix.length; k++) {
		
		sumRightDiag+= Matrix[k][k];
		sumLeftDiag+= Matrix[k][(Matrix.length)-1-k];
		
	}

	if(sumRightDiag==3 || sumLeftDiag==3){
		System.out.println("Player 1 has won the game");
		return;
	}
	
	if(sumRightDiag==-3 || sumLeftDiag==-3){
		System.out.println("Player 2 has won the game");
		return;
	}
	System.out.println("None of the things has happend");
	return;
}
	
	
	
public static void main(String[] args) {
	
int[][] Matrix= new int[3][3];

Scanner In = new Scanner (System.in);

for (int i = 0; i < Matrix.length; i++) {
	for (int j = 0; j < Matrix.length; j++) {
		Matrix[i][j]=In.nextInt();
	}
}

MatrixCheck(Matrix);



}


}
