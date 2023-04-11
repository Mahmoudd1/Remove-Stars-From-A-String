# Remove-Stars-From-A-String

You are given a string s, which contains stars *.

In one operation, you can:

- Choose a star in s.
- Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.

Note:

- The input will be generated such that the operation is always possible.
- It can be shown that the resulting string will always be unique.

## Example 1 :

Input: s = "leet**cod*e"

Output: "lecoe"

Explanation: Performing the removals from left to right:

- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".

There are no more stars, so we return "lecoe".

## Example 2:

Input: s = "erase*****"

Output: ""

Explanation: The entire string is removed, so we return an empty string.

## Solution 
To solve this problem, we can iterate through the string character by character and use a stack to keep track of the previous non-star character.
Whenever we encounter a star, we can pop the previous non-star character from the stack and continue iterating through the string.

- we initialize a StringBuilder to store the final output, and a Stack to store the previous non-star characters.
- We iterate through the string s character by character, and if the current character is not a star, we push it onto the stack. If the current character is a star, we check if the stack is not empty, and pop the top element from the stack.

- After iterating through the entire string, we pop all remaining elements from the stack and append them to the StringBuilder. 
- Finally, we reverse the StringBuilder and return it as a string.
