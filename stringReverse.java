public class strReversing {

	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  String g=sc.nextLine();
	  StringBuffer sb=new StringBuffer(g).reverse();
	  for(int i=0;i<sb.length();i++)
	  	if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u')
	  		sb.deleteCharAt(i);
	  System.out.println(sb);
	}

}
