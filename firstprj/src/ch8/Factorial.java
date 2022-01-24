package ch8;

public class Factorial {
	int compute(int x) {
		if (x == 1) {
			return 1;
		} else {
			return x * compute(x - 1);
		}
	}
}

/*
¿Á±Õ »£√‚
f(n) = n*f(n-1), ¥‹ f(1)=1
5! = f(5) = 5*f(4)
		  = 5*4*f(3)
		  ...
		  = 5*4*3*2*1
*/
 