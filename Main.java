import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {2, 4, 90, 5, 320, 8, 10};
//        devidedOn5(arr);

//        double[] arr1 = {12.3, 90.4, 35.8, 27.6};
//        largerThan24(arr1);

//        double[] arrayToPrint = insertionSort(arr1);
//        for (int i = 0; i < arrayToPrint.length; i++) {
//            System.out.print(arrayToPrint[i]+" ");

//        numberOfCharInString(new String("The pi number can easily be memorised like this : 'The wife and children have gone abroad; the husband is not scared'"));

//        System.out.println(printYesIfThereIsAtLeastOneBInTheString("This function should print no in this case"));



    }

    public static void devidedOn5(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0)
                System.out.print(arr[i]+" ");
        }
    }

    public static void largerThan24(double[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 24.56)
                System.out.print(arr1[i]+" ");
        }
    }

    public static double[] insertionSort(double[] arr) {
        int j;
        for (int i = 1; i < arr.length; i++) {
            j = i - 1;
            double temp = arr[i];
            while (j >= 0 && (arr[j] > temp)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static void numberOfCharInString(String s) {
        char ch = 't';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch)
                count++;
        }
        System.out.println(count);
    }

    public static String printYesIfThereIsAtLeastOneBInTheString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b')
                return "YES";
        }
        return "NO";
    }
}
