package practice.strings;

public class StringsPractice {

    public static void main(String[] args) {

	    /*
	        Strings are not primitive types. They have a class. Can access characters of a string by index value.
            The second arg... up to but not including. Same as Python + JS
            Methods: string.equalsIgnoreCase(string), string.charAt(int), string.indexOf("there"), string.lastIndexOf
            ("yogi");
	     */

        String a = "hello";

        String substring = a.substring(0,3);
        String b = "there";

        // Comparing Strings
        if ( a == "hello") {
            // DO NOT DO THIS. Does not work with Strings.
        }

        // Proper way to compare strings
        if ( a.equals("hello")) {
            System.out.println("A equals hello!");
        }


//        System.out.println(a.length());
//        System.out.println(substring);

    }
}
