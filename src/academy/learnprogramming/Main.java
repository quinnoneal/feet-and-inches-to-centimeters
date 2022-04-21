package academy.learnprogramming;

/****
 * Tim Bulchaka's Java Programming Masterclass
 * My Original Method Overloading Challenge Solution
 ****/

public class Main {

    /*
    Calculates feet and inches to centimeters
    Returns -1 if feet are < 0 or if inches are > 12
     */
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        double retVal;
        int totalInches;

        if ((feet < 0) || (inches < 0 || inches > 12)) {
            retVal = -1;
        } else {
            totalInches = (feet * 12) + inches;
            retVal = totalInches * 2.54;
        }
        return retVal;
    }

    /*
    Calculates inches to cm
    returns -1 if inches are < 0
     */
    public static double calcFeetAndInchesToCentimeters(int inches) {
        int feet;
        int inchesRemainder;
        double retVal = -1;

        if (inches < 0) {
            return retVal;
        } else if (inches >= 12) {
            feet = inches / 12;
            inchesRemainder = inches % 12;
            retVal = calcFeetAndInchesToCentimeters(feet, inchesRemainder);
        }
        return retVal;
    }



}
