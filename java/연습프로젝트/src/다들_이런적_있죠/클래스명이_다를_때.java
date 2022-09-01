package 다들_이런적_있죠;

import java.util.Scanner;

public class 클래스명이_다를_때 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String AlgorithmSite = sc.next();
		String ClassName = "";
		
		if(AlgorithmSite.equals("BOJ"))
			ClassName = "Main";
		else if(AlgorithmSite.equals("SWEA"))
			ClassName = "Solution";
		else {
			System.out.println("패키지명도 삭제해야 됨");
			System.out.println("너무 귀찮음");
			System.out.println("자바코드를 문제풀이 사이트에 제출할 때"
					+ " 해당 사이트의 양식에 맞추어 코드를 바꿔줌");
		}
		sc.close();
	}
}
