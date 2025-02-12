package HuaDongChuangKou;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长
 * 子串的长度。
 *
 *输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * @Author pine-li
 * @Create 2024/10/15 14:05
 * @Version 1.0
 */
public class Test1 {

    public static void main(String[] args) {

        Test1 test1 = new Test1();
        String s = "abcabcbb";
        System.out.println(test1.lengthOfLongestSubstring(s));

    }


    /**
     * 暴力法-把每一个子串都遍历一遍
     */
    public int lengthOfLongestSubstring1(String s) {
        int maxLength = 0;
        for (int i=0; i<s.length(); i++){
            for (int j=i; j<s.length(); j++){
                //检查子串 s[i..j] 是否有重复字符
                if (isUnique(s,i,j)){
                    maxLength = Math.max(maxLength,j-i+1);
                }
            }
        }
        return maxLength;
    }
    public boolean isUnique(String s,int start,int end){
        Set<Character> set = new HashSet<>();
        for (int i=start;i<=end;i++){
            char ch = s.charAt(i);//用于获取字符串 s 中指定位置 i 的字符
            if (set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }


    /**
     * 滑窗问题的模板
     * //外层循环扩展右边界，内层循环扩展左边界
     * for (int l = 0, r = 0 ; r < n ; r++) {
     * 	//当前考虑的元素
     * 	while (l <= r && check()) {//区间[left,right]不符合题意
     *         //扩展左边界
     *     }
     *     //区间[left,right]符合题意，统计相关信息
     * }
     */
    public int lengthOfLongestSubstring(String s) {
        char ss[] = s.toCharArray();//将字符串 s 转换为一个字符数组 ss
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        for (int left=0,right=0; right<ss.length; right++){//每一轮右端点都扩一个。
            char ch = ss[right];//right指向的元素，也是当前要考虑的元素
            while (set.contains(ch)){//set中有ch，则缩短左边界，同时从set集合出元素
                set.remove(ss[left]);
                left++;
            }
            set.add(ss[right]);//别忘。将当前元素加入。
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;

    }




}
