/*
   The University of Melbourne
   School of Computing and Information Systems
   COMP90041 Programming and Software Development
   Lecturer: Prof. Rui Zhang
   Semester 1, 2019, Week 10
   Workshop Sample Solution
   Copyright The University of Melbourne 2018
*/
/* This class is used to demonstrate exception handling
   Jianzhong Qi, 27 January 2015
*/

public class NegativeNumberException extends Exception {

    // Must to have these two constructors
    public NegativeNumberException() {
        super("Negative Number Not Allowed!");
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}
