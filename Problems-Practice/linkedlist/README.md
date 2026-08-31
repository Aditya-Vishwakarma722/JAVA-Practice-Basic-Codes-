# Linked List

This folder contains problems and practice programs based on Linked Lists.

## What is a Linked List?

A Linked List consists of nodes where each node stores:

1. A value
2. A reference to the next node

Example:

1 → 2 → 3 → 4 → null

A basic node:

class ListNode {
    int val;
    ListNode next;
}

## Concepts Practiced

- Creating nodes
- Traversing a Linked List
- Head
- Current node
- Next node
- Inserting nodes
- Removing nodes
- Updating links
- Handling null
- Singly Linked Lists
- Two-pointer techniques
- Pointer manipulation

## Problems

| Problem | Concept | Status |
|---|---|---|
| Merge Two Sorted Lists | Linked List / Two Pointer | ✅ |
| Remove Duplicates from Sorted List | Linked List / Pointer Manipulation | ✅ |

## Important Mental Model

Unlike Arrays, Linked List problems are primarily about manipulating references.

For example:

current.next = current.next.next;

This does not copy a value.

It changes the connection between nodes.

## Common Mistakes

- Forgetting to check for null
- Losing the head node
- Returning current instead of head
- Confusing current.next with current.next.val
- Accidentally breaking the list
- Moving the pointer at the wrong time

## Goal

Develop a strong understanding of nodes, references, traversal, and pointer manipulation.
