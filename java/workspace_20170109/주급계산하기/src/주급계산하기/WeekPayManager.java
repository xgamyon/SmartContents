package 주급계산하기;

import java.util.Scanner;

public class WeekPayManager {
	final int MAX =3;
	WeekPayData []data = new WeekPayData[MAX];
	//객체가 들어갈 방만 3개 만들었음
	//아직 객체는 안만들어짐 
	int count=0;
	Scanner sc = new Scanner(System.in);
	
	public void append()
	{
		int i=count; //처음에 0부터 시작한다 
		String again; //계속할지 물어본다 
		do
		{
			data[i] = new WeekPayData(); 
			System.out.print("이름 : ");
			data[i].setName(sc.nextLine());
			System.out.print("근무시간 : ");
			data[i].setWork_time(sc.nextInt());
			System.out.print("시간당 급여액 : ");
			data[i].setHour_pay(sc.nextInt());
			
			i++;
			if( i>=MAX)
			{
				System.out.println("메모리 초과");
				break; //do문 종료 
			}
			
			System.out.print("계속?(1.네/0.아니오) ");
			sc.nextLine(); //int 값이 float읽고나서 
			again = sc.nextLine();
		}while(again.equals("1"));
		
		count = i;//현재 데이타 개수 저장하기 
	}
	
	void process()
	{
		for(int i=0; i<count; i++)
		{
			//기본급
			data[i].setBase_pay(data[i].getHour_pay()
					* data[i].getWork_time());
			//System.out.println(data[i].getBase_pay());
			
			//초과수당
			data[i].setOver_pay(0);
			if( data[i].getWork_time()>40)
			{
				int overPay=0;
				overPay = (data[i].getWork_time()-40)
						* data[i].getHour_pay()/2;
				data[i].setOver_pay(overPay);
			}
			
			//세금   기본급+ 초과수당 
			
			data[i].setTotal_pay(data[i].getBase_pay()
					+ data[i].getOver_pay());
			
			double tax;
			if( data[i].getTotal_pay()>400000)
				tax = 0.044;
			else if(data[i].getTotal_pay()>300000)
				tax = 0.033;
			else
				tax = 0.022;
			
			data[i].setTax(data[i].getTotal_pay()*tax);
			data[i].setReal_pay(data[i].getTotal_pay()-
					data[i].getTax());
			
		}
	}
	
	void output()
	{
		System.out.println("--------------------------------------------------------");
		System.out.print("이름\t");
		System.out.print("근무시간\t");
		System.out.print("시간당\t");
		System.out.print("기본금액\t");
		System.out.print("초과수당\t");
		System.out.print("세금\t");
		System.out.print("실수령액\n");
		System.out.println("--------------------------------------------------------");
		
		for(int i=0; i<count; i++)
		{
			System.out.print(data[i].getName()+"\t");
			System.out.print(data[i].getWork_time()+"\t");
			System.out.print(data[i].getHour_pay()+"\t");
			System.out.print(data[i].getBase_pay()+"\t");
			System.out.print(data[i].getOver_pay()+"\t");
			System.out.print(data[i].getTax()+"\t");
			System.out.print(data[i].getReal_pay()+"\n");
		}
		System.out.println("--------------------------------------------------------");
	}
}
