package 성적처리_객체지향;

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
			
			System.out.print("수험번호 ");
			data[i].setIdNum(sc.nextLine());
			System.out.print("이름 ");
			data[i].setName(sc.nextLine());
			System.out.print("필기 ");
			data[i].setWrite(sc.nextInt());
			System.out.print("워드 ");
			data[i].setWord(sc.nextInt());
			System.out.print("프리젠테이션 ");
			data[i].setPpt(sc.nextInt());
			System.out.print("스프레드쉬트 ");
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
