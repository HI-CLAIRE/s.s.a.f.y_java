package practice;

public class 조합for문 {

	public static void main(String[] args) {
		//4C2
		for(int i=1; i<=4; i++) {
			for(int j=i+1; j<=4; j++) {
				System.out.println(i+""+j);
			}
		}

		//4C3
		for(int i=1; i<=4; i++) {
			for(int j=1+1; j<=4; j++) {
				for(int k=j+1; k<=4; k++) {
					System.out.println(i+""+j);
				}
			}
		}
	}

}
