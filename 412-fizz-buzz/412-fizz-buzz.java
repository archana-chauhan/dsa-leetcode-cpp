class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> newList = new ArrayList<String>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                newList.add("FizzBuzz");
            }
            else if (i % 3 == 0){
                newList.add("Fizz");
            }
            else if (i % 5 == 0) {
                newList.add("Buzz");
            } 
            else {
                newList.add(Integer.toString(i));
            }
        }
        return newList;
    }
}