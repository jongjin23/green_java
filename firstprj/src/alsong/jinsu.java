package alsong;

import java.util.Scanner;

public class jinsu {

	public static void main(String[] args) {
		int i, j=128, k;
		Scanner x = new Scanner (System.in);
		System.out.print("���� �Է� : ");
		i = x.nextInt();
		System.out.print(i + " = ");
		for (k=0 ; k<8 ; k++) {
			System.out.print((i/j)%2);
			j = j/2;
		}
		System.out.println("(��)");
	}
}
