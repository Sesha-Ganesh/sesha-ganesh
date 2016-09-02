public class index {

	public static void main(String[] args) 
	{
  	int a[]={-3,-1,9,1,5};
  	int x=arrayIndex(a);
  	if(x<=a.length)
  		System.out.println(x);
  	else
  		System.out.println("No Output");
  }
  
  public static int arrayIndex(int a[])
  {
  	for(int i=0;i<a.length;i++)
	 		if(i==a[i])
  			return a[i];
  	return a.length+1;
  }
}
