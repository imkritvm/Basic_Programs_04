public class Main {
	public static void main(String[] args) {
		int[][] aryA = {
			{1, 4, 5},
			{1, 8, 9},
			{2, 9, 0}
		};
		int[][] aryB = {
			{9, 7, 2},
			{6, 1, 5},
			{0, 0, 1}
		};
		int[][] aryC = new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					aryC[i][j] += aryA[i][k]*aryB[k][j];
				}
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
					System.out.print(aryC[i][j]+" ");
			}
			System.out.println();
		}
	}
}