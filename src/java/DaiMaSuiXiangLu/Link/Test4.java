package DaiMaSuiXiangLu.Link;

/**
 * 反转链表
 *
 * 题意：反转一个单链表。
 *
 * 示例: 输入: 1->2->3->4->5->NULL 输出: 5->4->3->2->1->NULL
 *
 * @Author pine-li
 * @Create 2025/3/10 21:14
 * @Version 1.0
 */
public class Test4 {

    public static void main(String[] args) {
        int val[] = {1,2,3,4,5};
        ListNode head = LinkTool.createLinkedList(val);
        Test4 test4 = new Test4();
        ListNode result = test4.reverseList(head);
        LinkTool.printList(result);


    }

    /**
     * 双指针法   一个cur指针  一个pre指针
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;

        while (cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }


}
