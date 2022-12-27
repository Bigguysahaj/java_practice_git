import java.util.Arrays;
import java.util.*;
import java.util.ArrayList;

public class returnListWithoutPassingParameter {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 9, 9, 9, 3, 11, 9, 5};
        // System.out.println(linearsearch(arr, 9, 0));
        System.out.println(findallindex(arr, 9, 0));
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

    static ArrayList<Integer> findallindex(int[] arr, int target, int index){

        ArrayList<Integer> vector = new ArrayList();

        if (arr.length == index){
            return vector;
        }

        if (arr[index] == target){
            vector.add(index);
        }

        ArrayList<Integer> AnsFromAboveCalls = findallindex(arr, target, index+1);
        vector.addAll(AnsFromAboveCalls);
        // could use insert in c++ with vectors, instead of addall
        return vector;
    }
}
