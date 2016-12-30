package for문예제;

public class TestMain {
	public static void main(String[] args) {
		int i;
		
		System.out.print("1~10까지 출력 \n");
		for(i=1; i<=10; i++){
			System.out.print(i);
		}
		
		System.out.println();
		System.out.print("1~10까지 짝수만 출력 \n");
		for(i=2; i<=10; i=i+2){  //i+=2
			System.out.print(i);
		}
		
		System.out.println();
		System.out.print("1~10까지 홀수만 출력 \n");
		for(i=1; i<=10; i=i+2){  //i+=2
			System.out.print(i);
		}
		
		System.out.println();
		System.out.println();
		
		
		// A~Z
		for(i=0; i<26; i++){  //i+=2
			System.out.print((char)('a'+i));   //(char) 은 문자
		}
		
		System.out.println();
		for(i='A'; i<'Z'; i++){  //i+=2
			System.out.print((char)i);   //(char) 은 문자형식으로 인식하게 한다
		}
		
		System.out.println();
		System.out.println();
		
		
		for(i=1; i<=100; i++){  //i+=2
			System.out.printf("%4d",i);   // %3d 는 3자릿수 기준으로 맞춰서 출력하게 한다. (%자릿수d)
			if(i%10 == 0){  // 10으로 나머지 자리
				System.out.println();
			}
		}
		
		System.out.println();
		
		System.out.println("100~10까지 -10씩 해서 출력");
		for(i=100; i>0; i=i-10){
			System.out.printf("%3d",i);
		}
	}
}
