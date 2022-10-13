class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maximum = -1;
        int ans = Integer.MAX_VALUE;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
            if (mp.getKey() % 2 == 0) {
                if (maximum <= mp.getValue()) {
                    if (maximum == mp.getValue()) {
                        ans = Math.min(ans, mp.getKey());
                    } else {
                        ans = mp.getKey();
                        maximum = mp.getValue();
                    }
                }
            }
        }
        if (ans == Integer.MAX_VALUE) {
            ans = -1;
        }
        return ans;
    }
}