package ����ճ���;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr;
		int i;
		double avg;
		
		arr = new int[10];
		
		//1.�Է�
		for(i=0; i<10; i++)
		{
			System.out.printf("����[%d] : ", i+1);
			arr[i] = sc.nextInt();
		}
		
		//2.��հ�� 
		int sum=0;
		for(i=0; i<10; i++)
		{
			sum += arr[i];
		}
		avg = sum/10.0;
		
		//3.����ϱ� 
		for(i=0; i<10; i++)
		{
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();
		System.out.printf("��� : %.2f\n", avg);
		
	}
}



