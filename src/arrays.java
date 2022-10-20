public class arrays {
    //https://www.w3schools.com/java/java_arrays.asp
    //https://www.w3schools.com/java/java_arrays_loop.asp
    //https://www.w3schools.com/java/java_arrays_multi.asp
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

        //loop through the array elements with the for loop, and use the length property to specify
        //how many times the loop should run.
        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        //"for-each" loop, which is used exclusively to loop through elements in arrays:
        for (String i : cars){
            System.out.println(i);
        }
        //compare the for loop and for-each loop, you will see that the for-each method is easier to write
        //it does not require a counter (using the length property), and it is more readable.

        //A multidimensional array is an array of arrays.

        //To create a two-dimensional array, add each array within its own set of curly braces:
        int[][] myNumbers = {{1, 2, 3, 4, 5},{6, 7, 8, 9}};

        //To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the
        //element inside that array. This example accesses the third element (2) in the second array (1) of myNumbers:
        int x = myNumbers[1][2];
        System.out.println(x);

        //also use a for loop inside another for loop to get the elements of a two-dimensional array
        //(we still have to point to the two indexes):
        for (int i=0; i<myNumbers.length; i++){
            for (int j=0; j< myNumbers[i].length; j++){
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
