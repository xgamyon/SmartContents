package 함수활용2;

public class TestMain {
	//함수에 배열 전달하기
	//배열의 원소들의 합계 구하기 
	int Sigma(int []arr)
	{
		int i;
		int s=0;  //arr.length-배열에 할당된 메모리 크기
		for(i=0; i<arr.length; i++)
		{
			s += arr[i];
		}
		return s;
	}
	
	public static void main(String[] args) {
		TestMain tm = new TestMain();
		int []num1=new int[]{1,2,3,4,5};
		int []num2=new int[]{3,4,5,6,7,8,9};
		
		System.out.println(tm.Sigma(num1));
		System.out.println(tm.Sigma(num2));
		
		int []a=new int[]{10,20,30};
		System.out.println(tm.Sigma(a));
		
		
	}
}
