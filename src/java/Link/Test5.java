  package Link;

  import DaiMaSuiXiangLu.Link.Test2;

  /**
 * 合并两个有序链表
 *
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class Test5 {

    public static void main(String[] args) {
        int[] values1 = {1,2,5,6};
        int[] values2 = {3,7};
        ListNode linkedList1 = LinkTool.createLinkedList(values1);
        ListNode linkedList2 = LinkTool.createLinkedList(values2);
        Test5 test5 = new Test5();
        ListNode head = test5.mergeTwoLists(linkedList1,linkedList2);
        LinkTool.printList(head);

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode pre = head;
        while (list1!=null && list2!=null){

            if(list1.val <= list2.val){
                pre.next = list1;
                pre =list1;
                list1 = list1.next;
            }else {
                pre.next = list2;
                pre = list2;
                list2 = list2.next;
            }
        }
        if (list1==null){
            pre.next = list2;
        }else {
            pre.next = list1;
        }

        return head.next;

    }
}
