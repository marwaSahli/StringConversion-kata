# String conversion kata

In this Kata, you will create a function that converts a string with letters and numbers to the inverse of that string (with regards to Alpha and Numeric characters). 

The letter a will become 1 and number 1 will become a; z will become 26 and 26 will become z etc ...

Example: "b8srgv24" would become "2h1918722x"

Numbers representing letters (n <= 26) will always be separated by letters, for all test cases:

"x25v" may be tested, but not "x252v"
"dfr9i" may be tested, but not "dfr98i"


A list named alphabet is pre-loaded for you: ['a', 'b', 'c', ...]

==========================

# Suggested Test


With the expression "b8srgv24" , it will print : "2h1918722x"