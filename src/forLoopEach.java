public class forLoopEach {
    //https://www.w3schools.com/java/java_for_loop.asp
    //When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop
    //Statement 1 is executed (one time) before the execution of the code block.
    //
    //Statement 2 defines the condition for executing the code block.
    //
    //Statement 3 is executed (every time) after the code block has been executed.
    public static void main(String[] args) {
        //print the numbers 0 to 4:
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        //print even values between 0 and 10:
        for (int i = 0; i <= 10; i = i + 2){
            System.out.println(i);
        }

        //for-each" loop, which is used exclusively to loop through elements in an array

        //outputs all elements in the cars array, using a "for-each" loop:
        String[] cars = {"escape", "fusion", "edge", "taurus"};
        for (String i : cars){
            System.out.println(i);
        }
    }
}
