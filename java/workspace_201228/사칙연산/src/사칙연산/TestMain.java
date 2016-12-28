package 사칙연산;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("정수 1 : ");
		x = sc.nextInt();
		
		System.out.print("정수 2 : ");
		y = sc.nextInt();

		System.out.printf("%d + %d = %d\n", x,y,x+y);
		System.out.printf("%d - %d = %d\n", x,y,x-y);
		System.out.printf("%d * %d = %d\n", x,y,x*y);
		System.out.printf("%d / %d = %d\n", x,y,x/y);
		System.out.printf("%d %% %d = %d\n", x,y,x%y); // %를 쓰고싶을땐 %로 선언해주고 % 를 쓴다
	}

}
