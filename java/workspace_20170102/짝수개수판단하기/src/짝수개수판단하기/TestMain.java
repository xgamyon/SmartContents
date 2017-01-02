package 짝수개수판단하기;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		int i; // 열번일하는지 확인할 변수
		int number; // 값 입력받는 변수
		int count; // 짝수 개수 카운트 변수

		Scanner sc = new Scanner(System.in);

		count = 0;
		for (i = 1; i <= 10; i++) {
			System.out.printf("정수 %d = ", i);
			number = sc.nextInt();
			if (number % 2 == 0) {
				count++;
			}
		}
		System.out.println("짝수의 개수 " + count);

	}
}
