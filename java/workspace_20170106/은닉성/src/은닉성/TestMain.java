package 은닉성;

public class TestMain {
	public static void main(String[] args) {
		//객체 배열 
		
		Student []st=new Student[2];
		//객체가 만들어지는게 아니라 객체 주소를 저장할 변수 두개 만들고 끝
		//클래스도 참조고, 배열도 참조고, 객체배열은 참조의 참조다 
		
		st[0] = new Student();
		st[0].setName("김재동");
		
		st[1] = new Student();
		st[1].setName("유시민");
		
	}
}
