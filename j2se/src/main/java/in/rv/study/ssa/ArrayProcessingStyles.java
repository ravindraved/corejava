package in.rv.study.ssa;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProcessingStyles {
    static ArrayList<String> name;
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    /*

    refer to good article
    https://blog.takipi.com/benchmark-how-java-8-lambdas-and-streams-can-make-your-code-5-times-slower/

     */

    public static void main(String[] args) {


        loadArray();

        String[] strArray = new String[name.size()];
        strArray = name.toArray(strArray);
        processUsingWhileLoop(strArray);
        processUsingStream(strArray);
        processUsingParallalStream(strArray);

    }

    private static void processUsingStream(String[] strArray) {
        StringBuffer sb = new StringBuffer();

        long startTime = System.currentTimeMillis();
        Arrays.stream(strArray).filter(s -> s.charAt(0) == 'A').forEach(s -> sb.append(s));

        long endTime = System.currentTimeMillis();
        System.out.println("Stream-Lambda -> Time taken in ms = " + (endTime - startTime));

    }

    private static void processUsingParallalStream(String[] strArray) {
        StringBuffer sb = new StringBuffer();

        long startTime = System.currentTimeMillis();
        Arrays.stream(strArray).parallel().filter(s -> s.charAt(0) == 'A').forEach(s -> sb.append(s));

        long endTime = System.currentTimeMillis();
        System.out.println("Parallal Stream-Lambda -> Time taken in ms = " + (endTime - startTime));

    }

    private static void processUsingWhileLoop(String[] strArray){

        StringBuffer sb = new StringBuffer();

        long startTime = System.currentTimeMillis();

        for (int i=0; i<strArray.length; i++){
            if(strArray[i].charAt(0) == 'A'){
                sb.append(strArray[i]);
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("While Loop -> Time taken in ms = " + (endTime - startTime));


    }
    private static void loadArray() {
        long startTime = System.currentTimeMillis();

        int arrayLength = 19990000;
        name = new ArrayList<String>(arrayLength);
        while (arrayLength != 0) {

            String s = randomAlphaNumeric(10);
            name.add(s);
            // System.out.println(s);


            arrayLength--;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Array Creation -> Time taken in ms = " + (endTime - startTime));


    }

    public static String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }
}
