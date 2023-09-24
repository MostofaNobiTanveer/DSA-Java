package DSA.Arrays.Easy;

public class FindMaximumSubarray {

  public static int maximumSubarray(int[] array) {
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < array.length; i++) {
      for (int j = i; j < array.length; j++) {
        int currSum = 0;
        for (int k = i; k <= j; k++) {
          currSum += array[k];
        }
        if (maxSum < currSum) maxSum = currSum;
      }
    }

    return maxSum;
  }

  public static void main(String[] args) {
    int[] nums = { 5, 4, -1, 7, 8 };

    System.out.println(maximumSubarray(nums));
  }
}
