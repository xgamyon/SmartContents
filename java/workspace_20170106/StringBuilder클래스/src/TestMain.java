
public class TestMain {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(); //���ڸ� ��� �����϶� ����.
		String  s = new String();
		int i;
		s = "flower";
		
		sb.append("flower");
		sb.setCharAt(0, 'F');
		sb.insert(2,  'K');
		sb.delete(3, 4);
		
		System.out.println(s);
		System.out.println(sb);
		
		/*System.out.println("����");
		for(i=1; i<=1000; i++)
		{
			s = s+i;
		}
		System.out.println(s);
		
		System.out.println("����");
		for(i=1; i<=1000; i++)
		{
			sb.append(i);
		}
		System.out.println(sb);
		*/
		
	}
}
