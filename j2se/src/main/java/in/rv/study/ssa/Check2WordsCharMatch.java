package in.rv.study.ssa;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ssa -> Simple School Assignments
 *
 * Given two words check if 2nd world contains exactly same characters that are in word1
 *
 */
public class Check2WordsCharMatch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner console = new Scanner(System.in);
        System.out.println("Type Word 1");
        String strWord1 = console.nextLine();

        System.out.println("Type Word 2");
        String strWord2 = console.nextLine();

        if (
                (strWord1.length() == strWord2.length()) &&
                        (strWord1.length() != 0)

                ) {

            char[] charArray1 = strWord1.toUpperCase().toCharArray();
            Arrays.sort(charArray1);

            char[] charArray2 = strWord2.toUpperCase().toCharArray();
            Arrays.sort(charArray2);

            if (

                    (Arrays.toString(charArray1)).equals(
                            (Arrays.toString(charArray2))

                    )

                    ) {

                System.out.println("Matches!!");


            } else {
                System.out.println("No Match!!");
            }

        } else {
            System.out.println("No Match!!");
        }

    }

}
