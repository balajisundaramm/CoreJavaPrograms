package com.balaji;

/**
 * Created by gokul on 30/9/17.
 */
public class Post4 {
    public static void main(String[] args){
        int[] nums={10,4,6,8,7};
        for (int x:post4(nums)) {
            System.out.println(x);
        }

    }
    public static int[] post4(int[] nums) {
        int count = 0;
        int j = 0;
        int[] result = new int[count];
        if (nums[nums.length - 1] == 4)
            return nums;
        else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[nums.length - 2 - i] != 4) {
                    count++;
                }
                else {
                    count++;
                    break;
                }
            }
            result = new int[count];
            for (int i = count - 1; i >= 0; i--) {
                result[i] = nums[nums.length - 1 - j];
                j++;
            }
        }
        return result;
    }
}
