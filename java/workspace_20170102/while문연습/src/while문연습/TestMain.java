package while문연습;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		int i;
		
		//1부터 5까지 출력하기 
		/*
		 * 초기값-조건식이 true가 되는 상황 
		 * while(조건식) 
		 * {
		 *    처리 ....
		 *    마지막줄에 조건식을 벗어날수 있는 수식
		 * }
		 */
		i=1;
		while(i<=5)
		{
			System.out.println(i);
			i = i + 1;
		}
		
		i=3;
		while(i<=30)
		{
			System.out.println(i);
			i = i + 3;
		}
		
		i=1;
		while(i<=10)
		{
			System.out.println(i*3);
			i = i + 1;
		}
		
		/* 양의 정수 입력받아서 계속 합계를 구하
		 * 기, 음의 정수가 들어오면 while문을
		 * 종료하고 합 출력하기  
		 */
		
		/*
		 * 읽고
		 * while(조건식) 
		 * {
		 *     계산이나 처리 
		 *     읽고
		 * }
		 */
		
		int number, sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력하기");
		number = sc.nextInt();
		while(number>0)
		{
			sum+=number;
			number = sc.nextInt();
		}
		
		System.out.println(sum);
		
	}
}
