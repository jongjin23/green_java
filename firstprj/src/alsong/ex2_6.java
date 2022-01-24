package alsong;

import java.util.Scanner;

public class ex2_6 {
 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수값 : ");
		int x=stdIn.nextInt();	// x에 입력받은 값을 저장
		
		System.out.println("10을 더한 값은 " + (x+10) + "입니다.");
		System.out.println("10을 뺀 값은 " + (x-10) + "입니다.");
	}

}