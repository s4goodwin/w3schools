public class switchs {
    //https://www.w3schools.com/java/java_switch.asp
    //Instead of writing many if...else statements, you can use the switch statement
    //The switch statement selects one of many code blocks to be executed
    //This is how it works:
    //
    //    The switch expression is evaluated once.
    //    The value of the expression is compared with the values of each case.
    //    If there is a match, the associated block of code is executed.
    //    The break and default keywords are optional, and will be described later in this chapter

    public static void main(String[] args) {
        //weekday number to calculate the weekday name:
        int day = 4;
        switch (day){
            case 1:
                System.out.println("Sun");
                break;
            case 2:
                System.out.println("Mon");
                break;
            case 3:
                System.out.println("Tues");
                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Thurs");
                break;
            case 6:
                System.out.println("Fri");
                break;
            case 7:
                System.out.println("Sat");
                break;
            default:
                System.out.println("No case match");
            //break keyword, it breaks out of the switch block.
            //This will stop the execution of more code and case testing inside the block.
            //When a match is found, and the job is done, it's time for a break. There is no need for more testing.

            //The default keyword specifies some code to run if there is no case match:
        }
    }
}
