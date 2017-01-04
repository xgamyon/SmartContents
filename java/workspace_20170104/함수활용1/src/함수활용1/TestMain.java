package 함수활용1;

public class TestMain {
	//1~N 까지의 합계를 구하는 함수 
	void Sigma(int n)
	{
		int i, s;
		//함수안에 선언되는 변수는 함수안에만 존재-지역변수
		s=0;
		for(i=1; i<=n; i++)
		{
			s+=i;
		}
		
		System.out.println("합계 : " + s);
	}
	
	int Sigma2(int n)
	{
		int i, s; //지역변수 
		
		s=0;
		for(i=1; i<=n; i++)
		{
			s+=i;
		}
		return s;
	}
	
	public static void main(String[] args) {
		//객체 만들기 
		TestMain tm = new TestMain();
		tm.Sigma(100); //객체를 이용해 함수를 호출한다 
		
	}
	
}





