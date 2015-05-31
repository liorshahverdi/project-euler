import java.util.ArrayList;
public class App{
	public static void main(String[] args)
	{
		ArrayList<Integer> multiples = new ArrayList<Integer>();
		for (int i=1; i<1000; i++){
			if (i%3==0 || i%5==0) multiples.add(i);
		}
		int sum = 0;
		for (int x: multiples)
			sum += x;
		System.out.println(sum);
	}
}
/*
If we list all the natural numbers below 10 that are multiples of 3 and 5, we get 3,5,6, and 9. 
The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
*/