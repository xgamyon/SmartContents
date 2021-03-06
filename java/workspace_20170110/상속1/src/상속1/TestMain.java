package 상속1;

class Parent
{
	private int x;
	protected int y;
	public int z;
	//부모클래스에서 물려받은 변수나 함수가 맘에 안들면
	//다시 정의할 수 있다 overriding 
	/*
	 * overloading : 동일 클래스내에서 이름이 같고 형태가
	 *               다른 함수들   
	 * overriding  : 상속관계에서 부모 클래스의 메서드를 
	 *               다시 정의한것
	 *               
	 * 어노테이션 : 일종의 주석, @로 시작한다 
	 *             자바가 컴파일할때 특정한 지시를 하고자
	 *             할때 사용한다. 직접 어노테이션을 
	 *             자바클래스를 이용해 만들어 쓸 수도
	 *             있다 무시하면 안됨, 때로는 전체 
	 *             소스에 영향을 미치는 경우도 많음
	 *             자바 1.5부터 도입되었음 
	 *           @Override - 부모클래스로부터 물려받은
	 *           함수(메서드)를 재정의 할때 필요하다
	 *           없어도 되는데 이걸 붙여야 하는 이유는
	 *           부모 클래스의 메서드와 똑같은 이름 
	 *           똑같은 타입, 매개변수 즉 형태가 똑같아야
	 *           overriding 인데 잘못 만들어도 컴파일러가
	 *           알수가 없다. 그래서 @Override를 붙여주면
	 *           개발자가 오버라이딩을 잘못 했을때 
	 *           이를 알려준다 
	 *           
	 */
	
	//오버라이딩이 자바 1.4 이전 버전에서는 
	//컴파일단계에서 오류가 났음을 알 수 없다 
	//그래서 1.5부터 컴파일단계에서 오류를 알려주기 
	//위해 만든것이  @Override 이다 
	
	@Override
	public String toString() {
		System.out.println("@@@@@@@@@@@@@@");
		//super - 자기 부모
		//this - 나 
		//return super.toString();
		//String.format 함수는 문자 숫자등 다양한 
		//데이타를 합쳐서 String 으로 만들어준다 
		//System.out.printf 함수와 사용법이 유사하다 
		return String.format("x=%d y=%d z=%d", x,y,z);
	}
	
	public Parent()
	{
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	//넬 데일(c++프로그래밍 바이블), 허버트 슈미트
	//생초보 - 윤성우, 김상형, 이이표, 김선우(진짜 어려움)
	
	public Parent(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("******");
		Parent temp = (Parent)obj;
		if( temp.x==this.x && temp.y==this.y 
				&&temp.z == this.z)
			return true;
		else
			return false;
	}
}

public class TestMain {
	public static void main(String[] args) {
		Parent p = new Parent();
		String s="";
		Object ob = new Object();
		
	//	p.x = 10;
		p.y = 20; 
		p.z = 30;
		
		System.out.println(p);
		System.out.println(p.toString());
		
		//업캐스팅 - 자식형이 부모형으로 전환되는 형전환
		ob = p;//Parent 타입이 Object 타입으로 전환됨 
		       //아래에서 위로 올라가는 형전환 언제나 허용
		
		//다운캐스팅 -부모형이 자식형으로 전환되는 형전환
		p = (Parent)ob; //이건 원칙이 오류상황 
		
		//객체의 값이 같은지 비교를 하려고 한다 
		
		Parent p1 = new Parent(1,2,3);
		Parent p2 = new Parent(1,2,3);
		//p1이 가리키는 객체와 p2가 가리키는 객체가 
		//같으냐? 
		if( p1 == p2 )
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
		
		if(p1.equals(p2))
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
	}
}






