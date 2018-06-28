package in.rv.study.ssa;

import java.util.arrays;
import java.util.scanner;

/*
 * ssa -> simple school assignments
 *
 * given two words check if 2nd world contains exactly same characters that are in word1
 *
 */
public class check2wordscharmatch {

	public static void main(string[] args) {
		// todo auto-generated method stub
		scanner console = new scanner(system.in);
		system.out.println("type word 1");
		string strword1 = console.nextline();

		system.out.println("type word 2");
		string strword2 = console.nextline();

		char[] chararray1 = strword1.touppercase().tochararray();
		arrays.sort(chararray1);

		char[] chararray2 = strword2.touppercase().tochararray();
		arrays.sort(chararray2);

		if (

		(arrays.tostring(chararray1)).equals((arrays.tostring(chararray2))

		)

		) {

			system.out.println("matches!!");

		} else {
			system.out.println("no match!!");
		}

	}

}
