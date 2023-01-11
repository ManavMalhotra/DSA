import java.io.*;
import java.util.*;

class BrokenEconomy{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];

		int ceil = 0;
		int floor = 0;

		for (int i = 0; i<size ;i++ ) {
			arr[i] = sc.nextInt();
		}
		int data = sc.nextInt();
		int low = 0;
		int high = arr.length-1;

		while(low<=high){
		int mid = (low+high)/2;
			if (data<arr[mid]) {
				high = mid - 1;
				ceil = arr[mid];
			}else if(data > arr[mid]){
				low = mid+1;
				floor = arr[mid];
			}else{
				ceil = arr[mid];
				floor = arr[mid];
				break;
			}
		}
    	System.out.println(ceil);
    	System.out.println(floor);
		

	}
}