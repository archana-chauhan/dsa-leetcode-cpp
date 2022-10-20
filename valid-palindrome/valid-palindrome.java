class Solution {
    public boolean isPalindrome(String str) {
        String original = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reverse = new StringBuffer(original).reverse().toString();
        System.out.println("original: " + original + " reverse: " + reverse);
        return original.equals(reverse);
    }
}