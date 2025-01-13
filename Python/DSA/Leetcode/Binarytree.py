class TreeNode:
    def __init__(self, val=0):
        self.val = val
        self.left = None
        self.right = None


class BinaryTree:
    def __init__(self):
        self.root = None

    def insert(self, val):
        node = TreeNode(val)
        if not self.root:
            self.root = node
            return

        queue = [self.root]
        while queue:
            curr = queue.pop(0)

            if not curr.left:
                curr.left = node
                return
            else:
                queue.append(curr.left)

            if not curr.right:
                curr.right = node
                return
            else:
                queue.append(curr.right)

    def inorder_traversal(self, node):
        if not node:
            return []
        result = []
        result += self.inorder_traversal(node.left)
        result.append(node.val)
        result += self.inorder_traversal(node.right)
        return result

    def delete(self, value):
        if not self.root:
            return None

        queue = [self.root]
        node_to_del = None
        parent_of_deepest = None
        deepest_node = None

        while queue:
            current = queue.pop(0)

            if current.val == value:
                node_to_del = current

            if current.left:
                parent_of_deepest = current
                queue.append(current.left)
            if current.right:
                parent_of_deepest = current
                queue.append(current.right)

            deepest_node = current

        if node_to_del:
            node_to_del.val = deepest_node.val
            if parent_of_deepest:
                if parent_of_deepest.right == deepest_node:
                    parent_of_deepest.right = None
                else:
                    parent_of_deepest.left = None
            elif self.root == deepest_node:
                self.root = None
        else:
            print("Value not found in the tree")

    def update(self, old_value, new_value):
        if not self.root:
            print("Tree is empty.")
            return

        queue = [self.root]
        while queue:
            current = queue.pop(0)
            if current.val == old_value:
                current.val = new_value
                return
            if current.left:
                queue.append(current.left)
            if current.right:
                queue.append(current.right)
        print(f"Value {old_value} not found in the tree.")

    def display_level_order(self):
        if not self.root:
            print("Tree is empty")
            return []

        result = []
        queue = [self.root]
        while queue:
            curr = queue.pop(0)
            result.append(curr.val)
            if curr.left:
                queue.append(curr.left)
            if curr.right:
                queue.append(curr.right)
        return result


if __name__ == "__main__":
    tree = BinaryTree()

    # Insert nodes into the tree
    tree.insert(10)
    tree.insert(20)
    tree.insert(30)
    tree.insert(40)
    tree.insert(50)
    tree.insert(60)
    tree.insert(70)

    # Display the tree in level order
    print("Tree in level order:", tree.display_level_order())

    # Inorder traversal
    print("Inorder traversal:", tree.inorder_traversal(tree.root))

    # Update a node
    print("Updating value 20 to 25")
    tree.update(20, 25)
    print("Tree in level order after update:", tree.display_level_order())

    # Delete a node
    print("Deleting value 30")
    tree.delete(30)
    print("Tree in level order after deletion:", tree.display_level_order())

    # Inorder traversal after deletion
    print("Inorder traversal after deletion:", tree.inorder_traversal(tree.root))
