public class typeCasting {

    public static void main(String[] args) {
        //https://www.w3schools.com/java/java_type_casting.asp
        //Widening casting
        //Widening casting is done automatically when passing a smaller size type to a larger size type:
        int wideInt = 9;
        double wideDouble = wideInt;

        System.out.println(wideInt);
        System.out.println(wideDouble);

        //Narrow Casting
        //Narrowing casting must be done manually by placing the type in parentheses in front of the value:
        double narrowDouble = 9.78d;
        int narrowInt = (int) narrowDouble;

        System.out.println(narrowDouble);
        System.out.println(narrowInt);
    }
}
