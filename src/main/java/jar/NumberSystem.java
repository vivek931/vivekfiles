/*Name: VIVEK BOJJA
SID:999901375 ; SEC : 30
ADV PROGRAMMING
*/
// Converting num in to Octal base.
import java.util.Scanner;
public class NumberSystem 
{
	public static void main (String args[])
	{

	int dec, oct=0, count=0, m;      
	Scanner enter = new Scanner (System.in);
	System.out.println("Input decimal number: ");
	dec=enter.nextInt();
	do
	{
		oct = oct + (dec%8) *(int)Math.pow(10,count);
		count++;
		dec=dec/8;
	}
	while(dec!=0);
 
	System.out.println("Octal number: "+oct);
       }
}
