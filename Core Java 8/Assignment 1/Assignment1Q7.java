class SearchArray {
    public boolean searchArray(int[] arr,int toCheckValue){
    	int n = 0;
    	for(int i = 0; i< arr.length; i++)
			if(arr[i] == toCheckValue)
				n++;
    	if(n>0)
    		return true;
    	else
    		return false;
    }
}
public class Assignment1Q7{
    public static void main(String[] args) {
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19; boolean n;
        SearchArray obj = new SearchArray();
        n = obj.searchArray(arr, valueToCheck);
        if(n == true)
			System.out.println("Element found!");
		else
			System.out.println("Element not found!");
}
}
