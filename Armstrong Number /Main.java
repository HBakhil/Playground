import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
          Scanner s=new Scanner(System.in); 
      int originalNumber, remainder, result = 0;
      int number=s.nextInt();

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
	}
  
}