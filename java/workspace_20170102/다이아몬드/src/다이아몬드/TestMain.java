package ���̾Ƹ��;

public class TestMain {

	public static void main(String[] args) {
		int i, j;
		int line=10;
		
		for(i=1; i<=line; i++)
		{
			//������� �׸��� 
			for(j=1; j<=line-i; j++)
				System.out.print(" ");
			//�� ����ֱ� 
			for(j=1; j<=2*i-1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
