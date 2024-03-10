import java.util.*;

public class ReverseArray
{
    
    public static int[] ReverseArray(int[] arr, int start, int end) {
        if(start >= end) {
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        return ReverseArray(arr,start+1,end-1);
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] array = {2,4,6,8,10,12,14};
		for(int i : array) {
		    System.out.print(i+" ");
		}
		System.out.println();
		ReverseArray(array,0,array.length-1);
		for(int i : array) {
		    System.out.print(i+" ");
		}
	}
}
