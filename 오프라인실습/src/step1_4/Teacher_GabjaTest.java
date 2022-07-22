package step1_4;

import java.util.Scanner;

public class Teacher_GabjaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Gan = {"갑", "을", "병", "정", "무", "기", "경", "신", "임", "계"};
		String[] Ji = {"자", "축", "인", "묘", "진", "사", "오", "미", "신", "유", "술", "해"};
	
		Scanner sc = new Scanner(System.in);
		
		//input 받고 배열에 넣기
		do
		{
			System.out.print("60갑자를 입력하세요: ");
			String input = sc.next();
			if("종료".equals(input)) break;
			
			//갯수 체크
			if(input.length() != 2)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			String gan = input.charAt(0) + "";
			String ji = input.charAt(1) + "";
			
			//일치하는 글자 찾기(간)
			int g = -1;
			for(int i=0; i<Gan.length; i++)
			{
				if(gan.equals(Gan[i]))
				{
					g = i;
					break;
				}
			}
			//일치하는 글자 찾기(지)			
			int j = -1;
			for(int i=0; i<Ji.length;i++)
			{
				if(ji.equals(Ji[i]))
				{
					j = i;
					break;
				}
			}
			
			if(g == -1 || j == -1)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			for(int year=1800; year<=2100; year++)
			{
				int y = year;
				y -= 1444;
				if(y%10==g && y%12==j)
					System.out.print(year + " ");
			}
			System.out.println();
			
		} while(true);
		sc.close();
	}

}
