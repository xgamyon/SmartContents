package 사차원배열;

public class TestMain {
	public static void main(String[] args) {
		int [][]arr; // 배열의 배열
		
		arr = new int[3][4]; // 3X4 가 만들어진다.
		
		int i, j, k;
		
		k=1;
		for(i=0; i<3; i++){
			for(j=0; j<4; j++){
				arr[i][j] = k++;
			}
		}
		
		for(i=0; i<3; i++){
			for(j=0; j<4; j++){
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
		
		arr[0][0] = 10;
		System.out.println(arr[0][0]);
		
	}
}
