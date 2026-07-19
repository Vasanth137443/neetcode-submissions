

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int[] ans = new int[k];

        // Find the top k frequent elements
        for (int i = 0; i < k; i++) {

            int maxFreq = 0;
            int element = 0;

            // Convert keys to an array
            Integer[] keys = map.keySet().toArray(new Integer[0]);

            // Find the key with the maximum frequency
            for (int j = 0; j < keys.length; j++) {

                int key = keys[j];

                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    element = key;
                }
            }

            ans[i] = element;

            // Remove the selected element so it is not selected again
            map.remove(element);
        }

        return ans;
    }
}