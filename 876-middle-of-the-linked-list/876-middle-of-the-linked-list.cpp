/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        // ListNode *temp = head;
        // int size = 0;
        // while (temp != NULL) {
        //     size++;
        //     temp = temp->next;
        // }
        // int half = size/2;
        // temp = head;
        // while (half--) {
        //     temp = temp->next;
        // }
        // return temp;
        ListNode *slow=head, *fast = head;
        
        while (fast != NULL && fast->next != NULL) {
            slow =slow->next;
            fast = fast->next->next;
        }
        
        return slow;
        
    }
};