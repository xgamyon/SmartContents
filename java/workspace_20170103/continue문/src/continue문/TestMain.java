package continue문;

public class TestMain {
	public static void main(String[] args) {
		int i;
		
		i=1;
		for(i=1; i<=10; i++){
			if(i==3 || i==5){
				continue;  // 없애버림! pass!
			}
			System.out.println(i);
		}
		
	}
}
