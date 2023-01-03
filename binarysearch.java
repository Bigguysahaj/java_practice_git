import java.util.Arrays;

public class binarysearch{
    public static void main(String[] args){
        int arr[] = {36, 55, 32, 88, 42, 77, 10, 75, 89, 33};
        Arrays.sort(arr);
        // 10, 32, 33, 36, 42, 55, 75, 77, 88, 89 (sorted array)
        int target = 55;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    static int search(int arr[], int target, int start, int end){
        // base condition
        if (start > end){
            return -1;
        }
        //what is m
        int m = start + (end-start)/2;
        // checking if we found the answer or not
       if (arr[m] == target)
        return m+1;

        // Now if answer was not found, lets just look at the bright side, more specifically the left side
        if (arr[m]> target){
            return search(arr, target, start, m -1);
        }
        return search(arr, target, m + 1, end);

    }
}