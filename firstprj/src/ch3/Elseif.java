package ch3;

import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
		int jumsu;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하라");
		jumsu=sc.nextInt();
		if(jumsu>=90) {
			System.out.println("A");		// 90이상
		} else if (jumsu >= 80) {
			System.out.println("B");		// 80이상 90미만
		} else if (jumsu >= 70) {
			System.out.println("C");		// 70이상 80미만
		} else if (jumsu >= 60) {
			System.out.println("D");		// 60이상 70미만
		} else {
			System.out.println("F");		// 60미만
		}
	}

}
