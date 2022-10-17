package 이주차;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Book {
	String name;
	float tall;
	public Book(String name, float tall) {
		super();
		this.name = name;
		this.tall = tall;
	}
	
}

public class 출석부 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int k = sc.nextInt();
		
		ArrayList<Book> list = new ArrayList<Book>();
		for(int i=0; i<N; i++) {
			String name = sc.next();
			float tall = sc.nextFloat();
			Book book = new Book(name, tall);
			
			list.add(book);
			
		}
		
		for(int i=N-1; i>0; i--) {
			Book pos = list.get(i);
			
			String n1 = pos.name;
			float t1 = pos.tall;
			
			for(int j=0; j<=i; j++) {
				Book nPos = list.get(j);
			
				String n2 = nPos.name;
				float t2 = nPos.tall;
				
				if(n1.compareTo(n2) < 0 || n1.compareTo(n2) == 0 && t1 < t2)
					Collections.swap(list, i, j);
				
			}
			
		}
//		for(int i=0; i<N; i++)
//			System.out.println(list.get(i).name + " " + list.get(i).tall);
//		}
		System.out.printf("%s %.2f", list.get(k-1).name, list.get(k-1).tall);
		sc.close();
	}

}

/*
 * 
5 5
abcabc 120.00
abcabca 120.00
abcabcb 120.00
abcabcc 120.00
abcabcd 120.00

7 1
oscar 100.00
goorm 110.40
goormee 111.50
goorm 11.40
goormy 109.50
henry 200.00
goormy 10.50
 */