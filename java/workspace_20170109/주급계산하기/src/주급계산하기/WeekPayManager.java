package �ֱް���ϱ�;

import java.util.Scanner;

public class WeekPayManager {
	final int MAX =3;
	WeekPayData []data = new WeekPayData[MAX];
	//��ü�� �� �游 3�� �������
	//���� ��ü�� �ȸ������ 
	int count=0;
	Scanner sc = new Scanner(System.in);
	
	public void append()
	{
		int i=count; //ó���� 0���� �����Ѵ� 
		String again; //������� ����� 
		do
		{
			data[i] = new WeekPayData(); 
			System.out.print("�̸� : ");
			data[i].setName(sc.nextLine());
			System.out.print("�ٹ��ð� : ");
			data[i].setWork_time(sc.nextInt());
			System.out.print("�ð��� �޿��� : ");
			data[i].setHour_pay(sc.nextInt());
			
			i++;
			if( i>=MAX)
			{
				System.out.println("�޸� �ʰ�");
				break; //do�� ���� 
			}
			
			System.out.print("���?(1.��/0.�ƴϿ�) ");
			sc.nextLine(); //int ���� float�а��� 
			again = sc.nextLine();
		}while(again.equals("1"));
		
		count = i;//���� ����Ÿ ���� �����ϱ� 
	}
	
	void process()
	{
		for(int i=0; i<count; i++)
		{
			//�⺻��
			data[i].setBase_pay(data[i].getHour_pay()
					* data[i].getWork_time());
			//System.out.println(data[i].getBase_pay());
			
			//�ʰ�����
			data[i].setOver_pay(0);
			if( data[i].getWork_time()>40)
			{
				int overPay=0;
				overPay = (data[i].getWork_time()-40)
						* data[i].getHour_pay()/2;
				data[i].setOver_pay(overPay);
			}
			
			//����   �⺻��+ �ʰ����� 
			
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
		System.out.print("�̸�\t");
		System.out.print("�ٹ��ð�\t");
		System.out.print("�ð���\t");
		System.out.print("�⺻�ݾ�\t");
		System.out.print("�ʰ�����\t");
		System.out.print("����\t");
		System.out.print("�Ǽ��ɾ�\n");
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
