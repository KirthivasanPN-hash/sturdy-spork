from typing import Optional

class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random


class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        # Special case: if the list is empty
        if not head:
            return None
        
        # Create a dictionary to store old-to-new node mappings
        oldToCopy = {None: None}
        
        # First pass: create all nodes and store in the dictionary
        curr = head
        while curr:
            copy = Node(curr.val)
            oldToCopy[curr] = copy
            curr = curr.next
        
        # Second pass: assign next and random pointers
        curr = head  # Correctly reset curr to iterate again
        while curr:
            copy = oldToCopy[curr]
            copy.next = oldToCopy[curr.next]
            copy.random = oldToCopy[curr.random]  # Properly assign random pointer
            curr = curr.next
        
        return oldToCopy[head]


# Helper function to print the list (both value and random pointers)
def print_list(head):
    curr = head
    while curr:
        random_val = curr.random.val if curr.random else 'None'
        print(f"Node val: {curr.val}, Random val: {random_val}")
        curr = curr.next
    print("None")


# Test case to create a list with random pointers and test the copy
def test_copy_random_list():
    # Creating a linked list: 1 -> 2 -> 3 -> None
    node1 = Node(1)
    node2 = Node(2)
    node3 = Node(3)
    node1.next = node2
    node2.next = node3

    # Setting up random pointers
    node1.random = node3  # 1's random points to 3
    node2.random = node1  # 2's random points to 1
    node3.random = node2  # 3's random points to 2

    # Printing the original list
    print("Original List:")
    print_list(node1)

    # Copying the list
    solution = Solution()
    copied_list = solution.copyRandomList(node1)

    # Printing the copied list
    print("Copied List:")
    print_list(copied_list)


# Call the test case
test_copy_random_list()
