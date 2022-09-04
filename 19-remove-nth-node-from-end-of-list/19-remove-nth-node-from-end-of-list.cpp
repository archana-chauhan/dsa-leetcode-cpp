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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if (head->next == NULL) return NULL;
        
        int size = 0;
        ListNode *currentNode = head;
        while (currentNode != NULL) {
            currentNode = currentNode->next;
            size++;
        }
        
        if (n == size) return head->next;
        
        
        int index  = size-n;
        int i = 1;
        ListNode *prevNode = head;
        while (i < index) {
            prevNode = prevNode->next;
            i++;
        }
        prevNode->next = prevNode->next->next;
        return head;
    }
};