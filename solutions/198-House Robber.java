public class Solution {
    public int rob(int[] nums) {
        if(nums.length==0)
            return 0;
        int include=nums[0];
        int exclude=0;
        int i;
        for(i=1;i<nums.length;i++){
            
            int include_new= exclude + nums[i];
            
            exclude = include> exclude ? include : exclude;
            
            include=include_new;
        }
        
        return (include > exclude)?include: exclude;
    }
}