import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		for(int i=0; i<r;i++){
			for(int j=0;j<c;j++){
				matrix[i][j] = sc.nextInt();
				}
			}
	    for(int j=0; j<c;j++){
			for(int i=0;i<r;i++){
				System.out.print(matrix[i][j]+" ");
				}
			System.out.println();
			}
	}
}