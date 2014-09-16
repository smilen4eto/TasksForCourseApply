/*
 You have the implement a function, with the following signature: ABCheck(str).
 The argument str is of type string.
 The function should return true if the characters a and b are separated by exactly 3 places anywhere in the string at least once.
 Otherwise return false
 For example - "lane borrowed" would result in true because there is exactly three characters between a and b. .
 You can use any language you know.
 Examples:
 ABCheck("after badly") # false
 ABCheck("Laura sobs") # true
 */
package abcheck;

public class ABCheck {

    public static void main(String[] args) {
        System.out.println(ABCheck("aftehiuhuiiuu"));
    }

    static boolean ABCheck(String str) {
        String check = str;
        boolean result = false;
        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) == 'a' && check.charAt(i + 4) == 'b') {
            result = true;

            }
break;
        }
        return result;

    }
}
