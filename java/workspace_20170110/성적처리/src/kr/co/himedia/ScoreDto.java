package kr.co.himedia;

//DTO - Data Transfer Object, VO
//1. 데이타만 저장되는 클래스, 무조건
public class ScoreDto {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private double avg;
	private String grade;

	public void process()
	{
		total = kor + eng + mat;
		avg = total /3.0;
		if(avg>=90)
			grade="A";
		else if(avg>=80)
			grade="B";
		else if(avg>=70)
			grade="C";
		else if(avg>=60)
			grade="D";
		else 
			grade="F";
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

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
