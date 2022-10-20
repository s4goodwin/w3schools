public class breakContinue {
    //https://www.w3schools.com/java/java_break.asp
    //break statement can also be used to jump out of a loop

    public static void main(String[] args) {
        //stops the loop when i is equal to 4:
        for (int i = 0; i < 10; i++){
            if (i == 4){
                break;
            }
            System.out.println(i);
        }
        //continue statement breaks one iteration (in the loop), if a specified condition occurs
        //and continues with the next iteration in the loop.

        //skips the value of 4:
        for (int i = 0; i < 10; i++){
            if (i == 4){
                continue;
            }
            System.out.println(i);
        }

        //break and continue in while loops:
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
            if (i == 4){
                break;
            }
        }
        while (i < 10){
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
