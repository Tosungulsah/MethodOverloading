package utilities;

import java.util.Arrays;

public class ArraysUtility {
    //print each integer of an integer array in separate lines
    public static void printEach(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }

    }

    //print each double of a double array in separate lines
    public static void printEach(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }

    }

    //print each char of a char array in separate lines
    public static void printEach(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }

    }

    // print each String of a String array in separate Lines
    public static void printEach(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }

    }

    //print max number in integer array
    public static int max(int[] numbers) {

        Arrays.sort(numbers);
        return numbers[numbers.length - 1];

    }

    //print max number in double array
    public static double max(double[] numbers) {

        Arrays.sort(numbers);
        return numbers[numbers.length - 1];

    }

    // //print min number in integer array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //print min number in double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    // check if given int is contained in given array
    public static boolean contains(int[] arr, int element) {
        boolean result = false;
        for (int each : arr) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //check if given double is contained in given double array
    public static boolean contains(double[] arr, double element) {
        boolean result = false;
        for (double each : arr) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //check if given char is contained in given char array
    public static boolean contains(char[] arr, char element) {
        boolean result = false;
        for (char each : arr) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    // //check if given String is contained in given String array
    public static boolean contains(String[] arr, String element) {
        boolean result = false;
        for (String each : arr) {
            if (each.contains(element)) {
                result = true;
            }
        }
        return result;
    }


    //adds the given element to array, returns a new array , merge array
    public static int[] addingElement(int[] num1 , int element){

        int[] result = new int[num1.length + 1];

        int i = 0;
        for (int each :num1) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }
    //adds the given element to array, returns a new array , merge array, double
    public static double[] addingElement(double[] num1 , double element){

        double[] result = new double[num1.length + 1];

        int i = 0;
        for (double each :num1) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }
    //adds the given element to array, returns a new array , merge array,char
    public static char[] addingElement(char[] num1 , char element){

        char[] result = new char[num1.length + 1];

        int  i = 0;
        for (char each :num1) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }
    //adds the given element to array, returns a new array , merge array,String
    public static String[] addingElement(String[] num1 , String element){

        String[] result = new String[num1.length + 1];

        int i = 0;
        for (String each :num1) {
            result [i++] = each;
        }
        result[i] = element;

        return result;

    }


    // returns frequency of given element in the given array , int
    public static int frequencyOfElement(int[] array, int element) {

        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }
    // returns frequency of given element in the given array , double
    public static int frequencyOfElement(double[] array, double element) {

        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }
    // returns frequency of given element in the given array , char
    public static int frequencyOfElement(char[] array, char element) {

        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }
    // returns frequency of given element in the given array , String
    public static int frequencyOfElement(String[] array, String element) {

    int count = 0;
    for (String each : array) {
        if (each.equals(element) ){
            count++;
        }
    }
    return count;
}


    // unique int elements in int array
    public static int[] uniqueElements(int[] array){

    int[] result= {};
    for (int each : array) {
        if(ArraysUtility.frequencyOfElement(array,each)==1){
            result= ArraysUtility.addingElement(result,each);
        }
    }
    return result;
}
    // unique double elements in double array
    public static double[] uniqueElements(double[] array){

        double[] result= {};
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result= ArraysUtility.addingElement(result,each);
            }
        }
        return result;
    }
    // unique char elements in char array
    public static char[] uniqueElements(char[] array){

        char[] result= {};
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result= ArraysUtility.addingElement(result,each);
            }
        }
        return result;
    }
    // unique String elements in String array
    public static String[] uniqueElements(String[] array){

       String[] result= {};
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result= ArraysUtility.addingElement(result,each);
            }
        }
        return result;
    }

    //remove index , int
    public static int[] removeElement(int[]array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index number");
            System.exit(0);
        }
        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addingElement(result, array[i]);

            }
        }
        return result;
    }
    //remove index from double array, returns new array 
    public static double[] removeElement(double[]array, double index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index number");
            System.exit(0);
        }
        double[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addingElement(result, array[i]);

            }
        }
        return result;
    }
    //remove index from char array , returns new Char array
    public static char[] removeElement(char[]array, char index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index number");
            System.exit(0);
        }
        char[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addingElement(result, array[i]);

            }
        }
        return result;
    }
    //remove index from String array, returns new String array
    public static String[] removeElement(String[]array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index number");
            System.exit(0);
        }
        String[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addingElement(result, array[i]);

            }
        }
        return result;
    }



    // remove index , second solution , int array
    public static int[] removeElement2(int[] array, int index){

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid");
        }
        int[] result = new int[array.length-1];

        int j =0;
        for (int i =0; i< array.length; i++) {
            if(i==index){
                continue;
            }
            result[j++]=array[i];
        }
        return result;
    }
    // remove index , second solution , double array
    public static double[] removeElement2(double[] array, int index){

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid");
        }
        double[] result = new double[array.length-1];

        int j =0;
        for (int i =0; i< array.length; i++) {
            if(i==index){
                continue;
            }
            result[j++]=array[i];
        }
        return result;
    }
    // remove index , second solution , char array
    public static char[] removeElement2(char[] array, int index){

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid");
        }
        char[] result = new char[array.length-1];

        int j =0;
        for (int i =0; i< array.length; i++) {
            if(i==index){
                continue;
            }
            result[j++]=array[i];
        }
        return result;
    }
    // remove index , second solution , String array
    public static String[] removeElement2(String[] array, int index){

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid");
        }
       String[] result = new String[array.length-1];

        int j =0;
        for (int i =0; i< array.length; i++) {
            if(i==index){
                continue;
            }
            result[j++]=array[i];
        }
        return result;
    }


}