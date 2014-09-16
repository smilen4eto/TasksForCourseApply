/*
 Implement a function with the following signature: ExOh(str)
 str is of type string.
 The function should return true if there is an equal number of x's and o's in str. It should return false otherwise.
 Things to know:
 Only these two letters will be entered in the string, no punctuation or numbers.
 You don't have to check for valid input.
 You can use any language you know.
 Examples:
 ExOh('xoxoox') # true
 ExOh('oooxoo') # false
 */
package NumExOhs;

public class NumExOhs {

    public static void main(String[] args) {
        System.out.println(ExOh("oooxoo"));
    }

    static boolean ExOh(String str) {
        String ExOhs = str;
        int countX = 0;
        int countO = 0;
        boolean result = false;
        for (int i = 0; i < ExOhs.length(); i++) {
            if (ExOhs.charAt(i) == 'x') {
                countX++;
            } else {
                countO++;
            }
        }
        if (countX == countO) {
            result = true;
        }
        return result;
    }
}
