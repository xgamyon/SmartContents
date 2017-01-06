package �߱�����;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {
	//������ ������(�������)
	final int MAX=3;
	int []computer=new int[MAX];
	int []person = new int[MAX];
	int strikeCnt=0; //��Ʈ����ũ ���� ������ ���� 
	int ballCnt=0; //�� ���� ���� ���� 
	//������ �����ϸ� ��ǻ�Ͱ� ���� 3���� �����ϰ� ��� �迭�� �ִ��� �� �Լ�
	void initGame()
	{
		Random rand = new Random();
		for(int i=0; i<3; i++)
		{
			computer[i] = rand.nextInt(10); //0~9���� 
		}
	}
	
	//��ǻ�Ͱ� ������ ���ϰ�, ����� �Է��� �� ���ؼ� 
	//��Ʈ����ũ�� �� ���� ���� �Լ� 
	void checkValue()
	{
		strikeCnt=0; //�� �������� ������ �ʱ�ȭ - ���ϸ� �տ��� 
		ballCnt=0;   // ����� ���� ����
		
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
			System.out.println("���� ������ �Է��ϼ���");
			person[0] = sc.nextInt();
			person[1] = sc.nextInt();
			person[2] = sc.nextInt();
			
			checkValue(); //��ǻ���ϰ� �Է��Ѱ� ���ϱ� 
			if(strikeCnt==3)
			{
				System.out.println("������ϴ�.");
				break;
			}
			else
				System.out.printf("%d strike %d ball\n", strikeCnt,
						ballCnt);
		}
		sc.close();
		
	}
	
}
