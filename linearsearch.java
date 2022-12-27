public class linearsearch {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 9, 3, 11, 5};
        System.out.println(linearsearch(arr, 9, 0));
    }

    static int linearsearch(int[] arr, int target, int index){
        if (arr[index] == target){
            return index;
        }
        if (index == arr.length-1){
            return -1;
        }

        return linearsearch(arr, target, index+1);
    }
}
