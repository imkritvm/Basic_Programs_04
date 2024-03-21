import java.util.Arrays;

public class TrapWater {
    public static int TrapWater(int[] arr) {
        int n = arr.length;
        int waterStore = 0;
        int[] leftArr = new int[n];
        int[] rightArr = new int[n];
        
        leftArr[0] = arr[0];
        for(int i=1;i<n;i++) {
            leftArr[i] = Math.max(leftArr[i-1],arr[i]);
        }
        
        rightArr[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--) {
            rightArr[i] = Math.max(rightArr[i+1],arr[i]);
        }
        
        for(int i=0;i<n;i++) {
            waterStore += Math.min(rightArr[i],leftArr[i])-arr[i];
        }
        
        return waterStore;
    }
    
	public static void main(String[] args) {
		int[] shades = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.print("Input Array : ");
		System.out.println(Arrays.toString(shades));
		int result = TrapWater(shades);
		System.out.println("Output : "+result);
	}
    
}
