package kr.co.himedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreManager {
	private List<ScoreDto> dataList =
			          new ArrayList<ScoreDto>();
	Scanner sc = new Scanner(System.in);
	
	public void start()
	{
		//계속돈다 
		int menu;
		while(true)
		{
			menuDisplay();
			System.out.print("선택 : ");
			menu = sc.nextInt();
			switch(menu)
			{
				case 1: output(); break;
				case 2: append(); break;
				case 3: modify(); break;
				case 4: delete(); break;
				case 5: search(); break;
				case 0: System.out.println("종료");
				        return; //함수를 끝내야 한다 
				default:
						System.out.println("쫌 !!!");
			}
		}
	}
	
	public void menuDisplay()
	{
		System.out.println("---------");
		System.out.println("  메 뉴  ");
		System.out.println("---------");
		System.out.println(" 1.출력  ");
		System.out.println(" 2.추가  ");
		System.out.println(" 3.수정  ");
		System.out.println(" 4.삭제  ");
		System.out.println(" 5.검색  ");
		System.out.println(" [0].종료");
		System.out.println("---------");
	}
	
	void output()
	{
		for(int i=0; i<dataList.size(); i++)
		{
			ScoreDto temp=dataList.get(i);
			System.out.print(temp.getName()+"\t");
			System.out.print(temp.getKor()+"\t");
			System.out.print(temp.getEng()+"\t");
			System.out.print(temp.getMat()+"\t");
			System.out.print(temp.getTotal()+"\t");
			System.out.print(temp.getGrade()+"\n");
		}
	}
	
	void append()
	{
		ScoreDto dto = new ScoreDto();
		dataList.add(dto); 
		
		sc.nextLine(); //버퍼에 남아있는 엔터키 읽어버리기
		System.out.print("이름 : ");
		dto.setName(sc.nextLine());
		System.out.print("국어 : ");
		dto.setKor(sc.nextInt());
		System.out.print("영어 : ");
		dto.setEng(sc.nextInt());
		System.out.print("수학 : ");
		dto.setMat(sc.nextInt());
		
		dto.process();
	}
	
	//이름으로 검색하여 그 위치를 반환하는 함수만들기
	//검색, 수정, 삭제 세곳에서 모두 사용할 함수 
	int find(String name)
	{
		for(int i=0; i<dataList.size(); i++)
		{
			if( dataList.get(i).getName().equals(name))
			{
				return i;
			}
		}
		
		return -1; //못찾은 경우 -1 반환
	}
	
	void search()
	{
		String name;
		System.out.print("찾을 이름은? ");
		sc.nextLine();
		name = sc.nextLine();
		int pos = find(name);
		if( pos==-1 )
		{
			System.out.println(name + " is not found");
		}
		else
		{
			ScoreDto temp=dataList.get(pos);
			System.out.print(temp.getName()+"\t");
			System.out.print(temp.getKor()+"\t");
			System.out.print(temp.getEng()+"\t");
			System.out.print(temp.getMat()+"\t");
			System.out.print(temp.getTotal()+"\t");
			System.out.print(temp.getGrade()+"\n");
		}
	}
	
	
	void modify()
	{
		String name;
		System.out.print("수정할 이름은? ");
		sc.nextLine();
		name = sc.nextLine();
		int pos = find(name);
		if( pos==-1 )
		{
			System.out.println(name + " is not found");
		}
		else
		{
			ScoreDto dto = dataList.get(pos);
			//다시 입력받기 
			System.out.print("이름 : ");
			dto.setName(sc.nextLine());
			System.out.print("국어 : ");
			dto.setKor(sc.nextInt());
			System.out.print("영어 : ");
			dto.setEng(sc.nextInt());
			System.out.print("수학 : ");
			dto.setMat(sc.nextInt());
			dto.process();
		}
	}
	
	void delete()
	{
		String name;
		System.out.print("삭제할 이름은? ");
		sc.nextLine();
		name = sc.nextLine();
		int pos = find(name);
		if( pos==-1 )
		{
			System.out.println(name + " is not found");
		}
		else
		{
			dataList.remove(pos);//삭제 
		}
	}
}
