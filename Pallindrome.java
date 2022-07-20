import java.util.Scanner;
class Pallindrome
{
	public static void main(String[] args)
	{
			int ov,num,rem,n=0;
			System.out.println("Enter Number:");
			Scanner sc=new Scanner(System.in);
			ov=sc.nextInt();
			num=ov;
			while(num!=0)
			{	
				rem = num%10;
				num = num/10;
				n=n*10+rem;
			}
			System.out.println("____________________");
			System.out.println("Original Number is:"+ov);
			System.out.println("Reversed Number is:"+n);
			System.out.println("____________________");
			if(ov==n)
			{
				System.out.println("Number is Pallindrome");
			}
			else
			{
				System.out.println("Number is not Pallindrome");
			}
			
	}
}