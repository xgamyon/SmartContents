package 상속2;

import java.util.ArrayList;
import java.util.List;

class Person
{
	String name;
	int age;
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name : " + name + " age : " + age;
	}
}


public class TestMain {
	//unchecked 경고와 rawtypes 경고 건너뛰어라 4
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		//컬렉션 클래스 - 컬렉션 
		List list = new ArrayList();
		
		//추상클래스 - 덜만든 클래스, 객체 생성 못함
		//           - 함수중에 몇개정도는 추상함수로 
		//             만들어서 메서드 헤더만 존재, 
		//             구현부분이 없음, 상속예정
		//             extends로 상속
		//인터페이스 - 아예 만들다 만 클래스, 객체 생성못함
		//           - 상수와 메서드 헤더만 존재한다 
		//            implements를 사용한다 
		
		
		list.add("장미");
		list.add("국화");
		list.add("카라");
		list.add("수국");
		list.add("아마릴리스");
	
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).toString());
		}
		
		
		List list2 = new ArrayList();
		//업캐스팅
		list2.add(new Person("A", 12));
		list2.add(new Person("B", 13));
		list2.add(new Person("C", 14));
		list2.add(new Person("D", 15));
		list2.add(new Person("E", 16));
		
		for(int i=0; i<list2.size(); i++)
		{
			//사용전에 다운캐스팅 
			Person temp = (Person)list2.get(i);
			System.out.println(temp.toString());
		}
		
		
		List<Person> list3 = new ArrayList<Person>();
		
		list3.add(new Person("A", 12));
		list3.add(new Person("B", 13));
		list3.add(new Person("C", 14));
		list3.add(new Person("D", 15));
		list3.add(new Person("E", 16));
		
		for(int i=0; i<list3.size(); i++)
		{
			System.out.println(list3.get(i));
		}
	}
}












