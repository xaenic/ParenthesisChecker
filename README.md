# Parenthesis Checker

This is a Java program that checks if a string of characters has balanced parentheses. The program starts by defining a package and importing several classes that it will use later. Then, it defines a class called ParenthesisChecker that contains a main method and two helper methods: isBalance and isPair.

The main method is the entry point of the program. It starts by trying to open a file called file.txt. If it cannot find the file, it prints an error message. Otherwise, it reads the file line by line, trims any whitespace from the beginning and end of each line, and passes each line to the isBalance method. If the isBalance method returns true, it prints that the line is "Balanced", otherwise it prints that the line is "Unbalanced".

The isBalance method checks if a string has balanced parentheses. It does this by iterating through each character in the string and using a stack to keep track of the open parentheses. If the character is an open parenthesis, it pushes the character onto the stack. If the character is a closing parenthesis, it checks if the top of the stack forms a matching pair with the current character. If it does not, it returns false to indicate that the string is not balanced. If the loop completes without returning false, it checks if the stack is empty and returns true if it is empty and false otherwise.

The isPair method checks if two characters form a matching pair of parentheses. It does this by concatenating the two characters into a string and comparing the resulting string to a set of known matching pairs. If the string matches one of the known pairs, it returns true, otherwise it returns false.

<img src="https://6a6feeae-6e2b-49df-9ed4-2480d42a5083.id.repl.co/images/p4.png"/>
