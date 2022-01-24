package ch7;

public class Shape {
	
	Point p = new Point();	// point의 객체형 맴버변수 p를 선언하고 생성
							// 맴버변수 p가 객체, new를 해주어야 메모리 할다.
	void draw() {
		System.out.println("x좌표 : " + p.x);
		System.out.println("y좌표 : " + p.y);
	}

}
