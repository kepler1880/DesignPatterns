package Problems;

public class TwoSum {
	
	public static void main(String args[]){
		
        int nums[]={2,7, 11, 15};
        int indices[]= new int[nums.length];
        int j=0;
        int target=9;
        for (int i=0; i<nums.length;i++) {
        	if(nums[i]+nums[i+1] == target) {
        		indices[j]= i;
        		indices[j+1]= i+1;
        	}
        	i++;        	
        }  
        System.out.println(indices.length);
        for(int x:indices) {
        	System.out.println(x);
        }
    }
}
