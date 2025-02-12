package Hash;

import java.util.*;

/**
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 *
 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 *
 * @Author pine-li
 * @Create 2024/10/12 11:05
 * @Version 1.0
 */
public class Test2 {

    public static void main(String[] args) {
        String [] strarray = new String[]{"eat","tea","tan","ate","nat","bat"};
        Test2 test2 = new Test2();
        List<List<String>> listList = test2.groupAnagrams(strarray);
        System.out.println(listList);
    }



    /**
     * 由于互为字母异位词的两个字符串包含的字母相同，因此对两个字符串分别进行排序之后得到的字符串一定是相同的，
     * 故可以将排序之后的字符串作为哈希表的键,字符串列表作为哈希表的值
     */
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<String,List<String>>();
        //遍历输入的字符串数组
        for (String str : strs){
            //将字符串转为字符数组，方便排序
            char[] array = str.toCharArray();
            //对字符数组进行排序
            Arrays.sort(array);
            //将排序好的字符数组转为字符串，作为哈希表的键
            String key = new String(array);
            //检查哈希表中是否已经存在该键，如果存在就获取其对应的列表，否则创建一个新的空列表
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            List<String> list = map.get(key);
            list.add(str);
            // 将更新后的列表放回哈希表
            map.put(key,list);
        }
        // 返回哈希表中所有值，即所有字母异位词的分组
        return new ArrayList<List<String>>(map.values());

    }




}













