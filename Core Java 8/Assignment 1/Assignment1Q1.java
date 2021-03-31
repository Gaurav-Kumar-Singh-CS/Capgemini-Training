import java.util.*;
public class Assignment1Q1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a;
		System.out.println("Enter a number ");
		a = obj.nextInt();
		boolean b;
		ArmstrongOrNot ob = new ArmstrongOrNot();
		b = ob.armstrongCheck(a);
		if(b == true)
			System.out.println(a + " is an armstrong number.");
		else
			System.out.println(a + " is not an armstrong number.");
	}
}

class ArmstrongOrNot {

	public boolean armstrongCheck(int num) {
    	int temp = num;
    	int z = num;
    	int n = 0; int sum = 0;
    	while(temp != 0)
    	{
    		n++;
    		temp = temp/10;
    	}
    	while(z != 0)
    	{
    		int r = z%10;
    		sum += Math.pow(r,n);
    		z = z/10;
    	}
    	if(sum == num)
    		return true;
    	else
    		return false;
    	
    	}
    
    }
