# LAB-4

### GitHub update
I have found that you can create folders on GitHub by going to the "create new file" button on the code screen of the repository, then typing in the name of the folder you want, a '/', and then the name of a file (you can use "test.md" if you don't know what file name you need.)

This will then allow you to create the file you want to submit the same way inside that folder, and then pasting the code you created into it.  I have noticed that GitHub has some issue formatting code, so you will need to do some formatting after you paste it.

This is an alternative to cloneing the repo, and then commmitting your changes, pushing them to your repo, and then creating a pull request for your changes.

### Components of the lab
We have been talking about functions, and for this lab, I am going to ask you to work with function in creating your programs.
I would like you to complete what you can prior to next Wednesday's Lecture.

* Write a program to take in a string, have a function that will reverse the string.  Call this function, and then print the reversed result.
* Write a program to convert a temperature from F to C.  Put the logic in a function. 
* Write a program that will print out the side lengths of a triangle given the three vetices (one point per line in the form "# #".)  You may assume that the vertexes of the triangle lie on integer coordinates.  (use functions as you feel it is useful.)
* Sorting:  There are multiple ways to implement sorting.  I want you to think through how you might sort a list of integers, and then write a program that will sort the numbers in that way.  Use a function for the sort opporation of your program, and in this function call another function to state weatehr you need to make a change or not with the cards you are looking at (the cards the program should be looking at). This progrm will need to use an array to store the number in.

#### Recursion

* Write a program that takes an integer, and prints the factorial of the integer.  ex: 5 factorial is 5 * 4 * 3 * 2 * 1
* Write a program that will calculate the number of cannon balls in a trinagular pyramid that has the intered integer number of rows.
(Note: this means that any layer of the pyramid has an equalateral triangle of cannonballs.  The top layer has 1 cannon ball, the one below that has 3, etc.)
* Use recursion to determin if a string passed in is a palindrome.  Your program will be given a string.


#### Dynamic Programing with Memoization

* Modify the cannon ball program to calculate the number of cannon balls in a layer by figureing out the number of cannon balls in a row.  Then add in memoization to help this proces go quicker.  (This is to get you comfortable with the concept with a problem you already have experience with.)
* Write a program to find the smalest cost to travel from the top of an equalateral triangle to the bottom.  Your program should ask for the number of rows, and then should expect the correct number of numbers to follow that (first line has one number, the next has 2, and it increases by 1 each step.)  This is the problem we talked about on the board.  You may want to look at two deminsional arrays to help with this (but they are nto required.)
* Write a program that when given a sequence of integers (not nessicarilly positive) will find the maximum sum of a connected segment of them.  Your program will be given a number when it is run to say how many numbers it should pull in to be computing this on.  It will then be given that number of numbers. I strongly suggest working out on paper how you would approach this problem, and then try to see how to shift that approach to small enough steps the computer could do them. Ex:  5    3 -4  2 -1 5      
