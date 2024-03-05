import java.util.HashSet;
import java.util.Array;

public class Main {
    public static HashSet<Integer> MergeAlgorithm(HashSet<Integer> x, HashSet<Integer> b){
        int n = x.size();
        int m = b.size();
        int i=0,j=0,k=0;
        Integer[] xArray = x.toArray(new Integer[0]);
        Integer[] bArray = b.toArray(new Integer[0]);
        int[] result = new int[n+m];
        while(i<n && j<m){
            if(xArray[i]<bArray[j]){
                result[k]=xArray[i];
                i++;
            }
            else{
                result[k]=bArray[j];
                j++;
            }
            k++;
        }
        // This line is copying the rest of the element
        while(i<n){
            result[k]=xArray[i];
            i++;
            k++;
        }
        while(j<m){
            result[k]=bArray[j];
            j++;
            k++;
        }
        HashSet<Integer> mergedSet = new HashSet<>();
        for (int value : result) {
            mergedSet.add(value);
        }

        return mergedSet;
    }
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>(Arrays.asList(2,8,15,18));
        HashSet<Integer> b = new HashSet<>(Arrays.asList(5,9,12,17));
        System.out.println(a);
        System.out.println();
        System.out.println(b);
        System.out.println();
        HashSet<Integer> result = MergeAlgorithm(a, b);
        System.out.println(result);
    }
}
