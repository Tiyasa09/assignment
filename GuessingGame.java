package operator1;

import java.util.*;
class Game{
    public int number,inputNumber;
    public int noOfGuesses = 0;
    public int getNoOfGuesses() { //getter for number number of Guesses
        return noOfGuesses;
    }
 public void setNoOfGuesses(int noOfGuesses) {  //setter for number of Guesses
        this.noOfGuesses = noOfGuesses;
    }
 Game(){   //constructor to generate random numbers
        Random rand = new Random();  //creating object rand of Random Class
        this.number = rand.nextInt(100);  //generating random integer number within 100 inside number variable
    }
    void takeUserInput(){   //method to take a user input of number
        System.out.println("Guess the number within 100:");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){  //method to detect whether the number entered by the user is true
        noOfGuesses++; //counter
        if (inputNumber==number){
            System.out.format("Yes you guessed it right!!! It was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high..."); 
            }
        return false; } }
public class GuessingGame {   //Main class
    public static void main(String[] args) {   //main method
       Game g = new Game();
        boolean b= false;
        while(!b){
        g.takeUserInput();
        b = g.isCorrectNumber(); } } }
