class Solution {
    
    int getIndex(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
    
    
    public int[] twoSum(int[] nums, int target) {
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            int secondElement = target - nums[i];
            int index = getIndex(nums, secondElement);
            
            if (set.contains(secondElement)) {
                result.add(index);
                result.add(i);
            }
            set.add(nums[i]);    
        }        
        int[] res = new int[2];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}