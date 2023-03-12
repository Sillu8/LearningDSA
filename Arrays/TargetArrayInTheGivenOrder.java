import java.util.ArrayList;
import java.util.Arrays;

public class TargetArrayInTheGivenOrder {
  public static void main(String[] args) {

    int[] nums = { 0, 1, 2, 3, 4 };
    int[] index = { 0, 1, 2, 2, 1 };

    // int[] targetArray = new int[nums.length];

    // for (int i = 0; i < nums.length; i++) {
    // int pos = index[i];
    // int value = nums[i];

    // targetArray = insertElem(targetArray, value, pos);
    // }
    // System.out.println(Arrays.toString(targetArray));
    // }

    // public static int[] insertElem(int[] arr, int value, int pos) {
    // int[] newArr = new int[arr.length];
    // for (int i = 0; i < arr.length; i++) {
    // if (i < pos) {
    // newArr[i] = arr[i];
    // } else if (i == pos) {
    // newArr[i] = value;
    // } else {
    // newArr[i] = arr[i - 1];
    // }
    // }
    // return newArr;

    // O(n) solution
    int[] target = new int[nums.length];
    ArrayList<Integer> tempArr = new ArrayList<>();

    for(int i=0; i<nums.length; i++){
      int pos = index[i];
      int value = nums[i];
      tempArr.add(pos,value);
    }

    for (int i = 0; i < nums.length; i++) {
      target[i] = tempArr.get(i);
    }

    System.out.println(Arrays.toString(target));
  }
}