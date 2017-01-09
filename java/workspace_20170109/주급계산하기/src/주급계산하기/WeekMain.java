package 주급계산하기;

public class WeekMain {
	public static void main(String[] args) {
		WeekPayManager mgr = new WeekPayManager();
		mgr.append();
		mgr.process();
		mgr.output();
	}
}
