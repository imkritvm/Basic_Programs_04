import java.util.Arrays;

public class QuickSortJava
{
    public static void QuickSort (int[] B,int l, int h) {
        if (l<h) {
            int j = partition(B,l,h);
            QuickSort(B,l,j-1);
            QuickSort(B,j+1,h);
        }
    }
    
    public static int partition(int[] A, int l, int h){
        int p = A[h];
        
        int i = l -1;
        for(int j=l;j<h;j++) {
            if(A[j]<p) {
                i++;
                swap(A,i,j);
            }
        }
        swap(A, i, h);
        return i + 1;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] QS = {6,5,8,9,3,10,15,12,16};
		QuickSort(QS, 0, QS.length-1);
		System.out.println(Arrays.toString(QS));
	}
}
