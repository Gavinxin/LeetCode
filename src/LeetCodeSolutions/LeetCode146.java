package LeetCodeSolutions;

import java.util.HashMap;
import java.util.Map;

public class LeetCode146 {
	class DLinkedNode {
        // ��װ����ڵ㣬���� key/value �Լ���һ������һ������ָ�롣
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
        public DLinkedNode() {}
        public DLinkedNode(int _key, int _value) {key = _key; value = _value;}
    }

    // ���� HashMap �洢�����е� key �Ͷ�Ӧ�Ľڵ㡣
    private Map<Integer, DLinkedNode> cache = new HashMap<Integer, DLinkedNode>();
    // ��ǰ�Ļ��泤�ȡ�
    private int size;
    // �����ܳ��ȡ�
    private int capacity;
    // ˫�������ͷβָ�롣
    private DLinkedNode head, tail;

    public void LRUCache(int capacity) {
        // ���캯����ʼ�������ڲ����ƣ�������ʼ���泤�ȡ��ܳ����Լ�ͷβ�ڵ㡣
        this.size = 0;
        this.capacity = capacity;
        // ʹ��αͷ����αβ���ڵ�
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
        // ��� key ���ڣ���ͨ����ϣ��λ�����Ƶ�����ͷ����
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            // ��� key �����ڣ�����һ���µĽڵ㡣
            DLinkedNode newNode = new DLinkedNode(key, value);
            // ��ӽ���ϣ��
            cache.put(key, newNode);
            // �����˫�������ͷ����
            addToHead(newNode);
            size++;
            if (size > capacity) {
                // �������������ɾ��˫�������β���ڵ㡣
                DLinkedNode tail = removeTail();
                // ɾ����ϣ���ж�Ӧ���
                cache.remove(tail.key);
                size--;
            }
        } else {
            // ��� key ���ڣ���ͨ����ϣ��λ�����޸� value�����Ƶ�����ͷ����
            node.value = value;
            moveToHead(node);
        }
    }

    private void addToHead(DLinkedNode node) {
        // ���ڵ��������ͷ����
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DLinkedNode node) {
        // �Ƴ������нڵ㡣
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(DLinkedNode node) {
        // �������нڵ����Ƴ�����ӵ�ͷ����
        removeNode(node);
        addToHead(node);
    }

    private DLinkedNode removeTail() {
        // �Ƴ�˫������β���ڵ㲢���ظ���ϣ��ɾ����Ӧ�ڵ㡣
        DLinkedNode res = tail.prev;
        removeNode(res);
        return res;
    }

}
