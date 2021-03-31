import java.util.*;
public class Assignment1Q3 {
    public static void main (String args[]) {
    	SiCi obj = new SiCi();
    	Scanner ob = new Scanner(System.in);
    	double p,r,si,ci;
    	int t;
    	System.out.println("Enter the principal ");
    	p = ob.nextDouble();
    	System.out.println("Enter the time ");
    	t = ob.nextInt();
    	System.out.println("Enter the rate ");
    	r = ob.nextDouble();
    	si = obj.simpleInterest(p, t, r);
    	ci = obj.compoundInterest(p, t, r);
    	System.out.println("The simple interest is " + si);
    	System.out.println("The compound interest is " + ci);
    	ob.close();
    }
}
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	return (principalAmount*time*interestRate)/100;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double k;
    	k = Math.pow(1+interestRate, time);
    	return (principalAmount*k - principalAmount);
    }
}
