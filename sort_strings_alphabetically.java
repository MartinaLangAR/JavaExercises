/* Task 1:
   Write a recusive Sorting Algorithm for Char Arrays
*/


import java.util.Arrays;

class SortingAlgorithms{

    private static char[] castToChar(String string_item){
        String lowerd = string_item.toLowerCase();
        char[] chars = new char[string_item.length()];
        lowerd.getChars(0, string_item.length(), chars, 0);
        return chars; 
    }

    public static boolean isOrdered(char[] item1, char[] item2){
        if (item1.length == 0 || item2.length == 0){
            //if we did not break until one word runs out of charcters,
            // they must be ordered
            return true;
        }
        if (item1[0] > item2[0]){
            //if first letter is not ordered, whole words are not ordered
            return false;
        }
        if (item1[0] < item2[0]){
            // if first letters are ordered, but not equal
            // the words are ordered
            return true;
        }

        //call method recursivly
        char[] item1_sliced = Arrays.copyOfRange(item1,1, item1.length);
        char[] item2_sliced = Arrays.copyOfRange(item2,1, item2.length);

        return isOrdered(item1_sliced, item2_sliced);
    }

    public static void main(String args[]){
        System.out.println("Hello Java!");

        char[] first_chars = castToChar("Apples");
        char[] second_chars = castToChar("Pear");

        boolean sorted1 = isOrdered(first_chars, second_chars);
        boolean sorted2 = isOrdered(second_chars, first_chars);

        System.out.println(sorted1);    
        System.out.println(sorted2);    

    }
}