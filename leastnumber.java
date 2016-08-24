import java.util.*;

public class leastNumber
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int as=Math.abs(sc.nextInt());		
		int a[]=new int[String.valueOf(as).length()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=as%10;
			as/=10;
		}
		System.out.println("enter digits to delete");
		int b=Math.abs(sc.nextInt());
		Arrays.sort(a);
		String s="";
		for(int i=0;i<a.length-b;i++)
			s+=a[i];
		System.out.println(Integer.parseInt(s));
	}

}
