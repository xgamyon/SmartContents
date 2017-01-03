package 선형검색;

public class TestMain {
	public static void main(String[] args) {
		int []arr=new int[]{10, 20, 30, 40, 50, 
				            55, 66, 77, 88, 99};
		//배열의 초기값 주기 
		int i;
		int key=777; //찾을 값 갖고 있는 변수 
		boolean find;
		
		find = false; //처음에 못찾음 
		for(i=0; i<10; i++)
		{
			if(arr[i]==key)
			{
				find=true;
				break;
			}
		}
		if( find )  // if(find==true) 
		{
			System.out.println(i + "번째 위치");
		}
		else
		{
			System.out.println("찾을 수 없습니다");
		}
	}
}



