from traceback import print_list
from typing import Optional
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # creating a stack
        # pointer to move to stack
        stack = []
        curr = head
        while curr:
            stack.append(curr)  
            curr = curr.next

        new_head = None
        reverse_ind = 1
        while stack:
            node = stack.pop()
            if reverse_ind!= n:
                node.next = new_head
                new_head = node
            reverse_ind +=1
        return new_head
            
def print_list(node):
    while node:
        print(node.val, end=" -> ")
        node = node.next
    print("None")

# Test case
lst = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
sol = Solution()
new_head = sol.removeNthFromEnd(lst, 2)
print_list(new_head)
