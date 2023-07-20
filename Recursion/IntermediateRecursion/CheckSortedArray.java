//strictly increasing
package Recursion.IntermediateRecursion;

public class CheckSortedArray {
    public static boolean isSorted(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        // if(arr[index] < arr[index+1]){
        //     //array is sorted till now 
        //     return isSorted(arr, index+1);
        // }else{
        //     return false;
        // }
        
        if(arr[index] >= arr[index+1]){
            //array is unsorted till now 
            return false;
        }
        return isSorted(arr, index+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,7};
        System.out.println(isSorted(arr, 0));
    }
}
