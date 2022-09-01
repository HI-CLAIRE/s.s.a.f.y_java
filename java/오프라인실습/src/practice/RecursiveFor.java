package practice;

public class RecursiveFor {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}

		rf(0,5);
	}
	static void rf(int depth, int end) {
		if(depth == end) {
			return;
		}
		
		System.out.println(depth);
		rf(depth+1, end);
	}
}
