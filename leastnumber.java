import java.util.*;

public class sasi 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int a[]=new int[sc.nextInt()];
		System.out.println("enter values of array");
		for(int i=0;i<a.length;i++)
		 a[i]=sc.nextInt();
		System.out.println("enter digits to delete");
		int b=sc.nextInt();
		Arrays.sort(a);
		String s="";
		for(int i=0;i<a.length-b;i++)
			s+=a[i];
			System.out.println(Integer.parseInt(s));
	}

}
