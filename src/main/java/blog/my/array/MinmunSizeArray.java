package blog.my.array;

/**
* Description: 长度最小的子数组
* date: 2023/9/12 10:30
 *
* @author: Deng
* @since JDK 1.8
*/

public class MinmunSizeArray {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;// 左指针
        int sum = 0;// 存放和
        int result = Integer.MAX_VALUE;// 存放长度  默认最大Integer

        // 累加元素
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // 滑动窗口的精髓
            while(sum >= target) {
                // 子数组的选取
                result = Math.min(result, right - left + 1);// 当前的子数组的长度与默认值比较
                sum -= nums[left++]; // 减去原先做指针位置的值后，左指针开始移动
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

}
