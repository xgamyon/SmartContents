package ������;

class Student
{
	String name;
	int kor;
	int eng;
	int mat;
	int total;
	//������ 
	//����Ʈ������ : ����Ʈ(�⺻) 
	public Student() //������ �Լ��տ� public �̳� private����
	{                //�ƹ��͵� �����δ� 
		name = "ȫ�浿";
		kor=0;
		eng=0;
		mat=0;
		System.out.println("������ ȣ���ϱ� ");
	}
	
	public Student(String n)
	{
		name = n;
		kor=0;
		eng=0;
		mat=0;
		System.out.println("�Ű����� �ϳ�¥�� ȣ���ϱ� ");
	}
	
	public Student(String n, int k, int e, int m)
	{
		name = n;
		kor=k;
		eng=e;
		mat=m;
		System.out.println("�Ű����� ���� ¥�� ȣ���ϱ� ");
	}
}

public class TestMain {
	public static void main(String[] args) {
		//������ - ��ü ������ �ڵ����� ȣ��Ǵ� �޼��� 
		/*
		 * 1. �����ڴ� ��ü�� �����ɶ� �ڵ����� ȣ��Ǵ� �޼����̴� 
		 * 2. ������ �ʱ�ȭ��, �ڿ���е��� �غ��۾��� ���� �޼����̴� 
		 * 3. �����ڴ� ��ȯ���� �� �� ����. �޼��� �̸��տ� ���� ������
		 *    ����� �ƹ��͵� �� ���δ� 
		 *    int �� void �̷��� �� ���� X
		 * 4. public ���� �������� �ؾ� ��ü�� �����ȴ� 
		 * 5. �Ű������� �� �� �־ ������ �̸����� ������ ���� �� �ִ�
		 * 6. �ý����� ȣ���ϱ� ������ �̸��� ������� �����δ�. 
		 *    �̸��� ������ Ŭ������� �����ؾ� �Ѵ� 
		 */
		
		//��ü �����ϱ� 
		Student st = new Student();
		System.out.println(st.name);
		
		Student st2 = new Student("�ڱ���");
		System.out.println(st2.name);
		
		Student st3 = new Student("�ּ���", 20, 30, 40);
		System.out.println(st3.name);
		System.out.println(st3.kor);
		System.out.println(st3.eng);
		System.out.println(st3.mat);
		
		
	}
}












