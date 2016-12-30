package 짝수홀수판단하기;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("정수 : ");
		number = sc.nextInt();
		
		if(number %2 == 0){   // 2로 나눠서 나오는 나머지 수 
			System.out.print("짝수!");
		}else{
			System.out.print("홀수!");
		}
	}
}
