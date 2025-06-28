package dsapractice;

class Solution {
    public int maxArea(int[] height) {
        
        int max=0, i=0, j=height.length-1, storage;

        while(i<j){

            if(height[i]<=height[j]){
                storage = (j-i)*height[i];
                i++;
            }else{
                storage = (j-i)*height[j];
                j--;
            }

            if(storage>max){

                max = storage;
            }
        }

        return max;
    }
}

public class ContainerWithMostWater {

	public static void main(String[] args) {
		Solution obj = new Solution();
		
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(obj.maxArea(height));
	}

}
