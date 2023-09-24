package DSA.Arrays.Medium;

public class TrappingRainwater {

  public static int trappedWater(int[] array) {
    int trappedWater = 0, n = array.length;

    int[] leftMax = new int[n];
    leftMax[0] = array[0];
    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(array[i], leftMax[i - 1]);
    }

    int[] rightMax = new int[n];
    rightMax[n - 1] = array[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      rightMax[i] = Math.max(array[i], rightMax[i + 1]);
    }

    for (int i = 0; i < n; i++) {
      int waterLevel = Math.min(leftMax[i], rightMax[i]);
      trappedWater += (waterLevel - array[i]);
    }

    return trappedWater;
  }

  public static void main(String[] args) {
    int[] height = { 4, 2, 0, 3, 2, 5 };
    System.out.println(trappedWater(height));
  }
}
