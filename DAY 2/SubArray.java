import java.io.*;
import java.util.*;

class SubArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0;i<size ;i++ ) {
			arr[i]= sc.nextInt();
		}
		for (int i = 0; i < arr.length ; i++ ) {
			int j = i;
			while(j < arr.length){
				for (int k = i;k<=j ;k++ ) {
					System.out.print(arr[k] + "    ");
					
				}
				System.out.println();

				j++;
			}
		}
	}
}