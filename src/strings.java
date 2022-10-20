public class strings {
    //https://www.w3schools.com/java/java_strings.asp
    //A String in Java is actually an object, which contain methods that can perform certain operations on strings.
    public static void main(String[] args) {
        //The length of a string can be found with the length() method:

        String txt1 = "this is 18 letters";
        System.out.println(txt1.length());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //toUpperCase() and toLowerCase():
        String txt2 = "Hello World";
        System.out.println("Regular: "+ txt2);
        System.out.println("To uppercase: "+ txt2.toUpperCase());
        System.out.println("To lowercase: "+ txt2.toLowerCase());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


        //indexOf() method returns the index (the position) of the first occurrence of a
        //specified text in a string (including whitespace):
        //Java counts positions from zero

        String txt3 = "The word locate is at 9";
        System.out.println("The string is :"+ txt3);
        System.out.println(txt3.indexOf("locate"));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }


}
