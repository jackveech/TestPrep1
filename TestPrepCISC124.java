package testPrep;
import java.util.Random;
import java.util.ArrayList;
public class TestPrepCISC124 {

	public static double random_val()
	{
		Random rng = new Random();
		double val = rng.nextDouble() - 0.5;
		return val * 2;
		
	}
	public static void main(String[] args) {
		int n = 9999;
		int count = 0;
		for(int g = 0; g < n; g++)
		{
			int x = 2;
			int y = 2;
			if((x*2 + y*2) < 1)
			{
				count += 1;
			}
		}
		double pi = 4 * count /n;
		System.out.println("The approximate value of pi is = " + pi);
		System.out.println(random_val());
		System.out.println(method2(5));
		
		ArrayList<String> up = new ArrayList<>();
		ArrayList<String> x = new ArrayList<>();
		ArrayList<String> y = x;
		for(int p = 0; p < up.size(); p++)
		{
			if (up.get(p).equals("TRUE"));
			{
				y.set(p, x.get(p).toUpperCase());
			}
		}
		System.out.println("Hello".length());
		String s = "Helloooo";
		System.out.println(s.length());
		int h = 0;
		h = h+ 1;
		for(int j = 0; j < s.length(); j++)
		{
			System.out.println("Hello!");
		}
		int[] x2 = new int[5];
		for(int u = 0; u < 5; u++)
		{
			x2[u] = u;
		}
		for(int w = 0; w < 5; w++)
		{
			System.out.println(x2[w]);
		}
		double x5 = TestPrepCISC124.random_val();
		System.out.println(x5);
		int[] x55 = {1,2,3,4,5};
		for(int k = 0; k < x55.length; k++)
		{
			
		}
		Integer x9 = 0;
		Integer x99 = x9;
		x9 = 55; 
		System.out.println(x99);
		String x7779079= "Hello";
		char[] x98 = new char[x7779079.length()];
		for(int q = 0; q < x7779079.length(); q++)
		{
			x98[q] = x7779079.charAt(q);
		}
		System.out.println(x98);
		char t = 71;
		System.out.println(t);
		double x555 = 55F;
		System.out.println(x555);
		double r = Double.MAX_VALUE * 2;
		System.out.println(r);
		Character[] x00 = {'A', 'B'};
		char x099 = 'A';
	}
	public static ArrayList<Double> method2(int n)
	{
		ArrayList<Double> dubs = new ArrayList<>();
		if (n < 0)
		{
			throw new IllegalArgumentException("Not a valid number");
			
		}
		for(int x = 0; x < n; x++)
		{
			dubs.add(random_val());
		}
		return dubs;
	}
}