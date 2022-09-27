class Solution {
public:
    bool areAlmostEqual(string s1, string s2) {
        vector<int> add;
        if (s1 == s2) {
            return true;
        }
        if (s1.size() != s2.size()) return false;
        for (int i = 0; i < s1.size(); i++) {
            if (s1[i] == s2[i]) 
                continue;
            else {
                add.push_back(i);
            }
        }
        if (add.size() != 2) {
            return false;
        }
        else {
            swap (s1[add[0]], s1[add[1]]);
            if (s2 == s1) return true;
        }
        return false;
    }
};