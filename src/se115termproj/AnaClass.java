package se115termproj;
import java.util.*;
public class AnaClass 
{
	public static void main(String[]args)
	{
		Scanner giris;
		giris=new Scanner(System.in);
		System.out.println("Bir deðer giriniz");
		int deger = giris.nextInt();
		long sonuc = hesapla(deger);
		System.out.println("Faktöriyel deðeri: " + sonuc);
		giris.close();
		
	}
	static long hesapla(int a)
	{
		int carpim = 1;
		for(int i = 1;i<=a;i++)
		{
			carpim*=i;
		}
		return carpim;
	}
}
