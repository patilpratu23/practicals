import java.util.Scanner;
class ArrayExample
{
	public static void main(String aw[])
	{	
		int n=5;
		int a=1;
		int sum=0;
             	int mark[]=new int[n];
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value"+a+"=");
			mark[i]=s.nextInt();
			a++;
			sum+=mark[i];
                 }
		System.out.println("SUM:"+sum);
		for(int i=0;i<n;i++)
		{
			System.out.println(mark[i]);

		}
	}
}