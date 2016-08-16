import java.util.*;

public class alpha
{
public static void main(String[] args)
	{
  	Scanner sc=new Scanner(System.in);
  	char c=sc.next().charAt(0);
  	if(Character.isAlphabetic(c))
  		System.out.println("alphabet");
  	else
  		System.out.println("not an alphabet");
	}
}
