package 성적처리;

import java.util.Scanner;

public class TestMain {
	final int MAX = 3;
	String []name = new String [MAX];
	String []idnum = new String [MAX]; // 수험번호에 문자가 들어올수도 있고 연산하는것이 아니기에 스트링
	int []write = new int[MAX]; // 필기
	int []word = new int[MAX];  // 워드
	int []ppt = new int[MAX];
	int []spread = new int[MAX];
	int []total = new int[MAX];
	String []grade = new String[MAX];
	int count = 0;    // 실제 읽은 갯수
	
	Scanner sc = new Scanner(System.in);
	
	void input(){
		for(int i=0; i<MAX; i++){
			System.out.print("수험번호 : ");
			idnum[i] = sc.nextLine();
			System.out.print("이름 : ");
			name[i] = sc.nextLine();
			System.out.print("필기 : ");
			write[i] = sc.nextInt();
			System.out.print("워드 : ");
			word[i] = sc.nextInt();
			System.out.print("프리젠테이션 : ");
			ppt[i] = sc.nextInt();
			System.out.print("스프레드쉬트 : ");
			spread[i] = sc.nextInt();
			sc.nextLine();
		}
		
	}
	void process()
	{
		for(int i=0; i<MAX; i++)
		{
			total[i] = write[i] + word[i] + ppt[i]+spread[i];
			switch( total[i]/200)
			{
			case 5:
			case 4:
				grade[i] = "A등급";
				break;
			case 3:
				grade[i] = "B등급";
				break;
			case 2:
				grade[i] = "C등급";
				break;
			default:
				grade[i] = "D등급, 재시험요망";
				break;

			}
		}
	}
	
	void output()
	{
		for(int i=0; i<MAX; i++)
		{
			System.out.print(idnum[i]+"\t");
			System.out.print(name[i]+"\t");
			System.out.print(write[i]+"\t");
			System.out.print(word[i]+"\t");
			System.out.print(ppt[i]+"\t");
			System.out.print(spread[i]+"\t");
			System.out.print(total[i]+"\t");
			System.out.print(grade[i]+"\n");
			
		}
	}
	
	public static void main(String[] args) {
		TestMain tm = new TestMain();
		tm.input();
		tm.process();
		tm.output();
	}
}

