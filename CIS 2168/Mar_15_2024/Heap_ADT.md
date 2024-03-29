# Heaps Abstract Data Type

## Complete Binary Tree

Binary tree. Empty or node with links to left and right binary trees.

Complete tree. Perfectly balanced, except for bottom level.

## Binary Heap Representations

Binary heap. Array representation of a heap-ordered binary tree

Heap-ordered binary tree.

- Key in nodes.
- Parent's key no smaller than children's keys.

Array representation

- Indices start at 1.
- No explicit links needed!

For each element at i has chidren at $i$ with left child being $2i$ and right child being $2i +1$.

## Binary heap properties

### Max-Heap Property

-A parent's key is never smaller than it's children's keys.

### Min-Heap Property

- A parent's key is never larger than it's children's keys.

## Storing Heaps in Arrays

Heap elements can be arranged inside arrays. The elements will go into the array positions according to a scheme that will make it easy to find any node's parent or children. The scheme is:

- The $n$ nodes of the tree are numbered 1, 2, ..., $n$, and their values are stored in an array of $n +1$ elements at indexes 1, 2, ... , n; the zeroth index of $a$ is ignored

## Heap construction

This is all it takes to build the heap:

```
for (int k = N/2; k>=1; k--)
    sink(a, k, N);
```
