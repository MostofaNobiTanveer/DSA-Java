package DSA.Arrays.Easy;

public class SearchInRotatedSortedArray {

  public static int search(int[] array, int target) {
    int left = 0, right = array.length - 1, mid = 0;

    while (left <= right) {
      mid = (left + right) / 2;

      if (target == array[mid]) return mid;

      // find the sorted portion of the array
      if (array[left] <= array[mid]) { // left sorted array
        if (target >= array[left] && target < array[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else { // right sorted array
        if (target > array[mid] && target <= array[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
    System.out.println(search(nums, 0));
  }
}
