package alsong;

import java.util.Scanner;

public class ex3_5 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner (System.in);
		System.out.println("정수값 입력 : ");
		x = sc.nextInt();
		if (x>0) {
			System.out.println("양수입니다");
		} else if (x<0) {
			System.out.println("음수입니다");
		} else {
			System.out.println("0입니다");
		}
	}

}
