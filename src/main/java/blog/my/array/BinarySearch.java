package blog.my.array;

import org.junit.Test;

/**
* Description: 二分查找
* date: 2023/7/20 11:06
 *
* @author: Deng
* @since JDK 1.8
*/


/**
 * 前提条件：数组有序，没有重复元素（否则不止一个目标值）
 */
public class BinarySearch {
    public  int binarySearch(int[] nums, int target) {
        // 在区间[left,right]中查找元素，左闭右闭
        int left = 0;
        int right = nums.length - 1;

        // 由于是在区间[left,right]中查找
        // 因此当left=right时，区间内还有一个元素需要查找
        while (left <= right) {
            // 计算中间点
            int mid = left + (right - left) / 2;
            // 如果target == nums[mid]则表示已经找到，返回mid
            if (target == nums[mid]) {
                return mid;
                // 如果target < nums[mid]，表示目标值可能在左半边
            } else if (target < nums[mid]) {
                // 由于是在左闭右闭的区间[left,right]中查找
                // 而target < nums[mid]，因此mid不再需要考虑
                // 所以right = mid - 1,即在[left,mid-1]中继续查找
                right = mid - 1;

                // 如果target > nums[mid]，表示目标值可能在右半边
            } else if (target > nums[mid]) {
                // 由于是在左闭右闭的区间[left,right]中查找
                // 而target > nums[mid]，因此mid不再需要考虑
                // 所以left = mid + 1，即在[mid+1,right]中继续查找
                left = mid + 1;
            }
        }

        // 未找到返回-1
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] a = new int[]{4, 7, 23, 45, 67, 68, 200};
        int i = binarySearch.binarySearch(a, 200);
        System.out.println(i);
    }
}
