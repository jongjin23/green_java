package alsong;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int i, k = 0;
		Scanner x = new Scanner (System.in);
		System.out.print("숫자 입력 : ");
		i = x.nextInt();
		if (i<2) {
			System.out.println("2이상의 숫자를 입력하세요.");
		} else {
			for (int j=2 ; (j*j)<=i ; j++) {
				if (i%j == 0) {
					k++;
				}
			}
			if (k == 0) {
				System.out.println(i + "는 소수입니다.");
			} else {
				System.out.println(i + "는 소수가 아닙니다.");
			}
		}
	}

}
