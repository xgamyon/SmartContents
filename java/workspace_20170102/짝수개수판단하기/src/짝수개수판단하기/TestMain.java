package ¦�������Ǵ��ϱ�;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		int i; // �������ϴ��� Ȯ���� ����
		int number; // �� �Է¹޴� ����
		int count; // ¦�� ���� ī��Ʈ ����

		Scanner sc = new Scanner(System.in);

		count = 0;
		for (i = 1; i <= 10; i++) {
			System.out.printf("���� %d = ", i);
			number = sc.nextInt();
			if (number % 2 == 0) {
				count++;
			}
		}
		System.out.println("¦���� ���� " + count);

	}
}
