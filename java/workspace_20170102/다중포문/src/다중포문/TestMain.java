package 다중포문;

public class TestMain {
	public static void main(String[] args) {
		int i, j;
		for(i=1; i<=5; i++){
			for(j=1; j<=5; j++){
				System.out.printf("i = %d j = %d \n", i, j);
			}
		}
		System.out.println();
		System.out.println();
		
		
		//구구단
		for(i=1; i<=9; i++){
			System.out.printf("== %d 단 ==\n", i);
			for(j=1; j<=9; j++){
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		
		/*  
		    *
		    **
		    ***
		    ****
		    *****
		 */
		for(i=1; i<=5; i++){
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1; i<=5; i++){
			for(j=6-i; j>=1; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		int k=1;
		
		for(i=1; i<=5; i++){
			for(j=1; j<=5; j++){
				System.out.print(k +" ");
				k++;
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
