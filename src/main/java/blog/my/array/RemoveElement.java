package blog.my.array;

/**
 * Description:
 * date: 2023/9/10 11:58
 *
 * @author: Deng
 * @since JDK 1.8
 */
// 27. 移除元素 https://leetcode.cn/problems/remove-element/description/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        // 快慢指针：将快指针遍历的值与要移除的值比较，慢指针记录不相等的值的个数，慢指针的大小就是去除重复元素后的大小
        int slow = 0;
        for (int fast = 0; fast < nums.length - 1; fast++) {
            if (val != nums[fast]) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }


    public static void main(String[] args) {
        int[] nums = {2, 2, 33, 3, 4};
        RemoveElement removeElement = new RemoveElement();
        int i = removeElement.removeElement(nums, 2);
        System.out.println(i);
    }

}
