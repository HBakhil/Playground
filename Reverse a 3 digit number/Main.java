import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner s=new Scanner(System.in);
    int n,rev=0;
    n=s.nextInt();
    while(n!=0)
    {
      rev=rev*10;
      rev=rev+n%10;
      n=n/10;
    }
    System.out.println(rev);
  }
}