package �Լ�Ȱ��1;

public class TestMain {
	//1~N ������ �հ踦 ���ϴ� �Լ� 
	void Sigma(int n)
	{
		int i, s;
		//�Լ��ȿ� ����Ǵ� ������ �Լ��ȿ��� ����-��������
		s=0;
		for(i=1; i<=n; i++)
		{
			s+=i;
		}
		
		System.out.println("�հ� : " + s);
	}
	
	int Sigma2(int n)
	{
		int i, s; //�������� 
		
		s=0;
		for(i=1; i<=n; i++)
		{
			s+=i;
		}
		return s;
	}
	
	public static void main(String[] args) {
		//��ü ����� 
		TestMain tm = new TestMain();
		tm.Sigma(100); //��ü�� �̿��� �Լ��� ȣ���Ѵ� 
		
	}
	
}





