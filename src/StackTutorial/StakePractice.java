package StackTutorial;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StakePractice {
    public static void main(String[] args) {
//        Stack<Integer> stack1  = new Stack<>();
//        stack1.push(10);
//        stack1.push(11);
//        stack1.push(12);
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
        Queue<Integer> aa = new LinkedList<>();
        aa.add(11);
        aa.add(12);
        aa.add(13);
        aa.remove();
        System.out.println(aa.remove());

    }
}
