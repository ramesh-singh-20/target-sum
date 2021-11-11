# target-sum

##Problem Statement
GGiven an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.

##Solutions

###Approach 1
Run 2 for loops, checking the sum of outer index with inner index, if equal to sum return the indexes.
Time Complexity: O(n2)
Space Complexity: O(1)

###Approach 2
Sort the array, iterate the array keeping two pointers left and right, and checking the sum of indices
and moving towards the middle of the array accordingly.
Time Complexity: O(nLogn)
Space Compexity: O(1)

###Approach 3
Iterate array only once and story the difference of the number with the target in a hashmap as key and 
value as indices, if key and number already there return the indices.
Time Complexity: O(n)
Space Complexity: O(n)