package Hash;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 *
 *输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 *
 * @Author pine-li
 * @Create 2024/10/12 21:18
 * @Version 1.0
 */
public class Test3 {

    public static void main(String[] args) {
        int nums[] = {0,3,7,2,5,8,4,6,0,1};
        Test3 test3 = new Test3();
        int result = test3.longestConsecutive(nums);
        System.out.println(result);

    }


    /**
     * https://leetcode.cn/problems/longest-consecutive-sequence/solutions/2362995/javapython3cha-xi-biao-ding-wei-mei-ge-l-xk4c/?envType=study-plan-v2&envId=top-100-liked
     * 找每个连续序列的起点（如果num-1不在set哈希表中，则它就是起点了），
     * 然后从起点开始一直找到终点（如果num+1不在哈希表中，则是中点）
     * 用HashSet来快速定位num-1和num+1在不在哈希表中，
     *
     *
     *  @param nums
     * @return
     */

    public int longestConsecutive(int[] nums) {

        int res = 0;//连续序列的最大长度

        Set<Integer> numSet = new HashSet();// 记录所有的数值
        for (int num : nums){
            numSet.add(num); // 将数组中的值加入哈希表中
        }
        for(int num:numSet){
            // 如果当前的数是一个连续序列的起点，统计这个连续序列的长度
            if(!numSet.contains(num-1)){//如果顺利执行 则说明num是他那个序列的第一个
                int seqlength = 1;
                while (numSet.contains(++num)){
                    seqlength++;
                }
                res = Math.max(res,seqlength);
            }
        }
        return res;
    }
}
