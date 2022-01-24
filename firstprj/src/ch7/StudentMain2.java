package ch7;

public class StudentMain2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "±èÅÂÈñ";
		s1.kor = 90;
		s1.eng = 95;
		s1.math = 100;
		s1.eval_sum();
		s1.eval_avg();
		
		Student s2 = new Student();		
		s2.name = "¿øºó";
		s2.kor = 80;
		s2.eng = 90;
		s2.math = 70;
		s2.eval_sum();
		s2.eval_avg();
		
		Student s3 = new Student();
		s3.name = "¾ÆÀÌÀ¯";
		s3.kor = 99;
		s3.eng = 90;
		s3.math = 80;
		s3.eval_sum();
		s3.eval_avg();
		
		Student s4 = new Student();
		s4.name = "¹Ú¸í¼ö";
		s4.kor = 80;
		s4.eng = 88;
		s4.math = 90;
		s4.eval_sum();
		s4.eval_avg();		
		
		Student s5 = new Student();
		s5.name = "À¯Àç¼®";
		s5.kor = 99;
		s5.eng = 88;
		s5.math = 77;
		s5.eval_sum();
		s5.eval_avg();		

		System.out.println("°´Ã¼ s1ÀÇ Á¤º¸");
		s1.print();
		System.out.println();
		System.out.println("°´Ã¼ s2ÀÇ Á¤º¸");
		s2.print();
		System.out.println();
		System.out.println("°´Ã¼ s3ÀÇ Á¤º¸");
		s3.print();
		System.out.println();
		System.out.println("°´Ã¼ s4ÀÇ Á¤º¸");
		s4.print();
		System.out.println();
		System.out.println("°´Ã¼ s5ÀÇ Á¤º¸");
		s5.print();
		
	}

}
