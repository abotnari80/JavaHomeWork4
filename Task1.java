//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.Queue;
import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 6, 2};
        Task1(array);
    }

    public static void Task1(int[] array) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println(stack);
    }

//    public static void Task2(int[] args) {
//        int[] array = {5, 3, 8, 6, 2};
//        Queue<String> queue = new LinkedList<>();
//        Collections.addAll(queue, array);
//	    System.out.println(queue);
//    }
}
