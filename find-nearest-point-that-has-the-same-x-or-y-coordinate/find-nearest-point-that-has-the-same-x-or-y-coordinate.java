class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int result = Integer.MAX_VALUE;
        int index = -1;
        
        for (int i = 0; i < points.length; i++) {
            if (x == points[i][0] || y == points[i][1]) {
                int minimumDistance = Math.abs(x-points[i][0]) + Math.abs(y-points[i][1]);
                if (minimumDistance < result) {
                    result = minimumDistance;
                    index = i;
                }
                
                System.out.println("Min Distance: " + minimumDistance);       
            }
        }
        return index;
    }
}