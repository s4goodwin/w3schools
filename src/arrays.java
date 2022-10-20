public class arrays {
    //https://www.w3schools.com/java/java_arrays.asp
    //Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

    //To declare an array, define the variable type with square brackets:
    //To insert values to it, you can place the values in a comma-separated list, inside curly braces:
    public static void main(String[] args) {
        String[] cars = {"escape", "fusion", "taurus", "edge", "explorer"};

        //access an array element by referring to the index number.
        System.out.println(cars[0]);

        //change the value of a specific element, refer to the index number:
        cars[0] = "four hundred";
        //will output four hundred
        System.out.println(cars[0]);

        //Use length property to find out how many elements an array has
        System.out.println("This is length of cars array: "+ cars.length);


    }
}
