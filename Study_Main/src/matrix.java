import java.util.Random;
import java.util.Scanner;

public class matrix {


public static void MatrixAvg (int Matrix[][])
{
	int avg=0;
	int diviner=0;

for(int i=0; i<Matrix.length;i++)
	for(int j=0; j<Matrix[i].length; j++)
		avg=+Matrix[i][j];
	
for(int i=0;i<Matrix.length;i++)
	diviner=+Matrix[i].length;

avg=avg/diviner;

System.out.println("your avg number in the whole matrix is " +avg);
return ;


}	

public static void MatrixMax(int Matrix[][])
{ 
	int max=Matrix[0][0];
	
	for(int i=0; i<Matrix.length;i++)
		for(int j=0; j<Matrix[i].length; j++)
			if(max<Matrix[i][j])max=Matrix[i][j];

	System.out.println("your maximum number in the matrix is " +max);
	return ;

}


public static void MatrixMin(int Matrix[][])
{
int min=Matrix[0][0];
	
	for(int i=0; i<Matrix.length;i++)
		for(int j=0; j<Matrix[i].length; j++)
			if(min>Matrix[i][j])min=Matrix[i][j];

System.out.println("your minmum number in the matrix is " +min);
	return ;


}


public static void MatrixMaxLine(int Matrix[][])
{
	int max=0;
	int linemax=0;
	
	for(int i=0; i<Matrix.length; i++)
	{	
		int avg=0;
		for(int j=0; j<Matrix[i].length; j++)
			avg=+Matrix[i][j];
		
		avg=(avg/Matrix[i].length);
		if(max<avg){
			max=avg;
			linemax=i;
			
		}
	
	}
	
	System.out.println("your highest avgerage found in " + (linemax+1) + " line");
	return ;
}

public static void MatrixMaxCol(int Matrix[][])
{
	
	int max=0;
	int colmax=0;
	
	
	for(int j=0; j<Matrix[0].length; j++)
	{	int avg=0;
		
		for(int i=0; i<Matrix.length; i++)
			avg=+Matrix[i][j];
		
		avg=avg/Matrix.length;
		
		if(max<avg)
		{
			max=avg;
			colmax=j;
			
		}	
	}
System.out.println("your highest avgerage found in " + (colmax+1) + " colunm");
return;
}

public static void MaxDiagonal(int Matrix[][])
{
	int k=0;
	int rightDiag=0;
	int leftDiag=0;
	
	for(k=0; k<Matrix.length; ++k)
		rightDiag=+Matrix[k][k];

	for(k=0; k<Matrix.length; ++k)
		leftDiag=+Matrix[k][(Matrix.length)-k-1];

	if(rightDiag>leftDiag){
		
		System.out.println("RighDiag has the the higer Avg");
		return;
	}
	
	if(rightDiag<leftDiag){
		
		System.out.println("leftDiag has the the higer Avg");
		return;
	}
	
	
	if(rightDiag<leftDiag){
	System.out.println("both Diag are even");
		return;
	}
	
return;
}

public static void PrintMatrix(int Matrix[][])
{
	for (int i = 0; i < Matrix.length; i++) {
		for (int j = 0; j < Matrix[i].length; j++) 
			System.out.print(Matrix[i][j]+ "\t");
		System.out.println();
	
	
	}




}
/*public static int MatrixTransport(int Matrix[][]){
	
	int temp=0;

	for(int i=0; i<Matrix.length;i++)
		for(int j=0; j<Matrix[i].length; j++)
		{
			
			
			
			
		}


}*/






public static void main(String[] args) {
	
	Random Rand=new Random();
	Scanner In=new Scanner(System.in);
	
	System.out.println("Please enter the cubic matrix size:");
	int N=In.nextInt();
	
	
	int[][] Matrix=new int[N][N];
	
	for (int i = 0; i < Matrix.length; i++) 
		for (int j = 0; j < Matrix[i].length; j++) 
			Matrix[i][j]=Rand.nextInt(100*N);
			
	
	System.out.println();
	PrintMatrix(Matrix);
	System.out.println();
	MatrixMax(Matrix);		
	MatrixMin(Matrix);		
	MatrixMaxLine(Matrix);
	MatrixMaxCol(Matrix);
	MaxDiagonal(Matrix);
	
}








}
