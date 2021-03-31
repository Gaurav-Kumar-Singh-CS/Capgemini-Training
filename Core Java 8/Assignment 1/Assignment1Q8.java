class BubbleSort extends Assignment1Q8{

    public int[] bubbleSort(int arr[]) {
    	int temp, i;
    	for(int j = 0; j< arr.length - 1; j++)
    		for(i = 0; i< arr.length -j - 1; i++){
    		
    		if(arr[i] > arr[i+1])
    		{
    			temp = arr[i];
    			arr[i]=arr[i+1];
    			arr[i+1]=temp;
    		}
    	}
    	return arr;
    }
}
public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int result[] = new int[arr.length];
        BubbleSort obj = new BubbleSort();
        result = obj.bubbleSort(arr);
        for(int i = 0; i< result.length ; i++)
        System.out.println(result[i]);
    }
}
