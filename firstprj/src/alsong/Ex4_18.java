package alsong;

import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		int i, j, k=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		i = sc.nextInt();
		System.out.print(i + "의 약수 : ");
		for (j=1 ; j<i ; j++) {
			if (i%j == 0) {
				System.out.print(j + ", ");
				k++;
			}
		}
		System.out.println(i);
		System.out.println(i + "의 약수의 개수 : " + (k+1) + "개");
	}

}
