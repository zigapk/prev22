# Prev 2022

This repository contains my submissions for the Compilers subject at the Faculty of Computer Science at University of 
Ljubljana in the year 2022.

**Not everything works**. Notably, there are some issues when recursion, negation and conditional statements are used 
together. The 8-queens problem had to be written in just the right way in order for it to work.

The final (pre)exam task was to change the compiler in such a way, that each function can only be called N times at once. 
This means that in the entire call tree, there can only be N calls of a certain function from the main function to each 
of the leaves.

The easies solution was to reserve a counter for each of the functions. In an epilogue, the counter is incrented and 
checked against N. If the counter exceeds N, the program halts. The counter is then decremented in the prologue. The 
solution did not have to work in order to pass the exam - a good explanation worked as well.
