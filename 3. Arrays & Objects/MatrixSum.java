package array_and_objects;
public class MatrixSum{
	public static void main(String[] args){
		
		int matrix1[][] = new int[3][2];
		matrix1[0][0] = 12;
		matrix1[0][1] = 18; 
		matrix1[1][0] = 15; 
		matrix1[1][1] = 17; 
		matrix1[2][0] = 11; 
		matrix1[2][1] = 25;

		int[][] matrix2 = {
										{1,2},
										{2,3},
										{1,4}
									}; 
		
		int sum[][] = new int[3][2];
									
		for(int i=0; i<matrix1.length; i++){
			for(int j=0; j<matrix1[i].length; j++){
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println("\nMatrix 1:");
		for(int m1[] : matrix1){
			for(int temp : m1){
				System.out.print(temp+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nMatrix 2:");
		for(int m2[] : matrix2){
			for(int temp : m2){
				System.out.print(temp+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nSum of Two Matrix:");
		for(int mSum[] : sum){
			for(int temp : mSum){
				System.out.print(temp+" ");
			}
			System.out.println();
		}
	}
}