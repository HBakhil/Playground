import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int num=1;
      for(int i=1;i<=n;i++)
      {
        num=num*i;
       
      }
       System.out.println(num);
	}
}