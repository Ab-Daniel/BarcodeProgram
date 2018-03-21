public class Digit 
{
	public static String getCode(int number)
	{
		String bar = "";
		int digit = number;
		switch(digit)
		{
			case 0: bar = "||:::"; break;
			case 1: bar = ":::||"; break;
			case 2: bar = "::|:|"; break;
			case 3: bar = "::||:"; break;
			case 4: bar = ":|::|"; break;
			case 5: bar = ":|:|:"; break;
			case 6: bar = ":||::"; break;
			case 7: bar = "|:::|"; break;
			case 8: bar = "|::|:"; break;
			case 9: bar = "|:|::"; break;
		}
		return bar;
	}
}
