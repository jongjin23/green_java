package ch3;

import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
		int jumsu;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��϶�");
		jumsu=sc.nextInt();
		if(jumsu>=90) {
			System.out.println("A");		// 90�̻�
		} else if (jumsu >= 80) {
			System.out.println("B");		// 80�̻� 90�̸�
		} else if (jumsu >= 70) {
			System.out.println("C");		// 70�̻� 80�̸�
		} else if (jumsu >= 60) {
			System.out.println("D");		// 60�̻� 70�̸�
		} else {
			System.out.println("F");		// 60�̸�
		}
	}

}
