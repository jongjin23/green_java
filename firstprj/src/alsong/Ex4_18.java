package alsong;

import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		int i, j, k=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		i = sc.nextInt();
		System.out.print(i + "�� ��� : ");
		for (j=1 ; j<i ; j++) {
			if (i%j == 0) {
				System.out.print(j + ", ");
				k++;
			}
		}
		System.out.println(i);
		System.out.println(i + "�� ����� ���� : " + (k+1) + "��");
	}

}
