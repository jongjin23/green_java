package alsong;

import java.util.Scanner;

public class ex3_5 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner (System.in);
		System.out.println("������ �Է� : ");
		x = sc.nextInt();
		if (x>0) {
			System.out.println("����Դϴ�");
		} else if (x<0) {
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("0�Դϴ�");
		}
	}

}
