import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args) {
		String name;
		String phone;
		String address;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이 름 : ");
		name = sc.nextLine();
		System.out.print("전 화 : ");
		phone = sc.nextLine();
		System.out.print("주 소 : ");
		address = sc.nextLine();
		
		// 역슬래쉬 + 문자 = 이스케이프 키(제어키)
		
		// \t - 탭키,  \n - 줄바꿈 기호
		System.out.print(name + "\t");
		System.out.print(phone + "\t");
		System.out.print(address + "\n");
						
	}
}
