import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;
	private int theAscii;

	public CharacterAnalyzer()
	{
		
	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if (Character.isUpperCase(theChar) == true)
		{
			return true;
		}
		return false;
	}

	public boolean isLower( )
	{
		if (Character.isLowerCase(theChar) == true)
		{
			return true;
		}
		return false;
	}
	
	public int getASCII( )
	{
		int ascii = (int) theChar;
		theAscii = ascii;
		return ascii;
	}
	
	public boolean isNumber( )
	{
		if (theAscii >= 48 || theAscii <= 57)
		{
			return true;
		}
		return false;
	}	

	public String toString()
	{
		if (isUpper() == true)
		{
			return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		}
		if (isLower() == true)
		{
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		}
		if (isNumber() == true)
		{
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}
		return "nothing";	  
	}
}