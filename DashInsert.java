/*
You have to implement a function with the following signature - dashInsert(num)
    The argument num is of type integer.
    The function should return a string
Insert dashes '-' between each two neighboring odd numbers in num.
Don't count zero as an odd number.
Examples:
dashInsert(99946)
"9-9-946"
dashInsert(56730)
"567-30"
 */
package dashInsert;

public class DashInsert {

        public static void main(String[] args) {
        System.out.println(dashInsert(11443679));
    }

    static String dashInsert(int num) {

        int count = num;
        int nrDigits = 0;
        while (count > 0) {

            count = count / 10;
            nrDigits++;
        }
        String dashIns = "";
        int[] number = new int[nrDigits];
        int cnt = number.length - 1;
        while (num > 0) {
            int c = num % 10;
            num = num / 10;
            number[cnt] = c;
            cnt--;
        }

        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] % 2 != 0 && number[i + 1] % 2 != 0 && number[i]!=0 && number[i+1] !=0) {
                dashIns = dashIns + number[i] + "-";
                if (i == number.length - 2) {
                    dashIns = dashIns + number[i + 1];
                }
            } else {
                dashIns = dashIns + number[i];
                if (i == number.length - 2) {
                    dashIns = dashIns + number[i + 1];
                }
            }
        }
        return dashIns;
    }


}