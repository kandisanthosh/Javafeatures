
1. Reverse a String

Write a program to reverse a string.

Answer:

java

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}

2. Check for Palindrome

Write a program to check if a string is a palindrome.

Answer:

java

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();
        boolean isPalindrome = str.equals(reversed);
        System.out.println(isPalindrome);
    }
}

3. Find the Largest Element in an Array

Write a program to find the largest element in an array.

Answer:

java

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}

4. Find the Smallest Element in an Array

Write a program to find the smallest element in an array.

Answer:

java

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}

5. Check if Two Strings Are Anagrams

Write a program to check if two strings are anagrams of each other.

Answer:

java

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = Arrays.equals(
            str1.chars().sorted().toArray(),
            str2.chars().sorted().toArray()
        );
        System.out.println(isAnagram);
    }
}

6. Fibonacci Series

Write a program to generate the Fibonacci series up to a given number.

Answer:

java

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}

7. Factorial of a Number

Write a program to find the factorial of a number.

Answer:

java

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}

8. Find the GCD of Two Numbers

Write a program to find the GCD of two numbers.

Answer:

java

public class GCD {
    public static void main(String[] args) {
        int a = 60;
        int b = 48;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}

9. Find the LCM of Two Numbers

Write a program to find the LCM of two numbers.

Answer:

java

public class LCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 15;
        int gcd = 1;
        int lcm = (a * b) / gcd(a, b);
        System.out.println(lcm);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

10. Merge Two Sorted Arrays

Write a program to merge two sorted arrays into one sorted array.

Answer:

java

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(merged));
    }
}

11. Find the Missing Number in Array

Write a program to find the missing number in a given array containing numbers from 1 to n.

Answer:

java

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        System.out.println(totalSum - arraySum);
    }
}

12. Rotate Array

Write a program to rotate an array by a given number of positions.

Answer:

java

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }
}

13. Find Duplicates in Array

Write a program to find duplicate elements in an array.

Answer:

java

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 5};
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println(num);
            }
        }
    }
}

14. Find the Intersection of Two Arrays

Write a program to find the intersection of two arrays.

Answer:

java

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        System.out.println(intersection);
    }
}

15. Find the Union of Two Arrays

Write a program to find the union of two arrays.

Answer:

java

import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        Set<Integer> union = new HashSet<>();
        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            union.add(num);
        }
        System.out.println(union);
    }
}

16. Implement Binary Search

Write a program to implement binary search on a sorted array.

Answer:

java

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                return;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Element not found");
    }
}

17. Implement a Linked List

Write a program to implement a singly linked list.

Answer:

java

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;
    
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }
    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.printList();
    }
}

18. Detect a Loop in Linked List

Write a program to detect a loop in a linked list.

Answer:

java

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListLoopDetection {
    Node head;
    
    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        LinkedListLoopDetection list = new LinkedListLoopDetection();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = list.head.next; // Creating a loop
        
        System.out.println(list.hasLoop());
    }
}

19. Find the Length of a Linked List

Write a program to find the length of a linked list.

Answer:

java

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListLength {
    Node head;
    
    public int length() {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
    
    public static void main(String[] args) {
        LinkedListLength list = new LinkedListLength();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        
        System.out.println(list.length());
    }
}

20. Merge Two Sorted Linked Lists

Write a program to merge two sorted linked lists.

Answer:

java

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedLists {
    public static Node merge(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        
        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }
        
        return dummy.next;
    }
    
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);
        
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);
        
        Node merged = merge(l1, l2);
        printList(merged);
    }
}

21. Remove Duplicates from Sorted Linked List

Write a program to remove duplicates from a sorted linked list.

Answer:

java

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicates {
    public static Node removeDuplicates(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
    
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);
        
        head = removeDuplicates(head);
        printList(head);
    }
}

22. Detect a Cycle in a Graph

Write a program to detect a cycle in a directed graph.

Answer:

java

import java.util.*;

public class GraphCycleDetection {
    private Map<Integer, List<Integer>> graph = new HashMap<>();
    
    public void addEdge(int start, int end) {
        graph.computeIfAbsent(start, k -> new ArrayList<>()).add(end);
    }
    
    public boolean hasCycle() {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> stack = new HashSet<>();
        
        for (Integer node : graph.keySet()) {
            if (hasCycleUtil(node, visited, stack)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean hasCycleUtil(int node, Set<Integer> visited, Set<Integer> stack) {
        if (stack.contains(node)) {
            return true;
        }
        if (visited.contains(node)) {
            return false;
        }
        
        visited.add(node);
        stack.add(node);
        
        for (Integer neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (hasCycleUtil(neighbor, visited, stack)) {
                return true;
            }
        }
        
        stack.remove(node);
        return false;
    }
    
    public static void main(String[] args) {
        GraphCycleDetection graph = new GraphCycleDetection();
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        
        System.out.println(graph.hasCycle());
    }
}

23. Serialize and Deserialize a Binary Tree

Write a program to serialize and deserialize a binary tree.

Answer:

java

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
    }
}

public class SerializeDeserializeTree {
    public String serialize(TreeNode root) {
        if (root == null) return "null";
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }
    
    public TreeNode deserialize(String data) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList(data.split(",")));
        return deserializeHelper(list);
    }
    
    private TreeNode deserializeHelper(LinkedList<String> list) {
        String val = list.removeFirst();
        if (val.equals("null")) return null;
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = deserializeHelper(list);
        node.right = deserializeHelper(list);
        return node;
    }
    
    public static void main(String[] args) {
        SerializeDeserializeTree codec = new SerializeDeserializeTree();
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        
        String serialized = codec.serialize(root);
        System.out.println(serialized);
        
        TreeNode deserialized = codec.deserialize(serialized);
        System.out.println(codec.serialize(deserialized));
    }
}

24. Lowest Common Ancestor in Binary Tree

Write a program to find the lowest common ancestor of two nodes in a binary tree.

Answer:

java

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
    }
}

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        
        LowestCommonAncestor lca = new LowestCommonAncestor();
        TreeNode p = root.left; // 5
        TreeNode q = root.left.right.right; // 4
        
        TreeNode ancestor = lca.lowestCommonAncestor(root, p, q);
        System.out.println(ancestor.val);
    }
}

25. Binary Tree Level Order Traversal

Write a program to perform level order traversal of a binary tree.

Answer:

java

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
    }
}

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(level);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        LevelOrderTraversal lot = new LevelOrderTraversal();
        List<List<Integer>> result = lot.levelOrder(root);
        System.out.println(result);
    }
}

26. Find Diameter of Binary Tree

Write a program to find the diameter of a binary tree.

Answer:

java

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
    }
}

public class DiameterOfBinaryTree {
    int diameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    
    private int height(TreeNode node) {
        if (node == null) return 0;
        
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        
        diameter = Math.max(diameter, leftHeight + rightHeight);
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        DiameterOfBinaryTree diameterFinder = new DiameterOfBinaryTree();
        System.out.println(diameterFinder.diameterOfBinaryTree(root));
    }
}

27. Flatten a Binary Tree

Write a program to flatten a binary tree to a linked list.

Answer:

java

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
    }
}

public class FlattenBinaryTree {
    public void flatten(TreeNode root) {
        flattenHelper(root);
    }
    
    private TreeNode flattenHelper(TreeNode node) {
        if (node == null) return null;
        
        TreeNode leftTail = flattenHelper(node.left);
        TreeNode rightTail = flattenHelper(node.right);
        
        if (leftTail != null) {
            leftTail.right = node.right;
            node.right = node.left;
            node.left = null;
        }
        
        return rightTail != null ? rightTail : (leftTail != null ? leftTail : node);
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        
        FlattenBinaryTree flatten = new FlattenBinaryTree();
        flatten.flatten(root);
        
        TreeNode current = root;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.right;
        }
    }
}

28. Check if Binary Tree is Balanced

Write a program to check if a binary tree is balanced.

Answer:

java

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
    }
}

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }
    
    private int checkBalance(TreeNode node) {
        if (node == null) return 0;
        
        int leftHeight = checkBalance(node.left);
        if (leftHeight == -1) return -1;
        
        int rightHeight = checkBalance(node.right);
        if (rightHeight == -1) return -1;
        
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        
        BalancedBinaryTree checker = new BalancedBinaryTree();
        System.out.println(checker.isBalanced(root));
    }
}

29. Convert a Binary Search Tree to a Greater Tree

Write a program to convert a binary search tree to a greater tree where each node's value is replaced by the sum of all nodes' values greater than or equal to the node's value.

Answer:

java

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
    }
}

public class ConvertToGreaterTree {
    private int sum = 0;
    
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }
    
    private void traverse(TreeNode node) {
        if (node == null) return;
        
        traverse(node.right);
        sum += node.val;
        node.val = sum;
        traverse(node.left);
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);
        
        ConvertToGreaterTree converter = new ConvertToGreaterTree();
        converter.convertBST(root);
        
        printInOrder(root);
    }
    
    private static void printInOrder(TreeNode root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
}

30. Binary Tree Inorder Traversal

Write a program to perform inorder traversal of a binary tree.

Answer:

java

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
    }
}

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }
    
    private void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        inorderHelper(node.left, result);
        result.add(node.val);
        inorderHelper(node.right, result);
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        
        InorderTraversal traversal = new InorderTraversal();
        List<Integer> result = traversal.inorderTraversal(root);
        System.out.println(result);
    }
}

31. Merge Intervals

Write a program to merge overlapping intervals.

Answer:

java

import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        merged.add(current);
        
        for (int[] interval : intervals) {
            if (interval[0] <= current[1]) {
                current[1] = Math.max(current[1], interval[1]);
            } else {
                current = interval;
                merged.add(current);
            }
        }
        
        return merged.toArray(new int[merged.size()][]);
    }
    
    public static void main(String[] args) {
        MergeIntervals solution = new MergeIntervals();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merged = solution.merge(intervals);
        
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

32. Find the Missing Number

Write a program to find the missing number in an array containing numbers from 1 to n.

Answer:

java

public class FindMissingNumber {
    public int findMissingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n + 1) * (n + 2) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        FindMissingNumber finder = new FindMissingNumber();
        int[] nums = {1, 2, 4, 5};
        System.out.println(finder.findMissingNumber(nums));
    }
}

33. Find the Duplicate Number

Write a program to find the duplicate number in an array containing numbers from 1 to n with one duplicate.

Answer:

java

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) break;
        }
        
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }
    
    public static void main(String[] args) {
        FindDuplicateNumber finder = new FindDuplicateNumber();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(finder.findDuplicate(nums));
    }
}

34. Rotate an Array

Write a program to rotate an array to the right by k steps.

Answer:

java

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        RotateArray rotator = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotator.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}

35. Reverse Words in a String

Write a program to reverse the words in a string.

Answer:

java

public class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
    
    public static void main(String[] args) {
        ReverseWords reverser = new ReverseWords();
        String s = "the sky is blue";
        System.out.println(reverser.reverseWords(s));
    }
}

36. Longest Substring Without Repeating Characters

Write a program to find the length of the longest substring without repeating characters.

Answer:

java

import java.util.*;

public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;
        
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        LongestSubstringWithoutRepeating finder = new LongestSubstringWithoutRepeating();
        String s = "abcabcbb";
        System.out.println(finder.lengthOfLongestSubstring(s));
    }
}

37. Valid Parentheses

Write a program to check if a string containing just the characters '(', ')', '{', '}', '[' and ']' is valid.

Answer:

java

import java.util.*;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                char top = stack.isEmpty() ? '#' : stack.pop();
                if (top != map.get(c)) return false;
            } else {
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        ValidParentheses validator = new ValidParentheses();
        String s = "()[]{}";
        System.out.println(validator.isValid(s));
    }
}

38. Merge Two Sorted Arrays

Write a program to merge two sorted arrays into one sorted array.

Answer:

java

import java.util.Arrays;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
    
    public static void main(String[] args) {
        MergeSortedArrays merger = new MergeSortedArrays();
        int[] nums1 = new int[6];
        nums1[0] = 1


