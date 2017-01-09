package 주급계산하기;

public class WeekPayData {
	private String name;
	private int work_time;//근무시간
	private int hour_pay; //시간당근무액
	private int base_pay; //기본금액
	private int over_pay; //수당
	private int total_pay; //합산
	private double tax; //세금 
	private double real_pay; //실수령액 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWork_time() {
		return work_time;
	}
	public void setWork_time(int work_time) {
		this.work_time = work_time;
	}
	public int getHour_pay() {
		return hour_pay;
	}
	public void setHour_pay(int hour_pay) {
		this.hour_pay = hour_pay;
	}
	public int getBase_pay() {
		return base_pay;
	}
	public void setBase_pay(int base_pay) {
		this.base_pay = base_pay;
	}
	public int getOver_pay() {
		return over_pay;
	}
	public void setOver_pay(int over_pay) {
		this.over_pay = over_pay;
	}
	public int getTotal_pay() {
		return total_pay;
	}
	public void setTotal_pay(int total_pay) {
		this.total_pay = total_pay;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getReal_pay() {
		return real_pay;
	}
	public void setReal_pay(double real_pay) {
		this.real_pay = real_pay;
	}
	
	
}
