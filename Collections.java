package testing;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ====== LIST ======
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Apple"); // allows duplicates
        System.out.println("ArrayList: " + arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Dog"); // allows duplicates
        System.out.println("LinkedList: " + linkedList);

        // ====== SET ======
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Blue");
        hashSet.add("Red"); // duplicates not allowed
        System.out.println("HashSet: " + hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("One");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        System.out.println("TreeSet (Sorted): " + treeSet);

        // ====== QUEUE ======
        Queue<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println("Queue: " + queue);
        System.out.println("Queue.poll(): " + queue.poll()); // removes head
        System.out.println("Queue: " + queue);

        // ====== DEQUE ======
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        System.out.println("Deque: " + deque);
        System.out.println(deque.poll());
        System.out.println("Deque: " + deque);

        // ====== STACK (Legacy) ======
        Stack<String> stack = new Stack<>();
        stack.push("Bottom");
        stack.push("Top");
        System.out.println("Stack: " + stack);
        System.out.println("Stack.pop(): " + stack.pop());

        // ====== PRIORITYQUEUE ======
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(20);
        System.out.println("PriorityQueue (Natural Order): " + priorityQueue);
        System.out.println("PriorityQueue.poll(): " + priorityQueue.poll());

        // ====== MAP ======
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(1, "Uno"); // key overwritten
        System.out.println("HashMap: " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(1, "One");
        System.out.println("LinkedHashMap (Insertion order): " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(30, "Thirty");
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        System.out.println("TreeMap (Sorted by key): " + treeMap);

        // ====== HASHTABLE (Legacy) ======
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("A", "Apple");
        hashtable.put("B", "Banana");
        System.out.println("Hashtable: " + hashtable);

	}

}
