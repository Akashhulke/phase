import java.util.Scanner;
public class arithmatic_calculator
{
    int a, b, result;
	public void add()
	{
		result = a+b;
		System.out.println("Addition is "+(result));
	}
	public void sub()
	{
		result = a-b;
		System.out.println("Substraction is "+(result));
	}
    public void mul()
    {
    	result = a*b;
    	System.out.println("Multiplication is "+(result));
    }
    public void div()
    {
    	result = a/b;
    	System.out.println("Division is "+(result));
    }
    public void scan()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter first number");
    	a = sc.nextInt();
    	System.out.println("Enter Second number");
    	b = sc.nextInt();
    }
    public static void main(String a[])
    {
    	int i;
    	arithmatic_calculator a1 = new arithmatic_calculator();

    	Scanner sc = new Scanner(System.in);
    	System.out.println("Select operation");
    	System.out.println("1.Addition");
    	System.out.println("2.Substraction");
    	System.out.println("3.Division");
    	System.out.println("4.Multiplication");
    	System.out.println("5.Exit");
    	i = sc.nextInt();

    	switch(i)
    	{
    	case 1: a1.scan();
    		    a1.add();
    		    break;
        case 2: a1.scan();
        	    a1.sub();
        	    break;

        case 3: a1.scan();
        	    a1.div();
        	    break;

        case 4: a1.scan();
        	    a1.mul();
        	    break;

        case 5: System.exit(0);

        default: System.out.println("Wrong entry. Please try again");

    	}
    	 	
    }

}