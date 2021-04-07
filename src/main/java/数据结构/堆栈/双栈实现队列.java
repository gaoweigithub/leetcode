package 数据结构.堆栈;

import java.util.Stack;

public class 双栈实现队列 {

    public static void main(String[] args) {
        双栈实现队列 dd = new 双栈实现队列();

        dd.push(1);
        dd.push(2);
        dd.push(3);
        dd.push(4);
        dd.push(5);

        System.out.println(dd.pop());
        System.out.println(dd.pop());
        System.out.println(dd.pop());
        System.out.println(dd.pop());

        dd.push(6);

        System.out.println(dd.pop());
        System.out.println(dd.pop());


    }

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(Integer num){
        stack1.push(num);
    }

    public Integer pop(){

        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
