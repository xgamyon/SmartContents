package ¦��Ȧ����ձ��ϱ�;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i; // ���� �ݺ��϶�� ������ ���� ���ֱ�
		int number; // ���� ���� ����
		int even_sum, even_cnt; //¦����, ¦������
		int odd_sum, odd_cnt; // Ȧ����, Ȧ������
		
		even_sum=0; even_cnt=0;
		odd_sum=0; odd_cnt=0;
		for(i=1; i<=10; i++)
		{
			System.out.printf("���� %d : ", i);
			number = sc.nextInt();
			if( number %2 ==0) //¦���� ��� 
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
			System.out.println("¦�� �Ѱ��� ����");
		else
			System.out.println("¦�� : " + 
		                   even_sum/even_cnt);
		
		if( odd_cnt ==0)
			System.out.println("Ȧ�� �Ѱ��� ����");
		else
			System.out.println("Ȧ�� : " +
		                  odd_sum/odd_cnt);
	}
}