class printing
{
    public static void main(String[]args)
        {
            int i;
            for(i=1;i<=100;i++)
                {
                    if(i%15==0)
                        {
                            System.out.print("DeepTech ");
                        }
                    else if(i%5==0)
                        {
                            System.out.print("Tech ");
                        }
                    else if(i%3==0)
                        {
                            System.out.print("Deep ");
                        }
                    else
                        {
                            System.out.print(i + " ");
                        }
                }
        }
}