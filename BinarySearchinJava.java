// Binary Search program but for Sorted Array
import java.util.Scanner;
public class BinarySearchinJava
{
    public static int binarySearch(int[] ary, int start, int end, int target)
    {
        if (end >= start)
        {
            int mid = start + (end - start) / 2;
            if (ary[mid] == target)
            {
                return mid;
            }
            if (ary[mid] < target)
            {
                return binarySearch(ary, mid + 1, end, target);
            }
            return binarySearch(ary, start, mid - 1, target);
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] num = {3, 6, 8, 12, 14, 17, 25, 29, 31, 36, 42, 47, 53, 55, 61};
        System.out.println("Given Array is : ");
        for (int element: num) {
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("Enter the number which you want to search : ");
        int target = sc.nextInt();
        int result = binarySearch(num, 0, num.length - 1,target);
        if (result != -1)
        {
            System.out.println("Index of "+target+" : " + result);
        } else
        {
            System.out.println(target+" not found in the array.");
        }
    }
}
