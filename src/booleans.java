public class booleans {
    //https://www.w3schools.com/java/java_booleans.asp
    //Very often, in programming, you will need a data type that can only have one of two values, like:
    //
    //    YES / NO
    //    ON / OFF
    //    TRUE / FALSE
    //
    //For this, Java has a boolean data type, which can store true or false values.

    public static void main(String[] args) {
        //comparison operator, such as the greater than (>) operator, to find out if an expression
        //(or a variable) is true:
        int x = 10;
        int y = 9;
        System.out.println("This will print true: ");
        System.out.println(x > y);
        //or
        System.out.println(10 > 9);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //equal to (==) operator to evaluate an expression:
        System.out.println("This will print true: ");
        System.out.println(x == 10);
        System.out.println();
        System.out.println("This will print false: ");
        System.out.println(x == 5);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //>= comparison operator to find out if the age (25) is greater than OR equal to the voting age limit
        //which is set to 18:
        int myAge = 25;
        int votingAge = 18;
        System.out.println("This will print true: ");
        System.out.println(myAge >= votingAge);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}
