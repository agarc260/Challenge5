/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package challenge5;

/**
 * @author 3624554
 *Title:            (Challenge 5)
* 
* Semester:         COP3804 - Spring 2022
* Lecturer's Name:  (Prof Charters)
*   Description of Program’s Functionality:
* program using a method to swap out x for y and y for x using three different string inputs
 * 
 */
public class Challenge5 {
/**
 * (this program will swap out x for y and vice versa)  
 *
 * @param (string word) (used as our input for the program to iterate through each char of the string and look for x or y)
 *
 * @return (if it finds a x or y for the string input then it will return a swapped out char for the substring)
 * Preconditions:
 * Postconditions:thiswill then print out the full string with the swapped chars where applicable
 */ 
public static String swapXY(String word) {
    if (word.length() < 1) {
        return word;
    }
    char n = word.charAt(0);
    
    if (word.charAt(0) == 'x') {
       n = 'y';
       word = 'y' + word.substring(1);
       
    }
    else if (word.charAt(0) == 'y') {
        n = 'x';
        word = 'x' + (word.substring(1));
        
    }
    return n + swapXY(word.substring(1));
}
    
    public static void main(String[] args) {
      
        System.out.println(swapXY("codex"));
        System.out.println(swapXY("yyhiyy"));
        System.out.println(swapXY("yhiyhiy"));
    }
    
}
