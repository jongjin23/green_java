package ch7;

public class StudentMain2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "������";
		s1.kor = 90;
		s1.eng = 95;
		s1.math = 100;
		s1.eval_sum();
		s1.eval_avg();
		
		Student s2 = new Student();		
		s2.name = "����";
		s2.kor = 80;
		s2.eng = 90;
		s2.math = 70;
		s2.eval_sum();
		s2.eval_avg();
		
		Student s3 = new Student();
		s3.name = "������";
		s3.kor = 99;
		s3.eng = 90;
		s3.math = 80;
		s3.eval_sum();
		s3.eval_avg();
		
		Student s4 = new Student();
		s4.name = "�ڸ��";
		s4.kor = 80;
		s4.eng = 88;
		s4.math = 90;
		s4.eval_sum();
		s4.eval_avg();		
		
		Student s5 = new Student();
		s5.name = "���缮";
		s5.kor = 99;
		s5.eng = 88;
		s5.math = 77;
		s5.eval_sum();
		s5.eval_avg();		

		System.out.println("��ü s1�� ����");
		s1.print();
		System.out.println();
		System.out.println("��ü s2�� ����");
		s2.print();
		System.out.println();
		System.out.println("��ü s3�� ����");
		s3.print();
		System.out.println();
		System.out.println("��ü s4�� ����");
		s4.print();
		System.out.println();
		System.out.println("��ü s5�� ����");
		s5.print();
		
	}

}
