class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> numSet = new HashSet<>();

        for (int num: nums){
            if (!numSet.add(num)){
                return true;
            }
        }return false;
    }
}
