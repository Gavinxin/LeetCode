package LeetCodeSolutions;

import java.util.HashMap;
import java.util.Map;

public class LeetCode146 {
	class DLinkedNode {
        // 封装链表节点，包含 key/value 以及上一个和下一个两个指针。
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
        public DLinkedNode() {}
        public DLinkedNode(int _key, int _value) {key = _key; value = _value;}
    }

    // 定义 HashMap 存储缓存中的 key 和对应的节点。
    private Map<Integer, DLinkedNode> cache = new HashMap<Integer, DLinkedNode>();
    // 当前的缓存长度。
    private int size;
    // 缓存总长度。
    private int capacity;
    // 双向链表的头尾指针。
    private DLinkedNode head, tail;

    public void LRUCache(int capacity) {
        // 构造函数初始化缓存内部机制，包括初始缓存长度、总长度以及头尾节点。
        this.size = 0;
        this.capacity = capacity;
        // 使用伪头部和伪尾部节点
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        // 如果 key 存在，先通过哈希表定位，再移到链表头部。
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            // 如果 key 不存在，创建一个新的节点。
            DLinkedNode newNode = new DLinkedNode(key, value);
            // 添加进哈希表。
            cache.put(key, newNode);
            // 添加至双向链表的头部。
            addToHead(newNode);
            size++;
            if (size > capacity) {
                // 如果超出容量，删除双向链表的尾部节点。
                DLinkedNode tail = removeTail();
                // 删除哈希表中对应的项。
                cache.remove(tail.key);
                size--;
            }
        } else {
            // 如果 key 存在，先通过哈希表定位，再修改 value，并移到链表头部。
            node.value = value;
            moveToHead(node);
        }
    }

    private void addToHead(DLinkedNode node) {
        // 将节点插入链表头部。
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DLinkedNode node) {
        // 移除链表中节点。
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(DLinkedNode node) {
        // 将链表中节点先移除再添加到头部。
        removeNode(node);
        addToHead(node);
    }

    private DLinkedNode removeTail() {
        // 移除双向链表尾部节点并返回给哈希表删除对应节点。
        DLinkedNode res = tail.prev;
        removeNode(res);
        return res;
    }

}
