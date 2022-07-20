import java.util.Scanner;
class Spy
{
	public static void main(String[] args)
	{
			int num,rem,mul=1,sum=0;
			System.out.println("Enter Number:");
			Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			while(num!=0)
			{	
				rem = num%10;
				num = num/10;
				sum = sum+rem;
				mul = mul*rem;
			}
			if(sum==mul)
			{
				System.out.println("Number is Spy Number");
			}
			else
			{
				System.out.println("Number is not Spy Number");
			}
			
	}
}