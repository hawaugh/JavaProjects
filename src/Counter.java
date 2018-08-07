//  Project:  JUnitTDD
//  File:     Counter.java

/**
 * Class created for the Test Driven Development environment.
 *
 * <p/> Bugs: (List any known issues or unimplemented features here)
 * 
 * @author Heather Waugh
 * @version %G%
 * @since 1.8
 */
public class Counter
{
	private int count;
	private int userCounter;
	
	public Counter(int c)
	{
		count = 0;
		userCounter = c;
	}


	/**
	 * (Insert a brief description that describes the purpose of this method) 
	 *
	 * @return
	 */
	public int getCount()
	{
		// TODO Auto-generated method stub
		return count;
	}

	/**
	 * (Insert a brief description that describes the purpose of this method) 
	 *
	 */
	public void increase()
	{
		// TODO Auto-generated method stub
		count = count + userCounter;
	}

	/**
	 * (Insert a brief description that describes the purpose of this method) 
	 *
	 */
	public void decrease()
	{
		// TODO Auto-generated method stub
		count = count - userCounter;
	}

}
