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
    ListNode* findMiddle (ListNode *head) {
        ListNode *slow = head;
        ListNode *fast = head;
        
        while (fast->next != NULL && fast->next->next != NULL) {
            slow = slow->next;
            fast = fast->next->next;
        }
        return slow;
    }
    
    ListNode* reverse(ListNode* head) {
        
        // create previous and current node
        
        ListNode *prevNode = NULL;
        ListNode *currentNode = head;
        
        while (currentNode != NULL) {
            ListNode *nextNode = currentNode->next;
            currentNode->next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
    }
    
    
    bool isPalindrome(ListNode* head) {
        
        // find middle node
        
        ListNode *middle = findMiddle(head);
        
        // reverse the list from middle
        
        ListNode *secondHalf = reverse(middle->next);
        
        // compare each value from first half and second half
        
        ListNode *firstHalf = head;
        while (secondHalf != NULL) {
            if (firstHalf->val != secondHalf->val) return false;
            firstHalf = firstHalf->next;
            secondHalf = secondHalf->next;
        }
        return true;
    }
};