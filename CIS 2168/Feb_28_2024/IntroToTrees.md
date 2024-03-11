# Intro To Trees

A tree is a collection of objects called nodes; each node is linked to one or more nodes. By following the links between the nodes, you can get to any other node without ever having to follow the same link more than once, there is no way you can start from any node and ever end up at the same node again. There is only one wya of getting from any node to any other.

## Definitions and Terms

This picture shows a few key terms associated with binary trees. Two links emanate from each node

![Key terms of binary code](/Feb_28_2024/Screenshot%202024-02-28%20130511.png)

### Definition of a Rooted Binary Tree

- Basic Step: An empty object, denoted by null o Ø is a binary tree.

- Recursive: if T^1, and T^2 are disjoint binary trees, then there is a binary tree T consisting of a new node r called root together withedges connecting r to the roots of T^1, and T^2.

T^1 is called the left subtree, and T^2 is called the right of the subtree.

### Height of A tree

basis step: IF the tree is empy, then its size is 0.

### Binary Search Trees

recursive step: height(T) = 1 + max(height(t1),height(t2))

### Complete Binary Trees adn Full Binary Trees

A complete binary tree is a binary tree whose every level -except

A full tree is if each of its nodes is either a leaf or exactly two child nodes. So the trees...

### Tree Traversals

We'll often need to traverse a tre so that we visit each node exactly once. Of the many different ways of doing this, we'll point out three classic tree traversals.

#### Preorder

1. Visit root
2. Traverse the left subtree
3. Travserse the right subtree

#### Inorder

1. Traverse the left tree
2. Visit root
3. Traverse the right subtree

#### Postorder

1. Traverse left subtree
2. Traverse right subtree
3. Visit root

##### Binary Search Tree Property
