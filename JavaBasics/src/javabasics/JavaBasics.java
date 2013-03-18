/* Name: Geoffrey Sowash
 * Due Date: 1/17/12
 * Assignment Name: Java Basics
 */




package javabasics;

public class JavaBasics 
{
	/* The static modifier shares a single variable between multiple instances of
	 * the class. If all variables where static then modifications to the variable in
	 * one instance of the class would change the variable value in all other
	 * instances of the class, which in many cases would be undesirable and
	 * unintended.
	 */

	private int myCount;
	private int y;
	private static int maxOfAll = Integer.MIN_VALUE;
	static JavaBasics myJB = new JavaBasics();
	static JavaBasics otherJB = new JavaBasics();

	public JavaBasics() 
	{
		super();
		myCount = 0;
	}

	public JavaBasics(int myCount)
	{
		super();
		this.myCount = myCount;
	}

	public int updateCount(int addCount)
	{
		// x=5;
		// Error: "x cannot be resolved to a variable"

		// x was created within a different function and therefore cannot be 
		// accessed within this function because it is a local variable.

		// Local variables are dynamically allocated at the beginning of a function
		// and only exist within the function. At the end of the function the memory 
		// is returned to the heap, which makes them less memory intensive than instance
		// variables which have memory allocated for every instance of the class. 
		// Instance variables, however are useful in that they can be modified and 
		// shared by all functions within a class instance. Unlike static variables,
		// however all instances of the class have their own copies of the instance
		// variables, which are not shared.

		myCount+=addCount;
		if (myCount > maxOfAll)
			maxOfAll = myCount;
		return addCount;
	}

	public void displayCount ()
	{
		System.out.println(myCount);
	}

	public static void displayMax ()
	{
		//System.out.println(maxOfAll);
		System.out.println(JavaBasics.maxOfAll);
	}

	public static void someFn ()
	{
		int x;
		//System.out.println(x);
		
		// Java does not allow the calling of variables with no set value and 
		// therefore throws an error stopping the print operation. In C++ we would 
		// have instead printed a string of trash to the console.
		System.out.println(myJB.y);
		System.out.println(otherJB.y);
		// Instance variables are initialized to a value of 0 and therefore they do
		// not throw an error unlike local variables, which are not initialized by 
		// default.

	}

	public static void main(String[] args)
	{

		myJB.updateCount(7);
		otherJB.updateCount(15);
		myJB.displayCount();
		otherJB.displayCount();
		displayMax();
		myJB.updateCount(10);
		displayMax();
		otherJB.updateCount(15);
		displayMax();
		someFn();

		//myCount = 5; 
		// Multiple copies of variable myCount exist as each class instance has
		// its own version. This is why it suggests converting myCount to static
		// as a solution to the problem b/c this would allow it to be called without
		// specifying which class instance the variable belongs to.

		// Inside of the default constructor this is fine because the specific 
		// myCount belongs to the class instance that is being instantiated by 
		// the constructor

	}


}
