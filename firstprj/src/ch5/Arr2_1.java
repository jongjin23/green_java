package ch5;

import java.util.Scanner;

public class Arr2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, min;
		int[] arr = new int[10];
		System.out.println("���� 10���� �Է��϶�");
		for(i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();			
		}
		// min�� �迭 ù ������ �ʱ�ȭ
		min = arr[0];
		// �Է¹��� 10���� ���� �� ���� ���� ���� ���Ѵ�.
		for (i=0 ; i<arr.length ; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min = " + min);
	}

}
