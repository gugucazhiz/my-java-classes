public class f25 {
    public static void main(String[] args){
        /* printf() = an optional method to control, format, and display text
         * on the console window 
         * two arguments = format string + (object/variable/value)
         * % [flags] [precision] [width] [conversion-character]
         */

         boolean myBoolean = true;
         char myChar = '@';
         String myString = "Broo";
         int myint = 50;
         double myDouble = 10000;

         System.out.printf("%b",myBoolean);
         System.out.printf("%c",myChar);
         System.out.printf("%s",myString);
         System.out.printf("%d",myint);
         System.out.printf("%f",myDouble);
         
         System.out.println("\n");
         // [width]
         // minimum number of characters to be written as output
         System.out.printf("Hello %10s",myString);

         System.out.println("\n");

         //[Precision]
         // sets numbers of digits of precision when outputting floating poit values
         System.out.printf("You have this ammount of money %.2f",myDouble);
    }
}
