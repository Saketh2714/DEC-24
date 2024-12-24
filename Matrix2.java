package dec24;

public class Matrix2 {

	public static void main(String[] args) {
int[][] mat= {
		{1,2,3,4,5},
		{6,7,8,9,10},
		{11,12,13,15},
};
for(int rows=0;rows<3;rows++) {
	for(int cols=0;cols<mat[rows].length;cols++) {
		System.out.print(mat[rows][cols]+" ");
	}
	System.out.println();
}
	}

}
