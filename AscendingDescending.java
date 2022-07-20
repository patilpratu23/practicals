class AscendingDescending
	{
		public static void main(String[] args)	
			{
				AscendingDescending obj =new AscendingDescending();
				obj.Ascending();
				obj.Descending();
			}
	

public void Ascending()
	{

		System.out.println("Numbers from Ascending to Descending order for 1 to 10 is :");
		for(int i=1;i<=10;i++)
			{					
				System.out.println(" "+i);
			}
		
	}

public void Descending()
	{

		System.out.println("Numbers from Descending to Ascending order for 1 to 10 is :");
		for(int j=10;j>=1;j--)
			{					
				System.out.println(" "+j);
			
			}	

	}
}