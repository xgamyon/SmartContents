package ����ó��_��ü����;

import java.util.Scanner;

public class ScoreManager {
	final int MAX=3;
	ScoreData []data = new ScoreData[MAX];
	Scanner sc = new Scanner(System.in);
	void input()
	{
		for(int i=0; i<MAX; i++)
		{
			data[i] = new ScoreData();
			
			System.out.print("�����ȣ ");
			data[i].setIdNum(sc.nextLine());
			System.out.print("�̸� ");
			data[i].setName(sc.nextLine());
			System.out.print("�ʱ� ");
			data[i].setWrite(sc.nextInt());
			System.out.print("���� ");
			data[i].setWord(sc.nextInt());
			System.out.print("���������̼� ");
			data[i].setPpt(sc.nextInt());
			System.out.print("�������彬Ʈ ");
			data[i].setSpread(sc.nextInt());
			data[i].calc();
			sc.nextLine();
		}
	}
	
	void output()
	{
		for(int i=0; i<MAX; i++)
		{
			System.out.print(data[i].getIdNum()+"\t");
			System.out.print(data[i].getName()+"\t");
			System.out.print(data[i].getWrite()+"\t");
			System.out.print(data[i].getWord()+"\t");
			System.out.print(data[i].getPpt()+"\t");
			System.out.print(data[i].getSpread()+"\t");
			System.out.print(data[i].getTotal()+"\t");
			System.out.print(data[i].getGrade()+"\n");			
		}
	}
}
