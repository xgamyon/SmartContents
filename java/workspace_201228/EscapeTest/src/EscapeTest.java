
public class EscapeTest {

	public static void main(String[] args) {

		System.out.println("\"Hello\"");
		// "" �� ����ϰ� ������ ���������� �̿��ؼ� �����.
		// \"  -> "�� ����϶�
		System.out.println("�������� ����ϱ� \\");
		
		System.out.println("100%");
		
		/* �ڹ� 1.5���� �߰��� ����Լ��� ����
		   printf �Լ� ����ϱ�
		   
		   %d - decimal (10����)
		   %s - string (string(����))
		   %f - �Ǽ�
		   %lf - double
		   %x - 16���� ���·� ���
		   %o - 8���� ���·� ���
		 */
		System.out.printf("%d %x %o\n", 16, 16, 16);   // \n �� �ٹٲ�, ln�� ����.
		System.out.printf("%d %x %o\n", 15, 15, 15);
		System.out.printf("%d %s", 23, "���ڿ�");
		
		//�ڸ��� ������ �����ϴ�.
		System.out.print(10);
		System.out.print(20);
		System.out.println();  // �ٹٲ�
		
		System.out.printf("%d %d\n", 10, 20);
		System.out.printf("%10d %d\n", 10, 20);  // 10 ������ �������� ����������
		System.out.printf("%-10d %-10d\n", 10, 20); // 10 ������ �������� ��������

	}

}