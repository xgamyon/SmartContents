package ��Ģ����;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("���� 1 : ");
		x = sc.nextInt();
		
		System.out.print("���� 2 : ");
		y = sc.nextInt();

		System.out.printf("%d + %d = %d\n", x,y,x+y);
		System.out.printf("%d - %d = %d\n", x,y,x-y);
		System.out.printf("%d * %d = %d\n", x,y,x*y);
		System.out.printf("%d / %d = %d\n", x,y,x/y);
		System.out.printf("%d %% %d = %d\n", x,y,x%y); // %�� ��������� %�� �������ְ� % �� ����
	}

}
