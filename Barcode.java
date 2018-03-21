public class Barcode
{
	public static String getCode(String zipcode)
	{
		String zip = zipcode;
		int one = Integer.parseInt(zip.substring(0, 1));
		int two = Integer.parseInt(zip.substring(1, 2));
		int three = Integer.parseInt(zip.substring(2, 3));
		int four = Integer.parseInt(zip.substring(3, 4));
		int five = Integer.parseInt(zip.substring(4, 5));
		
		int testZip = one + two + three + four + five;
		int check = 0;
		boolean done = true;
		while(done)
		{
			if((testZip % 10) == 0)
				break;
			else
				testZip++;
				check++;
		}
		return Digit.getCode(one) + Digit.getCode(two) + Digit.getCode(three)
				+ Digit.getCode(four) + Digit.getCode(five) + Digit.getCode(check);
	}
}
