import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args) {
		String name;
		String phone;
		String address;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �� : ");
		name = sc.nextLine();
		System.out.print("�� ȭ : ");
		phone = sc.nextLine();
		System.out.print("�� �� : ");
		address = sc.nextLine();
		
		// �������� + ���� = �̽������� Ű(����Ű)
		
		// \t - ��Ű,  \n - �ٹٲ� ��ȣ
		System.out.print(name + "\t");
		System.out.print(phone + "\t");
		System.out.print(address + "\n");
						
	}
}
