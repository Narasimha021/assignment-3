package assignment3;

public class Calculator 
{
	    public int add(int a, int b) 
	    {
	        return a + b;
	    }
	    public int add(int a, int b, int c)
	    {
	        return a + b + c;
	    }
	    public double add(double a, double b)
	    {
	        return a + b;
	    }
	    public static void main(String[] args) 
	    {
	        Calculator calc = new Calculator();
	        System.out.println(calc.add(5, 10)); // Calls the first add method
	        System.out.println(calc.add(5, 10, 15)); // Calls the second add method
	        System.out.println(calc.add(5.5, 10.5)); // Calls the third add method
	    }
}
