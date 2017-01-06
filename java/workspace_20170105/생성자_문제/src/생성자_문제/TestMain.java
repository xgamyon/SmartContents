package 생성자_문제;
class Position
{
	int x;
	int y;
	public Position()
	{
		x=0;
		y=0;
	}
	public Position(int a, int b)
	{
		x=a;
		y=b;
	}
	public Position(int a)
	{
		x=a;
		y=a;
	}
}

public class TestMain {
	public static void main(String[] args) {
		Position pos = new Position();
		System.out.println(pos.x);   //0
		System.out.println(pos.y);   //0
		
		Position pos2 = new Position(100,200);
		System.out.println(pos2.x);   // 100
		System.out.println(pos2.y);   // 200
		
		Position pos3 = new Position(100);
		System.out.println(pos.x);   //100
		System.out.println(pos.y);   //100
		
	}
}
