package DaiMaSuiXiangLu.Link;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 *
 *
 * @Author pine-li
 * @Create 2025/3/11 23:09
 * @Version 1.0
 */
public class Test8 {

    public ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        Set<ListNode> visited = new HashSet<>();
        while (pos != null){
            if(visited.contains(pos)){
                return pos;
            }else {
                visited.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }


}
