# Bulls and Cows

It is my own advanced version of the classic code breaking game "Bulls and Cows". I started with recreating the original version of the game and then take it to a new level.

The greater-than symbol followed by a space (> ) represents the user input. Notice that it's not part of the input.

## Example 1

<pre>
Input the length of the secret code:
> 6
Input the number of possible symbols in the code:
> 5
Error: it's not possible to generate a code with a length of 6 with 5 unique symbols.
</pre>

## Example 2

<pre>
Input the length of the secret code:
> 6
Input the number of possible symbols in the code:
> 5
Error: it's not possible to generate a code with a length of 6 with 5 unique symbols.
</pre>

## Example 3

<pre>
Input the length of the secret code:
> abc 0 -7
Error: "abc 0 -7" isn't a valid number.
</pre>

## Example 4

<pre>
Input the length of the secret code:
> 6
Input the number of possible symbols in the code:
> 37
Error: maximum number of possible symbols in the code is 36 (0-9, a-z).
</pre>

## Example 5

<pre>
Input the length of the secret code:
> 0
Error: input cannot be 0.
</pre>

## Example 6

<pre>
Input the length of the secret code:
> 4
Input the number of possible symbols in the code:
> 12
The secret is prepared: **** (0-9, a-b).
Okay, let's start a game!
Turn 1:
> a234
Grade: 1 bull and 1 cow
Turn 2:
> 73b4
Grade: 2 bulls and 1 cow
Turn 3:
> 9374
Grade: 4 bulls
Congratulations! You guessed the secret code.
</pre>