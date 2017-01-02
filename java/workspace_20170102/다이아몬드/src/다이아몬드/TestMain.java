package 다이아몬드;

public class TestMain {

	public static void main(String[] args) {
		int i, j;
		int line=10;
		
		for(i=1; i<=line; i++)
		{
			//공백먼저 그리고 
			for(j=1; j<=line-i; j++)
				System.out.print(" ");
			//별 찍어주기 
			for(j=1; j<=2*i-1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
