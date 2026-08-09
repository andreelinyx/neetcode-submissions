class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            boolean adding = set.add(nums[i]);

            if (adding == false){
                return true;
            }
        }
        return false;
        
    }
}
