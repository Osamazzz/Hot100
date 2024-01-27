package com.algorithm.obamazzz;

public class MoveZero {
    public static void main(String[] args) {
        int [] arr = new int[] {0,1,0,3,12};
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        int zeroNums = 0;
        int i = 0;
        for (int c: nums) {
            if (c == 0) zeroNums++;
        }
        if (zeroNums == nums.length) return;
        int zeroIndex = nums.length - zeroNums;
        while (zeroNums != 0) {
            if(nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[zeroIndex++] = 0;
                zeroNums--;
            } else {
                i++;
            }
        }
    }
}
