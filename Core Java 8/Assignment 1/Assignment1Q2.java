import java.util.*;

class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
    	int arr[] = new int[100];int i = 0;
    	for(int num = min; num <= max; num++)
    	{
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
    		{arr[i] = sum;
    		i++;
    		}
    }
    return arr;	
    }
}
public class Assignment1Q2 {

	public static void main(String[] args) {
		int min = 100;int max = 999;
		Scanner obj = new Scanner(System.in);
		int a[] = new int[100];
		ArmstrongNumBetweenRange ob = new ArmstrongNumBetweenRange();
		a = ob.armstrongNumbersInRange(min, max);
		for(int i = 0; a[i]!=0 ; i++)
			System.out.println(a[i]);
		obj.close();
	}
}
