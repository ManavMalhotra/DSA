// difference two array
// Array 2 is always greater

import java.io.*;
import java.util.*;

public class diff{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int size1 = sc.nextInt();
    int[] array1 = new int[size1];

    for (int i = 0;i<size1 ;i++ ) {
    	array1[i]=sc.nextInt();
    }

    int size2 = sc.nextInt();
    int[] array2 = new int[size2];

    for (int j = 0;j<size2 ;j++ ) {
    	array2[j]=sc.nextInt();
    }
    int[] diff = new int[size2];
    int c = 0;

    int i = array1.length-1;
    int j = array2.length-1;
    int k = diff.length-1;

    // for (int a = 0;a<array1.length ;a++ ) {
    // 	System.out.print(array1[a] + " ");
    // }
    // 	System.out.println();

    // for (int a = 0;a<array2.length ;a++ ) {
    // 	System.out.print(array2[a] + " ");
    // }
    // 	System.out.println();

    while(k>=0){
    	int	d = 0;
    	// System.out.println(array2[j]);
    	int array1V = i>=0 ? array1[i] : 0 ;
    	if (array2[j] + c >= array1V) {
    		d = (array2[j] + c) - array1V;
    		c = 0; 
    	}else{
    		d = (array2[j] + c + 10) - array1V;
    		c = -1;
    	}
    	diff[k] = d;
    	i--;
    	j--;
    	k--;
    }

    for (int a = 0;a<diff.length ;a++ ) {
    	System.out.print(diff[a]);
    }
    	System.out.println();

 }

}