class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> seen = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(seen.containsKey(num)){
                return true;
            }
            seen.put(num,true);
        }
        
        return false;
    }
}