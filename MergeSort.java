public class MergeSort {
    public static int[] MergeAlgorithm(int[] x, int[] b,int n,int m){
        int i=0,j=0,k=0;
        int[] result = new int[n+m];
        while(i<n && j<m){
            if(x[i]<b[j]){
                result[k]=x[i];
                i++;
            }
            else{
                result[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<n){
            result[k]=x[i];
            i++;
            k++;
        }
        while(j<m){
            result[k]=b[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {2,8,15,18};
        int[] b = {5,9,12,17};
        int[] result = MergeAlgorithm(a, b, a.length,b.length);
        for(int num : result){
            System.out.print(num+ " ");
        }
    }
}
