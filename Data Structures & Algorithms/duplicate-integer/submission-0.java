class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        if(nums==null || n == 0 || n==1){
            return false;
        }

        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<n;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}