class findFloor{
  
    static int findFloor1(long nums[], int n, long x){
        int left = 0;
        int right = n - 1 ;
        int ans = -1;
        while(left<=right){
            
            int mid = (right + left)/2;
            
            if(nums[mid] == x) {
                return mid;
                
            }
            else if(nums[mid] > x){
                right = mid - 1;
            }else {
                ans = mid;
                left = mid + 1;
                
                
            }
            
        }
        
        return ans;
        
    }


    public static void main(String[] args) {
    	long nums[] = {1,2,8,10,11,12,19};
    	long x = 11;
    	System.out.println(findFloor1(nums, 7, x));
    }
    
}