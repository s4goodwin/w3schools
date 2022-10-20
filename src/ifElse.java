public class ifElse {
    //https://www.w3schools.com/java/java_conditions.asp
    //Java supports the usual logical conditions from mathematics:
    //
    //    Less than: a < b
    //    Less than or equal to: a <= b
    //    Greater than: a > b
    //    Greater than or equal to: a >= b
    //    Equal to a == b
    //    Not Equal to: a != b
    //
    //You can use these conditions to perform different actions for different decisions.
    //
    //Java has the following conditional statements:
    //
    //    Use if to specify a block of code to be executed, if a specified condition is true
    //    Use else to specify a block of code to be executed, if the same condition is false
    //    Use else if to specify a new condition to test, if the first condition is false
    //    Use switch to specify many alternative blocks of code to be executed

    public static void main(String[] args) {
        //if statement to specify a block of Java code to be executed if a condition is true.
        //else statement to specify a block of code to be executed if the condition is false.

        int time = 22;
        if (time < 18){
            System.out.println("This 'if' will not print");
        } else {
            System.out.println("This 'else' will print");
        }

        //else if statement to specify a new condition if the first condition is false.
        //if (condition1) {
        //  // block of code to be executed if condition1 is true
        //} else if (condition2) {
        //  // block of code to be executed if the condition1 is false and condition2 is true
        //} else {
        //  // block of code to be executed if the condition1 is false and condition2 is false
        //}
        if (time < 10){
            System.out.println("This 'if' will not print");
        } else if (time < 20) {
            System.out.println("This 'else if' will not print");
        } else {
            System.out.println("This 'else' will print");
        }
    }
}
