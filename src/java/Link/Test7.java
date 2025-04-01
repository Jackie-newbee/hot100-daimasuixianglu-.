package Link;

import java.util.HashMap;
import java.util.Map;

/**
 * 138. 随机链表的复制
 *
 *https://leetcode.cn/problems/copy-list-with-random-pointer/?envType=study-plan-v2&envId=top-100-liked
 */
class Node{
    int val;
    Node next;
    Node random;

    public Node(int val){
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Test7 {
    public static void main(String[] args) {

    }

    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Node cur = head;
        Map<Node,Node> map = new HashMap<>();
        while(cur != null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;

        while(cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);

    }


}
