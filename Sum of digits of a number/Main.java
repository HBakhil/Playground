import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc = new Scanner(System.in);  
      int number = sc.nextInt(); // Remember number/10 reduces one digit from number // and number%10 gives you last digit
      int sum = 0; 
      int input = number; 
      while (input != 0)
      { 
        int lastdigit = input % 10;
        sum += lastdigit; input /= 10; 
      }
      System.out.println(sum); // closing Scanner to prevent resource leak sc.close();

	}
}