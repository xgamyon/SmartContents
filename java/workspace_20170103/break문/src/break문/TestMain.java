package break��;

public class TestMain {
	public static void main(String[] args) {
		int i;
		
		i=1;
		for(;;){
			System.out.println(i);
			i++;
			if(i>10){
				break;
			}
		}
		System.out.println("�������� : "+i);
		
		
		//���� for��
		int j;
		
		boolean flag = false;
		
		for(i=1; i<=10; i++){
			for(j=1; j<=10; j++){
				if(j==5){
					flag = true;
					break;
				}
				System.out.println("#");
			}
			
			if(flag==true){
				break;
			}
			System.out.println("@");
		}
		
		
		
	}
}
