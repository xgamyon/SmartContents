package �Լ�Ȱ��2;

public class TestMain {
	//�Լ��� �迭 �����ϱ�
	//�迭�� ���ҵ��� �հ� ���ϱ� 
	int Sigma(int []arr)
	{
		int i;
		int s=0;  //arr.length-�迭�� �Ҵ�� �޸� ũ��
		for(i=0; i<arr.length; i++)
		{
			s += arr[i];
		}
		return s;
	}
	
	public static void main(String[] args) {
		TestMain tm = new TestMain();
		int []num1=new int[]{1,2,3,4,5};
		int []num2=new int[]{3,4,5,6,7,8,9};
		
		System.out.println(tm.Sigma(num1));
		System.out.println(tm.Sigma(num2));
		
		int []a=new int[]{10,20,30};
		System.out.println(tm.Sigma(a));
		
		
	}
}
