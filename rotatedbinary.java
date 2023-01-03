public class rotatedbinary {
    public static void main(String[] args){
        int[] arr = {5, 6, 7, 9, 1, 2, 3};
        

    }

    static int rotatedbin(int[] arr, int target, int index){
        if (arr[index] == target){
            return index;
        }
        if (index == arr.length-1){
            return -1;
        }

        return rotatedbin(arr, target, index+1);
    }
}
