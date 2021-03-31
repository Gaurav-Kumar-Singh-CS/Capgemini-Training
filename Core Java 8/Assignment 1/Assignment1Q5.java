import java.util.*;
class TaxAmount {
    public double calculateTaxAmount(int ctc){
    	double d,d1,d2,d3;
    	d = 0.0;
    	d1 = 0.1*ctc; d2 = 0.2*ctc; d3 = 0.3*ctc;;
    	if(ctc >= 0 && ctc <= 180000)
    		return d;
    	else
    		if(ctc >= 181001 && ctc <= 300000)
    			return d1;
    		else
    			if(ctc >= 300001 && ctc <= 500000)
    				return d2;
    			else
    				if(ctc >= 500001 && ctc <= 1000000)
    	return d3;
    				else
    					return d;
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
    	int c; double d;
    	Scanner obj = new Scanner(System.in);
    	TaxAmount ob = new TaxAmount();
    	System.out.println("Enter the CTC ");
    	c = obj.nextInt();
    	d = ob.calculateTaxAmount(c);
    	System.out.println("You have to pay "+ d);
    	obj.close();
    }
}
