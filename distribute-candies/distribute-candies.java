class Solution {
    public int distributeCandies(int[] candies) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int candy : candies) {
            map.put(candy, map.getOrDefault(candy, 0) + 1);
        }
        System.out.println("MAP: " + map) ;
        int result = candies.length / 2;

        return Math.min(map.size(), result);
    }
}