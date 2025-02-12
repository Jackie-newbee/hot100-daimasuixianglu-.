package DaiMaSuiXiangLu.Link;

/**
 * //手动定义一个ListNode
 *
 * @Author pine-li
 * @Create 2025/2/12 22:53
 * @Version 1.0
 */
public class ListNode {

    int val; // 结点的值

    ListNode next;// 下一个结点

    public ListNode(){// 节点的构造函数(无参)

    }

    public ListNode (int val){// 节点的构造函数(有一个参数)
        this.val = val;
    }

    public ListNode (int val, ListNode next){// 节点的构造函数(有两个参数)
        this.val = val;
        this.next = next;
    }


}
