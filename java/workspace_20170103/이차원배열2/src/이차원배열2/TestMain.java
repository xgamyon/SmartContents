package 이차원배열2;

public class TestMain {
	public static void main(String[] args) {
		final int MAX=10;
		int [][]a = new int[MAX][MAX];
		int i, j, k;
		
		k=1;
		for(i=0; i<MAX; i++)
		{
			for(j=0; j<=i; j++)
			{
				a[i][j] = k++;
			}
		}
		
		for(i=0; i<MAX; i++)
		{
			for(j=0; j<MAX; j++)
			{
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
