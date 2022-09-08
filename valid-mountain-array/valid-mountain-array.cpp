class Solution {
public:
    bool validMountainArray(vector<int>& arr) {
        int n = arr.size();
        bool flag1 = false;
        bool flag2 = false;

        if ( n < 3) { return false; }

        int i = 1;


        while ( i < n && arr[i] > arr[i-1]) {
            i++;
            flag1 = true;
        }

        if ( i == n ) { return false; }
        
        int prev = arr[i-1];
        
        while ( i < n && arr[i] < prev) {
            flag2 = true;
            prev = arr[i];
            i++;
        }
        
        return i == n && flag1 && flag2;
        
//         if (arr.size() <= 2) {
//             return false;
//         }
        
//         for (int  i = 1; i < arr.size(); ) {
//             if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                
//                 int j = i;
//                 while (j >= 1 && arr[j] > arr[j-1]) j--;
                
//                 while (i < arr.size() && arr[i] > arr[i+1]) i++;
                
//                 return true;
//             } 
//             else {
//                 i++;
//                 // return false;
//             }
//         }
//         return false;
    }
};