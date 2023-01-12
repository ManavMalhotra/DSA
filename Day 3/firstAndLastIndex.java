import java.io.*;
import java.util.*;
class firstAndLastIndex{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i<size ;i++ ) {
			arr[i] = sc.nextInt();
		}
		int data = sc.nextInt();

		int low = -1;
		int high = arr.length-1;
		int li = -1;

		while(low<=high){
		int mid = (low+high)/2;
			if (data<arr[mid]) {
				high = mid - 1;
				
			}else if(data > arr[mid]){
				low = mid+1;
			}else{
				li = mid;
				low = mid + 1;

			}
		}

		low = 0;
		high = arr.length-1;
		int fi = -1;

		while(low<=high){
		int mid = (low+high)/2;
			if (data<arr[mid]) {
				high = mid - 1;
			}else if(data > arr[mid]){
				low = mid+1;
			}else{
				fi = mid;
				high = mid - 1;

			}
		}

    	System.out.println(fi);
    	System.out.println(li);

	}
}
