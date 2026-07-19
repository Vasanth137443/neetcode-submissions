class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);

            }
            else{
                map.put(nums[i],1);
            }
           

        }
        Integer[] keys = map.keySet().toArray(new Integer[0]);

        for (int i = 0; i < keys.length; i++) {

            int key = keys[i];

            if (map.get(key) > n / 3) {
                arr.add(key);
            }
        }

        return arr;
        
    }
}