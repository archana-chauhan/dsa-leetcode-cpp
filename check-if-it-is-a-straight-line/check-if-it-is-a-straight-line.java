class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        int points = coordinates.length;
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int dx = coordinates[1][0] - x0;
        int dy = coordinates[1][1] - y0;
        
        if (points == 1) return false;
        
        if (points == 2) return true;
        
        for (int i = 1; i < points; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            
            if (dx * (y - y0) != dy * (x - x0)) {
                return false;
            }
        }
        
        return true;
    }
}