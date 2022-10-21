import java.time.*;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int d1 = (int) LocalDate.parse(date1).toEpochDay();
        int d2 = (int) LocalDate.parse(date2).toEpochDay();
        return Math.abs(d1-d2);
    }
}