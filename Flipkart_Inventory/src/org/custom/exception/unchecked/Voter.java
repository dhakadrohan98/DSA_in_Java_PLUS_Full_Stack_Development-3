package org.custom.exception.unchecked;

//Unchecked Exception
class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Voter {

    public void checkEligibility(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to vote.");
        }
        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {
        Voter voter = new Voter();
        voter.checkEligibility(16); // Throws exception
    }
}
