package DaiMaSuiXiangLu.Link;

import java.time.temporal.Temporal;

/**
 * 两两交换链表中的节点
 *
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。
 * 你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 *
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 *
 * @Author pine-li
 * @Create 2025/3/10 22:04
 * @Version 1.0
 */
public class Test5 {

    public static void main(String[] args) {
        int val[] = {1,2,3,4,5,6};
        ListNode head = LinkTool.createLinkedList(val);
        Test5 test5 = new Test5();
        ListNode result = test5.swapPairs(head);
        LinkTool.printList(result);
    }


    /**
     * 迭代
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        ListNode dumyhead = new ListNode(-1); // 设置一个虚拟头结点
        dumyhead.next = head; // 将虚拟头结点指向head，这样方便后面做删除操作
        ListNode cur = dumyhead;
        ListNode temp; // 临时节点，保存两个节点后面的节点
        ListNode firstnode; // 临时节点，保存两个节点之中的第一个节点
        ListNode secondnode; // 临时节点，保存两个节点之中的第二个节点
        while (cur.next != null && cur.next.next != null) {
            temp = cur.next.next.next;
            firstnode = cur.next;
            secondnode = cur.next.next;
            cur.next = secondnode;       // 步骤一
            secondnode.next = firstnode; // 步骤二
            firstnode.next = temp;      // 步骤三
            cur = firstnode; // cur移动，准备下一轮交换
        }
        return dumyhead.next;
    }


    /**
     * 递归
     */

    public static ListNode swapPairs1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode one = head;
        ListNode two = one.next;
        ListNode three = two.next;

        two.next = one;
        one.next = swapPairs1(three);

        return two;
    }





}
