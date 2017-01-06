package 야구게임;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {
	//공통의 변수들(멤버변수)
	final int MAX=3;
	int []computer=new int[MAX];
	int []person = new int[MAX];
	int strikeCnt=0; //스트라이크 개수 저장할 변수 
	int ballCnt=0; //볼 개수 저장 변수 
	//게임을 시작하면 컴퓨터가 숫자 3개를 랜덤하게 골라 배열에 넣는일 할 함수
	void initGame()
	{
		Random rand = new Random();
		for(int i=0; i<3; i++)
		{
			computer[i] = rand.nextInt(10); //0~9까지 
		}
	}
	
	//컴퓨터가 생각한 값하고, 사람이 입력한 값 비교해서 
	//스트라이크나 볼 개수 구할 함수 
	void checkValue()
	{
		strikeCnt=0; //비교 시작전에 변수값 초기화 - 안하면 앞에서 
		ballCnt=0;   // 썼던값 남아 있음
		
		if(computer[0]==person[0])
		{
			strikeCnt++;
		}
		else if( computer[0]==person[1])
		{
			ballCnt++;
		}
		else if( computer[0]==person[2])
		{
			ballCnt++;
		}
		
		if(computer[1]==person[0])
		{
			ballCnt++; 
		}
		else if( computer[1]==person[1])
		{
			strikeCnt++;
		}
		else if( computer[1]==person[2])
		{
			ballCnt++;
		}
		

		if(computer[2]==person[0])
		{
			ballCnt++; 
		}
		else if( computer[2]==person[1])
		{
			ballCnt++;
		}
		else if( computer[2]==person[2])
		{
			strikeCnt++;
		}
		
	}
	
	public void start()
	{
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		initGame(); 
		for(i=1; i<=10; i++)
		{
			System.out.println("숫자 세개를 입력하세요");
			person[0] = sc.nextInt();
			person[1] = sc.nextInt();
			person[2] = sc.nextInt();
			
			checkValue(); //컴퓨터하고 입력한값 비교하기 
			if(strikeCnt==3)
			{
				System.out.println("맞췄습니다.");
				break;
			}
			else
				System.out.printf("%d strike %d ball\n", strikeCnt,
						ballCnt);
		}
		sc.close();
		
	}
	
}
