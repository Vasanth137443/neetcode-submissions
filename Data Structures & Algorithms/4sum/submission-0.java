class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int a = 0;a < n-3 ; a++){
            for(int b = a+1;b < n-2 ; b++){
                for(int c = b+1;c < n -1; c++){
                    for(int d = c+1;d < n ; d++){
                        long sum = (long) nums[a] + nums[b] + nums[c] + nums[d];
                        if(sum==target){
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[a]);
                            list.add(nums[b]);
                            list.add(nums[c]);
                            list.add(nums[d]);

                            Collections.sort(list);

                            if(!ans.contains(list)){
                                ans.add(list);
                            }
                        }
                    }
                }
            }

        }
        return ans;
        
    }
}