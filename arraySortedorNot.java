class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        boolean flag = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }
        
        return flag;
        
    }
}