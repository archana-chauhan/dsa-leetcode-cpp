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
    ListNode* removeElements(ListNode* head, int val) {
        
        ListNode* current = head;
        ListNode* prev = head;
        if (current == NULL) {
            return NULL;
        }
        
        while (head != NULL && head->val == val) {
            head = head->next;
        }
        
        
        while (current != NULL) {
            if (current->val == val) {
                prev->next = current->next;
                current = current->next;
            }
            else {
                prev = current;
                current = current->next;
            }
        }        
        return head;
    }
};