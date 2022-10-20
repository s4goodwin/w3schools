public class math {
    //https://www.w3schools.com/java/java_math.asp
    //The Java Math class has many methods that allows you to perform mathematical tasks on numbers.

    public static void main(String[] args) {
        //Math.max(x,y) method can be used to find the highest value of x and y:
        System.out.println("Math.max of 5 and 10: "+ Math.max(5, 10));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //Math.min(x,y) method can be used to find the lowest value of x and y:
        System.out.println("Math.min of 5 and 10: "+ Math.min(5, 10));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //Math.sqrt(x) method returns the square root of x:
        System.out.println("Math.sqrt of 64: "+ Math.sqrt(64));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //Math.abs(x) method returns the absolute (positive) value of x:
        System.out.println("Math.abs of -4.7: "+ Math.abs(-4.7));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        System.out.println("Random number between 0 and 1: "+ Math.random());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //To get more control over the random number, for example, if you only want a random number between 0 and 100
        //you can use the following formula:
        int rngInt = (int)(Math.random()* 101);
        System.out.println("Random number between 0 and 100: "+ rngInt);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}
