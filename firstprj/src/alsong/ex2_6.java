package alsong;

import java.util.Scanner;

public class ex2_6 {
 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ : ");
		int x=stdIn.nextInt();	// x�� �Է¹��� ���� ����
		
		System.out.println("10�� ���� ���� " + (x+10) + "�Դϴ�.");
		System.out.println("10�� �� ���� " + (x-10) + "�Դϴ�.");
	}

}