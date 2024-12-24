package dec24;

import java.util.Scanner;

public class Matrix1 {

	public static void main(String[] args) {
	Scanner nn = new Scanner(System.in);
System.out.println("Enter no of Rows");
int s =nn.nextInt();
System.out.println("Enter no of Columns");
int c =nn.nextInt();

int[][]matrix= new int[s][c];
 
for(int rows=0;rows<s;rows++) {
	for(int columns =0;columns<s;columns++) {
		matrix[rows][columns]=nn.nextInt();
		}
}
for(int rows=0;rows<s;rows++) {
	for(int columns =0;columns<s;columns++) {
		System.out.print(matrix[rows][columns]+" ");
	
}
	System.out.println();
	}
	}

}