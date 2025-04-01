package Link;

/**
 * 148. 排序链表
 *
 * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 *
 */
public class Test8 {
    public static void main(String[] args) {

    }

    public ListNode sortList(ListNode head) {
        //1.递归结束条件
        if(head == null || head.next==null){
            return head;
        }

        //2.找到链表中间节点并断开链表   递归下探
        ListNode midNode = middleNode(head);
        ListNode rigthHead = midNode.next;
        midNode.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(rigthHead);

        //3.当前层业务操作（合并有序链表）
        return mergeTwoLists(left,right);
    }

    //找到链表中间节点
    private ListNode middleNode(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //合并两个有序链表
    private ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode sentry = new ListNode(-1);
        ListNode cur = sentry;

        while(l1 != null && l2 != null){
            if (l1.val <l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = l1 !=null ? l1 : l2;
        return sentry.next;

    }




}
