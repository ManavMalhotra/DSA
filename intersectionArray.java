import java.util.*;
class intersectionArray {

    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0; 
        int j = 0;
        while(i<nums1.length && j < nums2.length){
            if (nums1[i]<nums2[j]) {
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            } else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        int [] arr1 = new int[arr.size()];

        int k = 0;
        while(k<arr.size()){
            arr1[k] = arr.get(k);
            k++;
        }
        // arr.get(0);


        return arr1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,1};
        int[] b = {2,2};

        int[] c = intersect(a, b);

        System.out.println(c);
    }
}