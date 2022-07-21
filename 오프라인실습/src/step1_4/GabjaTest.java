package step1_4;

import java.util.Scanner;

public class GabjaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("60갑자를 입력하세요: ");
		while(true)
		{	
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			
			//종료조건
			if("종료".equals(input))
			{
				sc.close();
				return;
			}
			
			//input 배열받기
			String[][] gabja = {{"갑", "을", "병", "정", "무", "기", "경", "신", "임", "계"}, 
					{"자", "축", "인", "묘", "진", "사", "오", "미", "신", "유", "술", "해"}};
			
			
		}
	}

}
