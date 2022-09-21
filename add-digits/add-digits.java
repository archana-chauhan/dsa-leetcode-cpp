class Solution {
    public int addDigits(int num) {
        // int x = 0;
        while(num>=10){
            int x=0;
            while(num!=0){
                x+=(num%10);
                num/=10;
            }
            num=x;
        }
        return num;
        
//         int result = 0;
//         int sumOfDigits = 0, newResult = 0;
        
//         if (num <= 9) return num;
        
//         while (num != 0) {
//             int remainder = num % 10;
//             num = num / 10;
//             sumOfDigits += remainder;
//             result = sumOfDigits;
//         }
        
//         while (result > 9) {
//             if (result > 9) {
//                 int rem = result % 10;
//                 result = result/10;
//                 newResult = rem + result; 
//                 result = newResult;
//                 System.out.println("rem: " + rem + " : sumOfDigits: " + sumOfDigits + " result: " + result);   
//             }
//             else {
//                newResult = result; 
//             }
            
//         } 
        // return newResult;
    }
}