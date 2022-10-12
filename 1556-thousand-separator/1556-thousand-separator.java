class Solution {
    public String thousandSeparator(int n) {
//         StringBuilder result = new StringBuilder();
//         int counter = 0;
//         while (n != 0) {
//             int digit = n % 10;
//             counter++;
//             if (counter > 3) {
//                 counter-=3;
//                 result.append(".");
//                 result.append(digit);
//             } else {
//                 result.append(digit);
//             }
//             n /= 10;
//         }

//         if (result.length() != 0) {
//             return result.reverse().toString();
//         }
//         System.out.println("Result: " + result.reverse());
//         return "0";
        
        // Optimized Solution
        StringBuilder result = new StringBuilder(String.valueOf(n));
        for (int i = result.length() - 3; i > 0; i -= 3) {
            result.insert(i, ".");
        }
        System.out.println("Result: " + result);
        return result.toString(); 
    }
}