import java.util.*;
class ResultDeclaration {
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	String str,str1 = new String();
    	str = "passed"; str1 = "failed";
    	if(subject1Marks > 60 && subject2Marks > 60 && subject3Marks > 60)
    		return str;
    	else
    		if((subject1Marks > 60 && subject2Marks > 60) || (subject2Marks > 60 && subject3Marks > 60) || (subject1Marks > 60 && subject3Marks > 60))
    			return str;
    		else
    			return str1;         
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
    	double s1,s2,s3;
    	String a = new String();
    	Scanner obj = new Scanner(System.in);
    	System.out.println("Enter marks of three subjects ");
    	s1 = obj.nextDouble();
    	s2 = obj.nextDouble();
    	s3 = obj.nextDouble();
    	ResultDeclaration ob = new ResultDeclaration();
    	a = ob.declareResults(s1, s2, s3);
    	System.out.println(a);
    	obj.close();
    }
}
