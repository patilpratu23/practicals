class Adding
{     
	public static void sum(int a,int b)   
	{   
		int c=a+b;  
		System.out.println("The sum is: "+c);   
	}     
	public static void sum(float x,float y)   
	{   
		float c=x-y;  
		System.out.println("The sum is: "+c);   
	}     
	public static void main(String args[])   
	{     
		Adding.sum(12,90);
		Adding.sum(1.1f,2.2f);   
	}   
}