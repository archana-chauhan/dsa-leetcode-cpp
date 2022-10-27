class Solution {
    public String reformatDate(String s) {
       StringBuilder res = new StringBuilder();
        Map<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");

        String[] sp = s.split(" ");
        String year = sp[sp.length - 1];
        String day = sp[sp.length - 3];
        String newDay = day.substring(0, day.length() - 2);
        System.out.println("newDay : " + newDay);
        String month = "";
        if (map.containsKey(sp[sp.length - 2])) {
            month = map.get(sp[sp.length - 2]);
        }
        if (Integer.parseInt(newDay) < 10) {
            res.append(year).append("-").append(month).append("-").append("0").append(newDay);
        }
        else {
            res.append(year).append("-").append(month).append("-").append(newDay);
        }
        return res.toString();
    }
}