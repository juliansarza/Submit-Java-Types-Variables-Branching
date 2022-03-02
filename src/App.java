public class App {
    public static void main(String[] args) throws Exception {

        // // 6. Using Variables
        // int myNumber = 88;
        // short myShort = 847;
        // long myLong = 9797;

        // double myDouble = 7.3243;
        // float myFloat = 324.3f;

        // char myChar = 'y';
        // boolean myBoolean = false;

        // byte myByte = 127;


        // System.out.println(myNumber);
        // System.out.println(myShort);
        // System.out.println(myLong);
        // System.out.println(myDouble);
        // System.out.println(myFloat);
        // System.out.println(myChar);
        // System.out.println(myBoolean);
        // System.out.println(myByte);

        // // 7. Strings: Working With Text
        // int myInt = 7;

        // String text = "Hello";

        // String blank = " ";

        // String name = "Bob";

        // String greeting = text + blank + name;

        // System.out.println(greeting);


        // System.out.println("Hello" + " " + "Bob");

        // System.out.println("My integer is: " + myInt);

        // double myDouble = 7.8;

        // System.out.println("My number is: " + myDouble + ".");

        // // 8. While Loops
        // int value = 0;

        // while(value < 10)
        // {
        //     System.out.println("Hello " + value);

        //     value = value + 1;
        // }

        // // 9. For Loops
        // for(int i=0; i < 5; i++) {
        //     System.out.printf("The value of i is: %d\n", i);
        // }

        // 10. "if" (Getting User Input)
        int loop = 0;

        while(true) {
            System.out.println("Looping: " + loop);

            if(loop == 5) {
                break;
            }
            loop++;

            System.out.println("Running");
        }

    }
}
