//REVERSE AN ARRAY

class reverseArray{
	public static void reverse(int[] arr){
      int length = arr.length;
      for(int i = 0; i<length/2; i++){
       int temp = arr[i];
       arr[i] = arr[length-1-i];
       arr[length - 1 - i] = temp;
      }
  	}
	public static void main(String[] args) {
		
	}
}