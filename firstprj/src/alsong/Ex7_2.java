package alsong;

import java.util.Scanner;

public class Ex7_2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, min;
		int[] arr = new int[3];
		System.out.println("정수 3개를 입력하라");
		for(i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();			
		}
		min = arr[0];
		for (i=0 ; i<arr.length ; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min = " + min);
	}

}
