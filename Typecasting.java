class Typecasting {
     public static void main(String[] args)
  {
     char letter = 'A';
     int ascii = letter;
     char alph = (char)ascii;
  System.out.println("value after typecasting Auto" +ascii);
  System.out.println("value after typecasting manually " +alph);
}
}