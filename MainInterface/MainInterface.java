interface boy
    {
      final int b=6;
      public void display();
    }
interface girl
    {
      final int c=9;
      public void display1();
    }


class Value implements boy,girl
  {
            public void display()
            {
              System.out.println("boy's values is "+b);
            }
            public void display1()
            {
                System.out.println("girl's values is "+c);
            }
  }

class MainInterface
{
    public static void main(String arg[])
    {
        Value V1=new Value();
        V1.display();
        V1.display1();

    }
	
}