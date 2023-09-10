package blog.my.array;

/**
* Description: 有序数组的平方
* date: 2023/9/10 23:32
 *
* @author: Deng
* @since JDK 1.8
*/
public class SquareSortArray {
    public int[] sortedSquares(int[] nums) {
        // 双指针
        int left = 0;
        int right = nums.length - 1;
        // 存放结果 跟原数组的大小一致
        int[] result = new int[nums.length];
        // 指向新数组的末尾的指针
        int index = result.length - 1;
        // 只要左边小于等于右边就一直给数组的值平方
        while (left <= right){
            if (nums[left] * nums[left] <= nums[right] * nums[right]) {
                result[index--] = nums[right] * nums[right];
                right--;
            } else {
                result[index--] = nums[left] * nums[left];
                left++;
            }
        }
        return result;
    }
}
