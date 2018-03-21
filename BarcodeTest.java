
import java.util.Scanner;

public class BarcodeTest
{
	public static void main(String[] args)
	{
		console = new Scanner(System.in);
		System.out.print("What is the zip code: ");
		String zip = console.next();
		System.out.println("|" + Barcode.getCode(zip) + "|");
	}
	private static Scanner console;
}
