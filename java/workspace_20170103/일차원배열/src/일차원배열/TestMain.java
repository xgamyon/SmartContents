package 일차원배열;

public class TestMain {
	public static void main(String[] args) {
		int []arr;   // 배열선언
		
		arr = new int[5]; // 배열 생성
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		for(int i=0; i<5; i++){
			arr[i] = (i+1);
			// 입력
		}
		for(int i=0; i<5; i++){
			System.out.println(arr[i]);
			// 출력
			// 입력과 출력을 같이 쓰는것은 바람직하지 못하다.
		}
	}
}
