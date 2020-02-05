package practice.loops;

public class WhileLoopsPractice {

    public static void main(String args[]) {

        String str = "We have a large inventory of things in our warehouse falling in the category:apparel and the " +
                "slightly more in demand category:makeup along with the category:furniture and ...";

        printCategories(str);
    }

    // substring, indexOf (returns -1 if no string found), while
    public static void printCategories(String str) {
        int categoryLocation;
        int categorySearchIndex = 0;
        int categoryLength = "category:".length();

        while ( true ) {

            categoryLocation = str.indexOf("category", categorySearchIndex);
            if (categoryLocation == -1) break;
            String partialString = str.substring(categoryLocation + categoryLength);
            int spaceFinder = partialString.indexOf(" ");
            String categoryValue = partialString.substring(0, spaceFinder);
            int categoryValueLength = categoryValue.length();
            System.out.println(categoryValue);

            categorySearchIndex = categoryLocation + categoryValueLength;
        }
    }
}
