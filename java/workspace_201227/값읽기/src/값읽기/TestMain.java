package 값읽기;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) { // main  쓰고 컨트롤 + 스페이스
		//입력받기
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("정수: ");
		//ln이 없으니 줄바꿈이 없음
		a = sc.nextInt();
		System.out.println(a);
		//ln 함수를 덧붙이면 줄바꿈
	}
}
