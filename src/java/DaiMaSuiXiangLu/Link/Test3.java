package DaiMaSuiXiangLu.Link;

/**
 * 707:设计链表
 *
 * @Author pine-li
 * @Create 2025/2/15 14:18
 * @Version 1.0
 */
public class Test3 {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    //size存储链表元素的个数
    private int size;
    //注意这里记录的是虚拟头结点
    private ListNode head;

    //初始化链表
    public Test3(){
        this.size = 0;
        this.head = new ListNode(0);
    }

    /**
     * 获取第index个节点的数值，注意index是从0开始的，第0个节点就是虚拟头结点
     * @param index
     * @return
     */
    public int get(int index){
        //如果index非法，返回-1
        if(index<0 || index >= size){
            return -1;
        }
        ListNode cur = head;
        //第0个节点是虚拟头节点，所以查找第 index+1 个节点
        for(int i=0;i<=index;i++){
            cur = cur.next;
        }
        return cur.val;
    }

    /**
     * 将一个值为 val 的节点插入到链表中第一个元素之前。在插入完成后，新节点会成为链表的第一个节点。
     * @param val
     */
    public void addAtHead(int val){
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        size++;
        // 在链表最前面插入一个节点，等价于在第0个元素前添加
        // addAtIndex(0, val);s
    }

    /**
     *  将一个值为 val 的节点追加到链表中作为链表的最后一个元素。
     */
    public void addAtTail(int val){

        ListNode newNode = new ListNode(val);
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
        size++;
        // 在链表的最后插入一个节点，等价于在(末尾+1)个元素前添加
        // addAtIndex(size, val);
    }

    /**
     * 将一个值为 val 的节点插入到链表中下标为 index 的节点之前
     */
    public void addAtIndex(int index,int val){
        if (index < 0 || index > size) {
            return;
        }

        //找到要插入节点的前驱
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = pre.next;
        pre.next = newNode;
        size++;

    }

    /**
     *  如果下标有效，则删除链表中下标为 index 的节点。
     */
    public void deleteAtIndex(int index){
        if (index < 0 || index >= size) {
            return;
        }

        //因为有虚拟头节点，所以不用对index=0的情况进行特殊处理
        ListNode pre = head;
        for (int i = 0; i < index; i++){
            pre = pre.next;
        }
        pre.next = pre.next.next;
        size--;
    }




}
