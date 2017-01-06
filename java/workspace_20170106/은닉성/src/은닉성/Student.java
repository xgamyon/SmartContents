package 精莞失;

/*
 * Student s = new Student();
 * s.kor=200;
 * s.setKor(200);
 */
public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	//持失切 
	public Student()
	{
		System.out.println("持失切");
	}
	
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if( kor<0 || kor>100)
			this.kor=0;
		else
			this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	
}
