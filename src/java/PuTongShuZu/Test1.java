package PuTongShuZu;

/**
 * 最大子数组和
 *
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 子数组:是数组中的一个连续部分
 *
 * @Author pine-li
 * @Create 2024/10/21 10:18
 * @Version 1.0
 */
public class Test1 {

    public static void main(String[] args) {
        int nums[] = {5,4,-1,7,8};
        Test1 test1 = new Test1();
        System.out.println(test1.maxSubArray1(nums));

    }

    /**
     * 双循环暴力法
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        for (int i=0; i<nums.length; i++){
            int temp = 0;
            for (int j=i; j<nums.length; j++){
                temp = temp + nums[j];
                if (temp>sum)
                    sum = temp;
            }
        }
        return sum;

    }

    /**
     * 前缀和
     */
    public int maxSubArray1(int[] nums) {
            // 初始化最大子数组和为数组第一个元素
            int maxsum = nums[0];
            // 记录当前的前缀和，初始为0
            int pre = 0;
            // 记录遍历过程中最小的前缀和
            int minPre = 0;

            for (int num : nums) {
                pre += num;
                // 更新最大子数组和
                maxsum = Math.max(maxsum, pre - minPre);
                // 更新最小前缀和
                minPre = Math.min(minPre, pre);
            }

            return maxsum;
        }



}
