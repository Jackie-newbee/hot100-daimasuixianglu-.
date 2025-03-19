package Link;

import java.util.ArrayList;
import java.util.List;

/**
 * 回文链表
 *
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 *
 */
public class Test3 {

    public static void main(String[] args) {
        int values[] = {1,2,3,2};
        ListNode head = LinkTool.createLinkedList(values);
        Test3 test3 = new Test3();
        System.out.println(test3.isPalindrome(head));

    }



    public boolean isPalindrome(ListNode head) {

        List<Integer> vals = new ArrayList<>();
        ListNode cur = head;
        while (cur != null){
            vals.add(cur.val);
            cur = cur.next;
        }
        int front = 0;
        int back = vals.size() - 1;
        while (front < back){
            if(!vals.get(front).equals(vals.get(back))){
                return false;
            }
            front++;
            back--;
        }
        return true;

    }





}
