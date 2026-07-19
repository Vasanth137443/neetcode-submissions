class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                set.add(nums[i]);
            }
        }
        int ans = 1;
        while(true){
            if(!set.contains(ans)){
                return ans;
            }
            ans++;
        }

    }
}