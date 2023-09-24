package DSA.Arrays.Easy;

import java.util.Arrays;

public class ReverseTheArray {

  public static void reverseArray(int[] array) {
    int start = 0, end = array.length - 1;

    while (start < end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;

      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6 };
    reverseArray(nums);

    System.out.println(Arrays.toString(nums));
  }
}
