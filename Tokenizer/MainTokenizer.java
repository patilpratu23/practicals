import java.util.StringTokenizer;
class StringA
{
	void display()
	{
		StringTokenizer st1=new StringTokenizer("My name is pratiksha"," ");
		System.out.println("token of StringA class:");
		while(st1.hasMoreTokens())
		{
			System.out.println(st1.nextToken());
		}
	}
}
class StringB
{
	void display1()
	{
		StringTokenizer st2=new StringTokenizer("Today is thursday"," ");
		System.out.println("token of StringB class:");
		while(st2.hasMoreTokens())
		{
			System.out.println(st2.nextToken());
		}
	}
}
class MainTokenizer
{
	public static void main(String args[])
	{
		StringA s1=new StringA();
		StringB s2=new StringB();
		s1.display();
		s2.display1();
	}
}