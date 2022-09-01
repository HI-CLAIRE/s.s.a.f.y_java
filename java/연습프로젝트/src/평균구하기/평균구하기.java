package 평균구하기;

import java.util.Scanner;

public class 평균구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[11];
		for(int i=0; i<10; i++)
			arr[i] = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 0;
		for(int i=0; i<10; i++)
		{
			if(a-1 <= i && i <= b-1)
				sum += arr[i];
		}
		System.out.println(sum / (b-a+1));
	}
}
