class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums==null){
            return false;
        }
        int n = nums.length;
        if(n==1){
            return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<n;i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}