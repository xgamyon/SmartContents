package 짝수홀수평균구하기;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i; // 열번 반복하라고 옆에서 숫자 세주기
		int number; // 숫자 읽을 변수
		int even_sum, even_cnt; //짝수합, 짝수개수
		int odd_sum, odd_cnt; // 홀수합, 홀수개수
		
		even_sum=0; even_cnt=0;
		odd_sum=0; odd_cnt=0;
		for(i=1; i<=10; i++)
		{
			System.out.printf("정수 %d : ", i);
			number = sc.nextInt();
			if( number %2 ==0) //짝수의 경우 
			{
				even_sum+=number;
				even_cnt++;
			}
			else
			{
				odd_sum+=number;
				odd_cnt++;
			}
		}
		
		if( even_cnt ==0)
			System.out.println("짝수 한개도 없음");
		else
			System.out.println("짝수 : " + 
		                   even_sum/even_cnt);
		
		if( odd_cnt ==0)
			System.out.println("홀수 한개도 없음");
		else
			System.out.println("홀수 : " +
		                  odd_sum/odd_cnt);
	}
}