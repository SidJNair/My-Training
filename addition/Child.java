package addition;
import java.util.Scanner;
public class Child extends Check {
	
	public void chek (int num1,int num2) 
	{    super.sum(num1,num2);
		if (s%10==0) 
		{
			System.out.println("The number is divisible by 10");
		}
		else 
		{
			System.out.println("The number is not divisible ny 10");			
		}
	}

	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the first number");
	  int num1=sc.nextInt();
	  System.out.println("Enter the second number");
	  int num2=sc.nextInt();
      Child obj=new Child();
     
      obj.chek(num1,num2);

	}

}
