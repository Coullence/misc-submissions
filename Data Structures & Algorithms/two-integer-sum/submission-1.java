class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums ==null) return new int[]{0,0};

        Map<Integer,Integer> map = new HashMap<>();

        int j=0;
        int k=0;

        for(int i=0; i<nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                j=i;
                k=map.get(comp);
                return new int[]{k,j};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}
