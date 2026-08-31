# Strings

This folder contains problems and practice programs involving Strings in Java.

## What is a String?

A String is a sequence of characters.

Example:

String s = "Hello";

Characters can be accessed using:

s.charAt(index);

## Concepts Practiced

- String creation
- String traversal
- charAt()
- length()
- substring()
- equals()
- contains()
- indexOf()
- Character comparison
- String manipulation
- Palindromes
- Case conversion
- Character validation
- StringBuilder

## Problems

| Problem | Concept | Status |
|---|---|---|
| Longest Common Prefix | String Comparison | ✅ |
| Find Index of First Occurrence | String Searching | ✅ |
| Length of Last Word | String Traversal | ✅ |
| Add Binary | String / Binary | ✅ |
| Valid Palindrome | String / Two Pointer | ✅ |

## Important Java Rule

Use:

s.equals(other);

instead of:

s == other;

when comparing String contents.

For repeated String modifications, consider using:

StringBuilder

instead of repeatedly using String concatenation with +.

## Goal

Become comfortable with String traversal, comparison, manipulation, and recognizing when a String problem can be solved using techniques such as Two Pointers or StringBuilder.
