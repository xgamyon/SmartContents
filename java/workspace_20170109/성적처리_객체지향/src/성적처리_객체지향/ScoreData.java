package 성적처리_객체지향;

//한사람 분량의 변수를 하나로 묶는다 
public class ScoreData {
	private String idNum;
	private String name;
	private int write;
	private int word;
	private int ppt;
	private int spread;
	private int total;
	private String grade;
	
	public void calc()
	{
		total = write + word + ppt+spread;
		if(total>=800)
			grade = "A등급";
		else if( total>=600)
			grade = "B등급";
		else if( total>=400)
			grade = "C등급";
		else 
			grade = "D등급, 재시험요망";
		
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWrite() {
		return write;
	}
	public void setWrite(int write) {
		this.write = write;
	}
	public int getWord() {
		return word;
	}
	public void setWord(int word) {
		this.word = word;
	}
	public int getPpt() {
		return ppt;
	}
	public void setPpt(int ppt) {
		this.ppt = ppt;
	}
	public int getSpread() {
		return spread;
	}
	public void setSpread(int spread) {
		this.spread = spread;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
