package alsong;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int i, k = 0;
		Scanner x = new Scanner (System.in);
		System.out.print("���� �Է� : ");
		i = x.nextInt();
		if (i<2) {
			System.out.println("2�̻��� ���ڸ� �Է��ϼ���.");
		} else {
			for (int j=2 ; (j*j)<=i ; j++) {
				if (i%j == 0) {
					k++;
				}
			}
			if (k == 0) {
				System.out.println(i + "�� �Ҽ��Դϴ�.");
			} else {
				System.out.println(i + "�� �Ҽ��� �ƴմϴ�.");
			}
		}
	}

}
