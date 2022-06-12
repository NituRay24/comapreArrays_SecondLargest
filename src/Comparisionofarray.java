import java.util.*;
import java.util.ArrayList;
public class Comparisionofarray {
    public int comapreArrays_SecondLargest(int[] arr) {
        int secondmaxCounter = 0;
        int element = 0;
        for (int i = 1; i < arr.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }
            if (secondmaxCounter< counter) {
                secondmaxCounter = counter;
                element = arr[i];
            }
        }
        System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + secondmaxCounter);
        return 0;
    }


        public static void main (String[]arg)
        {
            int arr[]= {1,7,1,4,0,9,19,3,8,7,1};
            Comparisionofarray ca = new Comparisionofarray();
            ca.comapreArrays_SecondLargest(arr);
        }
    }
