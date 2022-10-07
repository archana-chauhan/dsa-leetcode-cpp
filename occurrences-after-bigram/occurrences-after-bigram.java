class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] tokens = text.split(" ");
        int n = tokens.length;
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (tokens[i].equals(first) && (i+1 < n) && tokens[i+1].equals(second) && (i + 2 < n)) {
                stringList.add(tokens[i+2]);
            }
        }

        String[] result = new String[stringList.size()];
        int i = 0;
        for (String res: stringList) {
            result[i++] = res;
        }
        return result;
    }
}