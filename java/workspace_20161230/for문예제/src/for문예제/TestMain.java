package for������;

public class TestMain {
	public static void main(String[] args) {
		int i;
		
		System.out.print("1~10���� ��� \n");
		for(i=1; i<=10; i++){
			System.out.print(i);
		}
		
		System.out.println();
		System.out.print("1~10���� ¦���� ��� \n");
		for(i=2; i<=10; i=i+2){  //i+=2
			System.out.print(i);
		}
		
		System.out.println();
		System.out.print("1~10���� Ȧ���� ��� \n");
		for(i=1; i<=10; i=i+2){  //i+=2
			System.out.print(i);
		}
		
		System.out.println();
		System.out.println();
		
		
		// A~Z
		for(i=0; i<26; i++){  //i+=2
			System.out.print((char)('a'+i));   //(char) �� ����
		}
		
		System.out.println();
		for(i='A'; i<'Z'; i++){  //i+=2
			System.out.print((char)i);   //(char) �� ������������ �ν��ϰ� �Ѵ�
		}
		
		System.out.println();
		System.out.println();
		
		
		for(i=1; i<=100; i++){  //i+=2
			System.out.printf("%4d",i);   // %3d �� 3�ڸ��� �������� ���缭 ����ϰ� �Ѵ�. (%�ڸ���d)
			if(i%10 == 0){  // 10���� ������ �ڸ�
				System.out.println();
			}
		}
		
		System.out.println();
		
		System.out.println("100~10���� -10�� �ؼ� ���");
		for(i=100; i>0; i=i-10){
			System.out.printf("%3d",i);
		}
	}
}
