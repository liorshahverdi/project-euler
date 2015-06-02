import java.util.ArrayList;
public class App{
	public static void main(String[] args){
		ArrayList<Integer> fib_list = new ArrayList<Integer>();
		int x = 1;
		int y = 2;
		fib_list.add(x); fib_list.add(y);
		while (x+y <= 4000000){
			int fib_sum = x+y;
			fib_list.add(fib_sum);
			x = y;
			y = fib_sum;
		}
		int sum = 0;
		for (Integer k : fib_list)
			if (k%2 == 0) sum += k;
		System.out.println(sum);
	}
}
/* By considering the terms in the Fibonacci sequence whose values do not exceed 4 million, 
* find the sum of the even-valued terms.
*/