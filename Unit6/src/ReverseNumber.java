//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class ReverseNumber
{
   private int number;
   
   public ReverseNumber()
   {
	   
   }
	
	public ReverseNumber(int n)
	{
		number = n;
	}
	
	public void setNum(int n)
	{
		number = n;
	}

	public int getReverse()
	{
		int rev=0;
		int num = number;
		
		while (num > 0)
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return rev;
	}

	public String toString()
	{
		String string = number + " reversed is " + getReverse() + "\n";
		
		return string;
	}
	
	
}