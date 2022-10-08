class Solution {
    public static int findIndex(Map<Integer,Integer> map, int target) {
        int index = 0;
        for (Map.Entry<Integer, Integer> mp: map.entrySet()) {
            if (mp.getKey() == target) {
                System.out.println("index: " + mp.getValue());
                index = mp.getValue();
            }
        }
        return index;
    }
    
    public int[] twoSum(int[] arr, int target) {
        // Brute Force
        
        // List<Integer> list = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if (arr[i] + arr[j] == target) {
        //             list.add(i);
        //             list.add(j);
        //         }
        //     }
        // }
        // System.out.println("List: " + list);
        // int[] result = new int[list.size()];
        // int i = 0;
        // for (int index : list) {
        //     result[i++] = index;
        // }
        // return result;
        
        
        // Hashing
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                int index = findIndex(map, target - arr[i]);
                System.out.println("INDEX: " + index);
                list.add(index);
                list.add(i);
//                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            } else {
                map.put(arr[i], i);
            }
        }
        System.out.println("list: " + list);
        int[] result = new int[list.size()];
        int i = 0;
        for (int index : list) {
            result[i++] = index;
        }
        return result;
    }
}