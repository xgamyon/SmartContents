package 거스름돈구하기;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		/*
		 * 1.입력 : 거슬러줘야 할 금액
		   2.결과 : 50000원 10000원, 5000원, 1000원, 
		  		   500원, 100원, 50원, 10원 의 갯수
		 */
		
		//1.변수 선언
		int inputMoney;
		int m50000, m10000, m5000, m1000, m100, m50, m10;
		
		//2.입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("거스름돈 : ");
		inputMoney = sc.nextInt();
		
		m50000 = inputMoney/50000;
		inputMoney = inputMoney%50000;
		
		m10000 = inputMoney/10000;
		inputMoney = inputMoney%10000;
		
		m5000 = inputMoney/5000;
		inputMoney = inputMoney%5000;
		
		m1000 = inputMoney/1000;
		inputMoney = inputMoney%1000;
		
		m100 = inputMoney/100;
		inputMoney = inputMoney%100;
		
		m10 = inputMoney/10;
		inputMoney = inputMoney%10;
		
		System.out.println("오만원 "+ m50000 + " 장");
		System.out.println(" 만원 "+ m10000 + " 장");
		System.out.println("오천원 "+ m5000 + " 장");
		System.out.println(" 천원 "+ m1000 + " 장");
		System.out.println(" 백원 "+ m100 + " 개");
		System.out.println(" 십원 "+ m10 + " 개");

	}

}
