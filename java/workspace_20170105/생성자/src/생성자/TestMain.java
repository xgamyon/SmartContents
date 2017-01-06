package 생성자;

class Student
{
	String name;
	int kor;
	int eng;
	int mat;
	int total;
	//생성자 
	//디폴트생성자 : 디폴트(기본) 
	public Student() //생성자 함수앞에 public 이나 private말고
	{                //아무것도 못붙인다 
		name = "홍길동";
		kor=0;
		eng=0;
		mat=0;
		System.out.println("생성자 호출하기 ");
	}
	
	public Student(String n)
	{
		name = n;
		kor=0;
		eng=0;
		mat=0;
		System.out.println("매개변수 하나짜리 호출하기 ");
	}
	
	public Student(String n, int k, int e, int m)
	{
		name = n;
		kor=k;
		eng=e;
		mat=m;
		System.out.println("매개변수 세개 짜리 호출하기 ");
	}
}

public class TestMain {
	public static void main(String[] args) {
		//생성자 - 객체 생성시 자동으로 호출되는 메서드 
		/*
		 * 1. 생성자는 객체가 생성될때 자동으로 호출되는 메서드이다 
		 * 2. 변수의 초기화나, 자원배분등의 준비작업을 위한 메서드이다 
		 * 3. 생성자는 반환형을 쓸 수 없다. 메서드 이름앞에 접근 제한자
		 *    말고는 아무것도 못 붙인다 
		 *    int 나 void 이런거 못 붙임 X
		 * 4. public 접근 제한으로 해야 객체가 생성된다 
		 * 5. 매개변수를 줄 수 있어서 동일한 이름으로 여러개 만들 수 있다
		 * 6. 시스템이 호출하기 때문에 이름을 마음대로 못붙인다. 
		 *    이름은 언제나 클래스명과 동일해야 한다 
		 */
		
		//객체 생성하기 
		Student st = new Student();
		System.out.println(st.name);
		
		Student st2 = new Student("박근혜");
		System.out.println(st2.name);
		
		Student st3 = new Student("최순실", 20, 30, 40);
		System.out.println(st3.name);
		System.out.println(st3.kor);
		System.out.println(st3.eng);
		System.out.println(st3.mat);
		
		
	}
}












