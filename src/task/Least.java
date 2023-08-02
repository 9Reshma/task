package task;
import java.util.Scanner;
public class Least {

	public static void main(String[] args) {
		int a, b, gcd=1;  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		a=sc.nextInt();
		System.out.println("Enter 2nd number:");
		b=sc.nextInt();
		for(int i = 1; i <= a;i++)   
		{    
		if(a % i == 0 && b % i == 0)   
		gcd = i;  
		}  
		int lcm = (a * b) / gcd;  
		System.out.println("The LCM two numbers is:"+lcm);  
      }
}