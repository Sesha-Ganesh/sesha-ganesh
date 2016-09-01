public class commonPrefix
{

	public static void main(String[] args)
	{
  	Scanner sc=new Scanner(System.in);
  	String g=sc.nextLine();
	 	System.out.println(longestPrefix(g));
	}
	public static int longestPrefix (String g)
	{
  	String s[]=g.split(" ");
  	int count=0,temp=0;
  	for(int i=0;i<s.length;i++)
  		for(int j=1;j<=s[i].length();j++)
  		{
  			for(int k=0;k<s.length;k++)
  			if(s[k].startsWith(s[i].substring(0, j), 0))
  				count++;
  			
  			if(count>temp)
  				temp=count;
  			count=0;
  		}
  	return temp;
  }

}
