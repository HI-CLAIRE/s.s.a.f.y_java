package 별찍기연습;

//	    0 1  2  3 4 : c
//0    15 13 10 6 1
//1 	  14 11 7 2
//2 	     12 8 3
//3		        9 4
//4		          5
//r

public class 세로별찍기 {
	public static void main(String[] args) {
		int cnt = 0;
		int[][] arr = new int[5][5];
		
		for(int c=4; 0<=c; c--) //c: 4, 3, 2, 1, 0
		{	
			for(int r=0; r<=c; r++) //r: 0, 1, 2, 3, 4
			{
				arr[r][c] = ++cnt;
			}
		}
		for(int r=0; r<5; r++)
		{
			for(int c=0; c<5; c++)
			{
				if(arr[r][c] == 0)
					System.out.printf("%3s", "");
				else
					System.out.printf("%3d", arr[r][c]);
			}
			System.out.println();
		}
	}
}
