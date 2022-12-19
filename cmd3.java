//add,sub,mul,div of two numbers that are inputted through cmd

class cmd3
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int add,sub,mul,div;
		add = a + b;
		sub = a - b;
		mul = a * b;
		div = a / b;
		System.out.println("addition = "+add);
				
		System.out.println("subtraction = "+sub);

		System.out.println("multiplication = "+mul);

		System.out.println("division = "+div);

	}
}