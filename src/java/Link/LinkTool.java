package Link;

/**
 * 创建链表，打印链表
 *
 * @Author pine-li
 * @Create 2025/3/10 21:35
 * @Version 1.0
 */
public class LinkTool {

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

}
