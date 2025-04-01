package DaiMaSuiXiangLu.Link;

/**
 * 19. 删除链表的倒数第 N 个结点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 *
 * @Author pine-li
 * @Create 2025/3/11 21:47
 * @Version 1.0
 */
public class Test6 {

    public static void main(String[] args) {
        int val[] = {1,2};
        ListNode head = LinkTool.createLinkedList(val);
        Test6 test6 = new Test6();
        ListNode result = test6.removeNthFromEnd(head,2);
        LinkTool.printList(result);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        //一定要让快慢指针指向虚拟头结点
        ListNode fastIndex = dummyNode;
        ListNode slowIndex = dummyNode;
        // 只要快慢指针相差 n 个结点即可
        for (int i = 0; i <=n ; i++){
            fastIndex = fastIndex.next;
        }
        while (fastIndex != null){
            fastIndex = fastIndex.next;
            slowIndex = slowIndex.next;
        }
        if(slowIndex.next != null){
            slowIndex.next = slowIndex.next.next;
        }
        return dummyNode.next;

    }








}
