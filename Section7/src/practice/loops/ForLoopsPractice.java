package practice.loops;

public class ForLoopsPractice {

    public static void main(String args[]) {

        String str = "aldkncoiwne;lkjfadfljk";

        // just like javascript
        for ( int i = 0; i < str.length() ; ++i ) {
            System.out.println("char: " + str.charAt(i));
        }

        // reverse exercise
        for ( int i = str.length() - 1 ; i >= 0; --i ) System.out.println(str.charAt(i));


        // print out even numbers 0 - 100 inclusive

        for ( int i = 0; i <= 100; i++) if (i % 2 == 0) System.out.println(i);

        int counter = 0;
        // Testing out the debugger
        for ( int i = 0; i <= 100; i++ ) {
            System.out.println(i);
            int temp = counter + 1;
            counter = temp;
        }

        // Nested For Loop
        // Look to add breaks if input of data grows large. Any excuse to break out and not iterate over everything.
        for ( int idx = 0; idx < 100; idx++) {

            for ( int j = 0; j < 10; j++) {
                System.out.println("The value of idx was " + idx + "-------" + j);
            }
        }

    }

}
