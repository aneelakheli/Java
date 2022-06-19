public class ElseIfLadder {
    public static void main(String[] args) {
        int marks = 90;
        // the output is you are passed with Distinction
        if (marks < 35) {
            System.out.println("Sorry, you are failed");
        } else if (marks >= 36 && marks < 49) {
            System.out.println("you are passed in Third Division");
        } else if (marks >= 50 && marks < 59) {
            System.out.println("You are passed in Second division");
        } else if (marks >= 60 && marks < 79) {
            System.out.println("You are passed in First Division");
        } else if (marks >= 80 && marks < 100) {
            System.out.println("You are passed in Distinction");
        } else {
            System.out.println("invalid number");
        }

    }
}