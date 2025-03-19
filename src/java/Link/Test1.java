package Link;

/**
 * 相交链表
 *
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 */
public class Test1 {

    public static void main(String[] args) {

    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lenA=0,lenB=0;
        ListNode curA=headA , curB = headB;
        while (curA !=null){
            curA = curA.next;
            lenA++;
        }
        while (curB !=null){
            curB = curB.next;
            lenB++;
        }
        curA = headA;
        curB = headB;
        if (lenA < lenB){//让curA为最长链表的头，lenA为其长度
            //1. swap (lenA, lenB);
            int tmpLen = lenA;
            lenA = lenB;
            lenB = tmpLen;

            //2. swap (curA, curB);
            ListNode tmpNode = curA;
            curA = curB;
            curB = tmpNode;
        }
        // 求长度差
        int gap = lenA - lenB;
        for (int i = 0; i<gap; i++){
            curA = curA.next;
        }
        while (curA != null){
            if(curA == curB){
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;


    }


}
