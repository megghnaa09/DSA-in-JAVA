import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                if ((arr[j] + arr[j + 1]).compareTo(arr[j + 1] + arr[j]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        if (arr[0].equals("0"))
            return "0";

        String res = "";

        for (String s : arr) {
            res += s;
        }

        return res;
    }
}