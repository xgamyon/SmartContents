package while������;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		int i;
		
		//1���� 5���� ����ϱ� 
		/*
		 * �ʱⰪ-���ǽ��� true�� �Ǵ� ��Ȳ 
		 * while(���ǽ�) 
		 * {
		 *    ó�� ....
		 *    �������ٿ� ���ǽ��� ����� �ִ� ����
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
		
		/* ���� ���� �Է¹޾Ƽ� ��� �հ踦 ����
		 * ��, ���� ������ ������ while����
		 * �����ϰ� �� ����ϱ�  
		 */
		
		/*
		 * �а�
		 * while(���ǽ�) 
		 * {
		 *     ����̳� ó�� 
		 *     �а�
		 * }
		 */
		
		int number, sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����Է��ϱ�");
		number = sc.nextInt();
		while(number>0)
		{
			sum+=number;
			number = sc.nextInt();
		}
		
		System.out.println(sum);
		
	}
}
