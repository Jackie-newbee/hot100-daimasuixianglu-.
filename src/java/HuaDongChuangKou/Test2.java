package HuaDongChuangKou;

import java.util.ArrayList;
import java.util.List;

/**
 * 找到字符串中所有字母异位词
 *
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的
 * 异位词的子串，返回这些子串的起始索引。不考虑答案输出的顺序
 *
 * 输入: s = "cbaebabacd", p = "abc"
 * 输出: [0,6]
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
 *
 * @Author pine-li
 * @Create 2024/10/18 16:27
 * @Version 1.0
 */
public class Test2 {

    public static void main(String[] args) {

        Test2 test2 = new Test2();
        String s = "cbaebabacd", p = "abc";
        System.out.println(test2.findAnagrams(s,p));

    }


    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();
        int [] sCnt = new int[26];
        int [] pCnt = new int[26];

        for(int i=0; i<p.length(); i++){
            pCnt[p.charAt(i)-'a']++;
        }

        for (int left=0,right=0; right<s.length(); right++){
            int curRight = s.charAt(right)-'a';
            sCnt[curRight]++;
            while (sCnt[curRight]>pCnt[curRight]){
                int curLeft = s.charAt(left)-'a';
                sCnt[curLeft]--;
                left++;
            }
            if(right-left+1==p.length()){
                list.add(left);
            }

        }
        return list;
    }


}
