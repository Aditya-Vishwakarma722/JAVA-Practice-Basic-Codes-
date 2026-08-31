# Hashing

This folder contains problems involving HashMap, HashSet, and hashing-based techniques in Java.

## HashMap

A HashMap stores data using a:

Key → Value

relationship.

Example:

HashMap<String, Integer> map = new HashMap<>();

map.put("Aditya", 90);
map.put("Rahul", 80);

Retrieval:

map.get("Aditya");

## HashSet

A HashSet stores unique values.

Example:

HashSet<Integer> set = new HashSet<>();

set.add(10);
set.add(20);
set.add(10);

The second 10 will not create another entry.

## Common HashMap Operations

- put()
- get()
- remove()
- containsKey()
- containsValue()
- size()
- isEmpty()

## Common HashSet Operations

- add()
- remove()
- contains()
- size()
- isEmpty()

## Concepts Practiced

- HashMap
- HashSet
- Frequency counting
- Fast lookup
- Duplicate detection
- Key-value relationships
- Counting occurrences
- Membership checking

## Problems

| Problem | Data Structure | Status |
|---|---|---|
| — | — | — |

## When Should I Think About Hashing?

Think about HashMap when:

"I need to associate one thing with another."

Think about HashSet when:

"I need to know whether something exists or has appeared before."

## Goal

Develop the ability to recognize when HashMap or HashSet can reduce unnecessary searching and improve the efficiency of a solution.
