package hw2_2;

import java.util.Scanner;

public class 일차원배열 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0; i<10; i++)
			arr[i] = i+10;
		System.out.println("-----원소 10개 출력-----");
		for(int i=0; i<10; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println("-----원소 10개 출력-----");
		for(int i=0; i<10; i += 2)
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.print("-----바꿀 위치 입력 : ");
		Scanner sc = new Scanner(System.in);
		int repl = sc.nextInt();
		System.out.print("-----수 입력 : ");
		int num = sc.nextInt();
		System.out.println("-----원소 10개 출력-----");
		arr[repl] = num;
		for(int i=0; i<10; i++)
			System.out.print(arr[i] + " ");
	}
}
