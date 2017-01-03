package 자바랜덤값얻기;

import java.util.Random;

public class TestMain {
	public static void main(String[] args) {
		Random random = new Random();
		
		System.out.println(random.nextInt());
		
		for(int i=1; i<=10; i++){
			System.out.println(random.nextInt(3)+1);
			
			// 1~10의 범위를 갖는 6개 숫자를 출력
		}
	}
}
