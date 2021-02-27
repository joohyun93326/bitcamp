import java.util.Stack;

import kr.or.bit.MyStack;

/*
 * JAVA API
 * Stack Queue 제공 
 */

public class Ex05_Stack_Collection {

    public static void main(String[] args) {
        /*
        Stack s = new Stack(); //JAVA API가 제공
        s.push("A");
        s.push("B");
        System.out.println(s.pop());
        System.out.println(s.pop());
        //System.out.println(s.pop()); java.util.EmptyStackException 
        System.out.println(s.isEmpty());
         */
        
        //내가 만든 스택 MyStack 
        MyStack my = new MyStack(5); //비어있는 상태 
        System.out.println(my.isEmpty()); //true
        System.out.println(my.isFull()); //false 
        my.push("A");
        my.push("B");
        my.push("C");
        my.push("D");
        my.push("E");
        //my.push("F");
        
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        
        
    }

}
