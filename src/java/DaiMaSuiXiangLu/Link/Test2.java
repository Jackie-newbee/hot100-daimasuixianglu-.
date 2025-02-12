package DaiMaSuiXiangLu.Link;

/**
 * 203. 移除链表元素
 *
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 *
 * 示例 1： 输入：head = [1,2,6,3,4,5,6], val = 6 输出：[1,2,3,4,5]
 * 示例 2： 输入：head = [], val = 1 输出：[]
 * 示例 3： 输入：head = [7,7,7,7], val = 7 输出：[]
 *
 * @Author pine-li
 * @Create 2025/2/12 22:37
 * @Version 1.0
 */

public class Test2 {

    public static void main(String[] args) {
        int[] values = {1,2,6,3,4,5,6};
//        int[] values = {7,7,7,7};
        ListNode head = createLinkedList(values);

        Test2 test2 = new Test2();
        ListNode newHead = test2.removeElements(head,6);

        printList(newHead);

    }

    //创建链表
    public static ListNode createLinkedList(int[] values){
        if(values.length == 0){
            return null;
        }

        ListNode dummy = new ListNode();//创建虚拟头结点
        ListNode cur = dummy;
        for (int val : values){
            cur.next = new ListNode(val);
            cur = cur.next;
        }
        return dummy.next;//返回真正的头结点
    }
    //打印链表
    public static void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val);
            if(current.next != null){
                System.out.print("->");
            }
            current = current.next;
        }
    }



    public ListNode removeElements(ListNode head, int val){
        //设置一个虚拟头结点(轻松解决了要删除的结点是头结点的问题)
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode cur = dummy;
        while (cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }






}
