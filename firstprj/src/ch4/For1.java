package ch4;

public class For1 {

	public static void main(String[] args) {
		int i, sum = 0;
		System.out.println("1~10,000까지의 합");
		for (i=1 ; i<=10000 ; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
}

/*
int i, sum = 0
	sum = sum+i;
		= 0 + 1(i)
		= (0+1) + 2(i)
		= [(0+1)+2] + 3(i)
		...
		= [[(0+1)+2]+3] + ... + 100(i)
*/